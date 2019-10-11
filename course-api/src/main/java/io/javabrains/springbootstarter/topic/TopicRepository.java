package io.javabrains.springbootstarter.topic;

import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends CrudRepository<Topic, String> {
	// getAllTopics
	// getTopic(String id)
	// updateTopic(Topic t)
	// deleteTopic(String id)
	/* Framework knows about entity, private String variables mapped to columns, and even REST methods
	Spring Data JPA will be providing the REST HTTP requests */
}
