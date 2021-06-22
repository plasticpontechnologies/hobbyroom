package com.plasticon.hobbyroom.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.plasticon.hobbyroom.model.Login;
import com.plasticon.hobbyroom.service.LoginService;

@RestController
@RequestMapping(value = "/login")
public class LoginController {
	@Autowired
	LoginService loginService;

@PostMapping(value="/save",consumes="application/json")
public void save(@RequestBody Login login) {
	loginService.save(login);
}
}
