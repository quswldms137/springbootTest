package com.green.evalBbs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EvalBbsController {
	@RequestMapping("/")
	public String root() {
		return "index";
	}
}
