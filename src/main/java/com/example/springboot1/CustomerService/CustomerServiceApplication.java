package com.example.springboot1.CustomerService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



//@RestController
//@Controller
//@EnableAutoConfiguration
//@ComponentScan(basePackages="com.example")
@SpringBootApplication(scanBasePackages="com.example")
public class CustomerServiceApplication {

	/*@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public @ResponseBody String greet() {

		return "helloworld";
	}*/

	public static void main(String[] args) {
		SpringApplication.run(CustomerServiceApplication.class, args);
	}
	
	
	
}
