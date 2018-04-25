package org.hoon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.java.Log;

@Controller
@RequestMapping("/boards/")
@Log
public class WebBoardController {
	
	@GetMapping("/list")
	public void list() {
		log.info("list(); called...");
	}
	
	@GetMapping("/login")
	public void login() {
		log.info("login(); called.");
	}
}
