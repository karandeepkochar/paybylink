package com.hcltech.paybylink.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountdetailController {
	
	@Autowired
	 public AccountdetailsDao service;
	
	@GetMapping("/accountdetails")
	public List<Accountdetails> retrieveallaccount() {
		return ((AccountdetailsDao) service).findall();
		}
	
	@GetMapping("/accountdetails/{accountno}")
	public List<Accountdetails> retrieveaccountbyaccountno(@PathVariable Long accountno) {
		return ((AccountdetailsDao) service).findone(accountno);
		}

	
	

}
