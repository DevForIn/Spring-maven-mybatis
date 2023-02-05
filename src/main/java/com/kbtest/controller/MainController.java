package com.kbtest.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kbtest.service.TmplService;

@RestController
public class MainController {

	@Resource(name="TmplService")
	private TmplService tmplService;
	
	@GetMapping("/")
	public void testPage() {
		System.out.println("test Page");
	}
	
	@GetMapping("/tmpl")
	public List<Map<String, Object>> testMainPage(){
		int tmplNum = 1;
		System.out.println("test");
		List<Map<String, Object>> map = tmplService.getTmpl(tmplNum);
		return map;
	}
	
}
