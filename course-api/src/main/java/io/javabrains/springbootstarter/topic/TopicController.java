package io.javabrains.springbootstarter.topic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {

	@Autowired
	private TopicService tService;

	@RequestMapping("/topics")
	public List<Topic> getAllTopics() {
		return tService.getAllTopics();
	}
	
	@RequestMapping("/topics/{id}")
	public Topic getTopic(@PathVariable String id) {
		return tService.getTopic(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/topics") // map this method to any POST request on /topics
	/* Request payload contains JSON representation of Topic instance,
	takes Request Body, converts it into Topic instance, then passes it to addTopic */
	public void addTopic(@RequestBody Topic topic) {
		tService.addTopic(topic);
	}
	@RequestMapping(method=RequestMethod.PUT, value="/topics/{id}") // map this method to specified PUT request on /topics
	/* Request payload contains JSON representation of Topic instance,
	takes Request Body, converts it into Topic instance, then passes it to updateTopic */
	public void updateTopic(@RequestBody Topic topic, @PathVariable String id) {
		tService.updateTopic(id, topic);
	}
	@RequestMapping(method=RequestMethod.DELETE, value="/topics/{id}") // map this method to specified PUT request on /topics
	public void deleteTopic(@PathVariable String id) {
		tService.deleteTopic(id);
	}
}
