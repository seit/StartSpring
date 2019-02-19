package com.uent192837465.startapp.ui.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;
import org.springframework.util.ObjectUtils;

public class EqualsPropertyValuesValidator implements ConstraintValidator<EqualsPropertyValues, Object> {

	private String property;
	private String comparingProperty;
	private String message;

	public void initialize(EqualsPropertyValues constraintAnnotation) {
		this.property = constraintAnnotation.property();
		this.comparingProperty = constraintAnnotation.comparingProperty();
		this.message = constraintAnnotation.message();
	}

	@Override
	public boolean isValid(Object value, ConstraintValidatorContext context) {
		BeanWrapper wrapper = new BeanWrapperImpl(value);
		Object propertyValue = wrapper.getPropertyValue(property);
		Object comparingPropertyValue = wrapper.getPropertyValue(comparingProperty);
		boolean matched = ObjectUtils.nullSafeEquals(propertyValue, comparingPropertyValue);
		if(matched) {
			// ユーザ名とパスワードが同じ場合はエラー。
			context.disableDefaultConstraintViolation();
			context.buildConstraintViolationWithTemplate(message).addPropertyNode(property).addConstraintViolation();
			return false;
		}
		return true;
	}

}
