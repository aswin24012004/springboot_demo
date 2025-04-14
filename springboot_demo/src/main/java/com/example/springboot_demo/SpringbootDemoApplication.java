package com.example.springboot_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringbootDemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext var = SpringApplication.run(SpringbootDemoApplication.class, args);
		Customer c = var.getBean(Customer.class);
		Owner o = var.getBean(Owner.class);
		ShopKeeper s = var.getBean(ShopKeeper.class);
		
		c.show();
		o.show();
		s.show();
	}

}
