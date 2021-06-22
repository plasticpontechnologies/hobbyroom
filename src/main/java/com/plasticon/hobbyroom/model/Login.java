package com.plasticon.hobbyroom.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "login")
public class Login {
	@Id
	private int id;
	private String userName;
	private String password;
}
