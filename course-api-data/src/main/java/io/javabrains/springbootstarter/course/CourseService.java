package io.javabrains.springbootstarter.course;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {

	/* Create instance of CourseRepository with instance of CourseService */
	@Autowired
	private CourseRepository courseRepository;

	public List<Course> getAllCourses(String topicId) {
		List<Course> courses = new ArrayList<>();
		// courseRepository.findAll().forEach(courses::add);
		courseRepository.findByTopicId(topicId).forEach(courses::add);
		return courses;
	}

	/* Non-hard-coded version with Repository, uses embedded Derby DB
	VIDEO SERIES UPDATE: CRUD Repo no longer uses .findOne */
	public Course getCourse(String id) {
		courseRepository.findByName("__"); // CourseRepository.java
		return courseRepository.findById(id).orElse(null);
	}

	public void addCourse(Course course) {
		courseRepository.save(course);
	}

	/* Save can both Create and Update from CRUD Repository */
	public void updateCourse(Course course) {
		courseRepository.save(course);
	}

	public void deleteCourse(String id) {
		courseRepository.deleteById(id);
	}
}

