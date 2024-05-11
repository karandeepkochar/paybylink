package com.hcltech.paybylink.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paymentservices.accountdetails.repository.Accountrepository;

@Service
public class AccountdetailsDao {
	
	@Autowired
	Accountrepository repository;
	
	 List<Accountdetails> accountdetail=new ArrayList();
	 
		public List<Accountdetails> findall(){
			return repository.findAll();
		}
	public List<Accountdetails> findone(double balance) {
		Predicate< Accountdetails> predicate=details->details.getAccountno().equals(accountdetail);
	 
		return accountdetail.stream().filter(predicate).get();
		
}
}
