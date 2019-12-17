package com.c2p.bankapplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

public class UserDetailsImpl implements UserDetailsInterface {

	@Autowired
	private RestTemplate restTemplate;
	@Override
	public int open(String username, String password, double amount, String adderess, double phone) {
		
		return 0;
	}

	@Override
	public String withdraw(int acno, String uname, String pwd, int amt) {
		
		return null;
	}

	@Override
	public String deposit(int acno, String uname, String pwd, int amt) {
		
		return null;
	}

	@Override
	public String transfer(int acno, String uname, String pwd, int tacno, int amt) {
		
		return null;
	}

	@Override
	public String close(int acno, String uname, String pass) {
		
		return null;
	}

	@Override
	public String balance(int acno, String uname, String pass) {
		
		return null;
	}
}
