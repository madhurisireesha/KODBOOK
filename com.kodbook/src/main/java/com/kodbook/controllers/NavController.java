package com.kodbook.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
@Controller
public class NavController {
		@GetMapping("/openSignUp")
		public String openSignUp() {
			return "signUp";
		}
		@GetMapping("/")
		public String newPost() {
			return "newpost";
		}
}
