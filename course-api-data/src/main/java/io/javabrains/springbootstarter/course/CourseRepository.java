package io.javabrains.springbootstarter.course;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, String> {

	public List<Course> findByTopicId(String topicId);
	/* Declare needed method; name gives Spring Data JPA a filtering hint
	Find all courses with same name, filtering based on name */
	public List<Course> findByName(String name);
}
