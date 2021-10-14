package com.example.msbogper.dto;

public class Greething {

	private int id;
	private String content;

	public Greething(int id, String content) {
		this.id = id;
		this.content = content;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}