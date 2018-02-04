package com.example.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.entity.Customer;
import com.example.repository.CustomerDao;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerDao customerDao;

	@Override
	public List<Customer> findAll() {

		Iterable<Customer> iterable = customerDao.findAll();
		List<Customer> customers = new ArrayList<Customer>();

		Iterator<Customer> it = iterable.iterator();

		while (it.hasNext()) {

			customers.add(it.next());

		}

		return customers;
	}

	@Override
	@Transactional
	public boolean create(Customer customer) {

		customerDao.save(customer);
		return true;
	}

	@Override
	public Customer fndById(int id) {

		return customerDao.findOne(id);
	}

	@Override
	public Customer fndByName(String name) {

		return customerDao.findByName(name);
	}

	@Override
	public Customer fndByNameAndAddr(String name, String addr) {

		return customerDao.findByNameAndAddress(name, addr);
	}

}
