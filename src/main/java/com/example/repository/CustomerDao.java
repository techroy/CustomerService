package com.example.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.entity.Customer;

public interface CustomerDao extends CrudRepository<Customer, Integer> {

	Customer findByName(String name);
	
	Customer findByNameAndAddress(String name,String address);
}
