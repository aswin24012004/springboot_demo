package com.example.springboot_demo;

import org.springframework.stereotype.Component;

@Component
public class Owner {
	private int cid;
	private String cname;
	
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	
	public void show() {
		System.out.println("Hello from Owner");
		}
}
