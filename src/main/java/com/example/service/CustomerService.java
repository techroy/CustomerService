package com.example.service;

import java.util.List;

import com.example.entity.Customer;

public interface CustomerService {

	public List<Customer> findAll();
	
	public boolean create(Customer customer);
	
	public Customer fndById(int id);
	
	public Customer fndByName(String name);
	
	public Customer fndByNameAndAddr(String name,String addr);
	
}
