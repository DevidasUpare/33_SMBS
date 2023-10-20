package com.tcs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class InfoController {

	@GetMapping("/course/{cname}/info")
	public String getCourseInfo(@PathVariable("cname") String cname, Model model) {
		String msgTxt = cname + " New Batch Starts Next Week....!!!";
		model.addAttribute("msg", msgTxt);
		return "index";
	}

}
