package com.kh.app.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("board")
public class BoardController {
	
	@GetMapping("list")
	public String write() {
		return "board/list";
	}
	

}
