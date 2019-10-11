package io.javabrains.springbootstarter.topic;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity // tells JPA that this is an entity class and to create a table called Topic with three text columns
public class Topic {

	@Id // variable becomes the primary key column
	private String id;
	private String name;
	private String desc;

	public Topic() { // no arg constructor to make object easier to initialize
		
	}

	public Topic(String id, String name, String desc) {
		super();
		this.id = id;
		this.name = name;
		this.desc = desc;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
}
