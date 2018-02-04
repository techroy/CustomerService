package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Customer;
import com.example.service.CustomerService;
import com.example.util.DbConfig;

//@Controller
@RequestMapping("/customers")
@RestController
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	@Autowired
	private DbConfig dbConfig;

	@RequestMapping(value = "/search", method = RequestMethod.GET)
	public String search() {

		return "customerSearch--" + dbConfig.getDbUname();
	}

	// @RequestMapping(value="/findAll",method=RequestMethod.GET,produces="application/xml")
	@GetMapping(value = "/findAll")
	public List<Customer> findAll() {

		return customerService.findAll();
	}

	// @RequestMapping(value="/create",method=RequestMethod.POST)
	@PostMapping(value = "/create",consumes=MediaType.APPLICATION_JSON_VALUE)
	public boolean create(@RequestBody Customer customer) {

		return customerService.create(customer);
	}

	@GetMapping(value = "/findById/{id}",produces=MediaType.APPLICATION_JSON_VALUE)
	public Customer findById(@PathVariable String id) {

		return customerService.fndById(Integer.parseInt(id));
	}

	@GetMapping(value = "/findById")
	/*
	 * public Customer
	 * findByIdRequestPaaram(@RequestParam(name="id",required=false,defaultValue
	 * ="1") String cid)
	 */

	public Customer findByIdRequestPaaram(@RequestParam(name = "id") String cid) {

		return customerService.fndById(Integer.parseInt(cid));
	}

	@GetMapping(value = "/findByName/{nam}")
	public Customer findByName(@PathVariable(name = "nam") String name) {

		return customerService.fndByName(name);
	}

	@GetMapping(value = "/findByNameAndAddr/{name}/{addr}")
	public Customer findByNameAndAddr(@PathVariable String name, @PathVariable String addr) {

		return customerService.fndByNameAndAddr(name, addr);
	}

}
