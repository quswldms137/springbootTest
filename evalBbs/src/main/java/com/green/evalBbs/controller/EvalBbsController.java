package com.green.evalBbs.controller;


import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.green.evalBbs.dao.IEvalBbsDao;
import com.green.evalBbs.dto.EvalBbsDto;

@Controller
public class EvalBbsController {
	@Autowired
	private IEvalBbsDao dao;
	
	@RequestMapping("/")
	public String root() {
		return "index";
	}
	@RequestMapping("/list")
	public String list(Model model) {
		model.addAttribute("list", dao.getList());   
		return "list";
	}
	@RequestMapping("writeForm")
	public String writeForm() {
		return "writeForm";
	}
	@RequestMapping("write")
	public String write(EvalBbsDto dto) {
		dao.write(dto);
		return "redirect:list";
	}
	@RequestMapping("detail")
	public String detail(@RequestParam("bno") String bno, Model model) {
		model.addAttribute("dto", dao.detail(bno));
		return "detail";
	}
}
