package io.javabrains.springbootstarter.course;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.javabrains.springbootstarter.topic.Topic;

@RestController
public class CourseController {

	@Autowired
	private CourseService cService;

	@RequestMapping("/topics/{id}/courses")
	public List<Course> getAllCourses(@PathVariable String id) {
		return cService.getAllCourses(id);
	}
	
	@RequestMapping("/topics/{topicId}/courses/{id}")
	public Course getCourse(@PathVariable String id) {
		return cService.getCourse(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/topics/{topicId}/courses") // map this method to any POST request on /courses
	/* Request payload contains JSON representation of Course instance,
	takes Request Body, converts it into Course instance, then passes it to addCourse */
	public void addCourse(@RequestBody Course course, @PathVariable String topicId) {
		course.setTopic(new Topic(topicId, "", ""));
		cService.addCourse(course);
	}
	@RequestMapping(method=RequestMethod.PUT, value="/topics/{topicId}/courses/{id}") // map this method to specified PUT request on /courses
	/* Request payload contains JSON representation of Course instance,
	takes Request Body, converts it into Course instance, then passes it to updateCourse */
	public void updateCourse(@RequestBody Course course, @PathVariable String topicId, @PathVariable String id) {
		cService.updateCourse(course);
	}
	@RequestMapping(method=RequestMethod.DELETE, value="/topics/{topicId}/courses/{id}") // map this method to specified PUT request on /courses
	public void deleteCourse(@PathVariable String id) {
		cService.deleteCourse(id);
	}
}
