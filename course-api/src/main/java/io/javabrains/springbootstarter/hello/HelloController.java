package io.javabrains.springbootstarter.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping("/hello") // tells Spring framework that specified GET HTTP request /hello executes this method
	public String sayHi () { return "Hi!"; }
}
