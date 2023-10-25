package com.home.exp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.home.exp.controller.service.MemoService;

@Controller
public class MemoController {
	
	@Autowired
	MemoService service;

	@GetMapping ("/memo")
	public String memo() {
		return "common/memo";
	}
	
	@PostMapping ("/memo")
	public String memoSave(String content) {
		service.memoS(content);
		return "common/memo";
	}
}
