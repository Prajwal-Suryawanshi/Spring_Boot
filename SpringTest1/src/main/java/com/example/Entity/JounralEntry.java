package com.example.Entity;

public class JounralEntry {

	private long id;
	private String name;
	private String content;
	
	
	public JounralEntry() {
		super();
		// TODO Auto-generated constructor stub
	}
	public JounralEntry(long id, String name, String content) {
		super();
		this.id = id;
		this.name = name;
		this.content = content;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	
	
	
	
}
