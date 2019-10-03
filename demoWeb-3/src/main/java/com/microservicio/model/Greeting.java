package com.microservicio.model;

public class Greeting {
	private long id;
	private String content;
	
	
	
	public Greeting(long incrementAndGet, String format) {
		this.id = incrementAndGet;
		this.content=format;
		// TODO Auto-generated constructor stub
	}
	public long getId() {
		return id;
	}
	public String getContent() {
		return content;
	}

}
