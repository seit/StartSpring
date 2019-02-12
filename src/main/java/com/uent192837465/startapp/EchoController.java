package com.uent192837465.startapp;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.uent192837465.startapp.form.EchoForm;

@Controller
@RequestMapping("echo")
public class EchoController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

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
