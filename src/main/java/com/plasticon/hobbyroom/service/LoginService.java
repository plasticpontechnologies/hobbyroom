package com.plasticon.hobbyroom.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plasticon.hobbyroom.model.Login;
import com.plasticon.hobbyroom.repository.LoginRepository;

@Service
public class LoginService {
	@Autowired
	LoginRepository loginRepository;

	public void save(Login login) {
		loginRepository.save(login);
	}
}
