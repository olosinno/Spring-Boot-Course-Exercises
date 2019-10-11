package io.javabrains.springbootstarter.course;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import io.javabrains.springbootstarter.topic.Topic;

@Entity // tells JPA that this is an entity class and to create a table called Course with three text columns
public class Course {

	@Id // variable becomes the primary key column
	private String id;
	private String name;
	private String desc;
	@ManyToOne // JPA annotation from JavaX Persistence establishes relationship of Topic topic
	private Topic topic;

	public Course() { // no arg constructor to make object easier to initialize
		
	}

	public Course(String id, String name, String desc, String topicId) {
		super();
		this.id = id;
		this.name = name;
		this.desc = desc;
		this.topic = new Topic(topicId, "", ""); // creates new instance of topic with only id; name and desc are blank
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

	public Topic getTopic() {
		return topic;
	}

	public void setTopic(Topic topic) {
		this.topic = topic;
	}
}
