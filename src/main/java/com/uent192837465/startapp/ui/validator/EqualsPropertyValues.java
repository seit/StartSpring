package com.uent192837465.startapp.ui.validator;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

// 独自アノテーションクラス作成
@Documented
@Constraint(validatedBy = {EqualsPropertyValuesValidator.class})
@Target({ElementType.TYPE/*クラス,インタフェース,enumにい対して指定できるアノテーションであることを示す*/
	, ElementType.ANNOTATION_TYPE/*アノテーション型に対して指定できるアノテーションであることを示す*/})
// →EqualsPropertyValuesアノテーションはメソッドに対しては指定できないということになる。
@Retention(RetentionPolicy.RUNTIME)
public @interface EqualsPropertyValues {

	/*
	 * アノテーションの予約属性定義
	 */
	String message() default "{com.uent192837465.startapp.ui.validator.EqualsPropertyValues.message}";
	Class<?>[] groups() default{};
	Class<?extends Payload>[] payload() default{};

	String property();	//チェック対象のプロパティ
	String comparingProperty();	// 比較先のプロパティ

	@Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE})
	@Retention(RetentionPolicy.RUNTIME)
	@Documented
	public @interface List{
		EqualsPropertyValues[] value();
	}


}
