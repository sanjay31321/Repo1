package com.sanjay31321.sys.controller;

import java.util.Locale;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sanjay31321.sys.preset.DefaultDataInstall;
import com.sanjay31321.sys.preset.model.Install;

@Controller
public class DefaultDataController {
	private static final Logger logger = LoggerFactory.getLogger(DefaultDataController.class);
	
	@RequestMapping(value = "/install", method = RequestMethod.GET)
	public String getinstall(Locale locale, Install install) {
		logger.info("Welcome to Install Default Settings page ! GET METHOD : The client locale is {}.", locale);
		return "install";
	}
	
	@RequestMapping(value="/install", method=RequestMethod.POST)
	public String postinstall(@Valid  Install install, BindingResult result, Locale locale){
		logger.info("Welcome to Install Default Settings page ! POST METHOD : The client locale is {}.", locale);
		DefaultDataInstall settings = new DefaultDataInstall();
		settings.install();
		return "install";
	}
}
