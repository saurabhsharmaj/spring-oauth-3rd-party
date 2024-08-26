package com.example.auth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GithubAuthController {

	@GetMapping
	String getHealth() {
		return "ok";
	}
}
