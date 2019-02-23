package com.uent192837465.startapp.controller;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.uent192837465.startapp.form.EchoForm;

@Controller
@RequestMapping("echo")
public class EchoController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	// バリデーションのカスタマイズやバインディング処理のカスタマイズを行う。
	// 全コントローラに適用したい場合は@ControllerAdviceを使う。
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		// @NotNullのバリデーションチェックは、未入力は""(空文字)として扱うため、Nullチェックに引っかからない。
		// StringTrimmerEditorをtrueにすることで、""(空文字)をNullに変換してくれる。
		binder.registerCustomEditor(String.class, new StringTrimmerEditor(true));
	}

	@RequestMapping(method = RequestMethod.GET)
	public String viewInput(Model model){
		EchoForm form = new EchoForm();
		model.addAttribute(form);
		return "views/echo/input";
	}

	@RequestMapping(method = RequestMethod.POST)
	public String echo(@Valid EchoForm form, BindingResult result) {
		if(result.hasErrors()) {
			return "views/echo/input";
		}
		return "views/echo/output";
	}

}
