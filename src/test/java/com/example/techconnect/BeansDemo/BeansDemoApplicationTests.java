package com.example.techconnect.BeansDemo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class BeansDemoApplicationTests {

	@Autowired
	GreetingService defaultGreetingService;

	@Test
	void contextLoads() {
	}

	@Test
	public void conSayGoodAfternoon() {
		GreetingService greetingService = new GreetingService("afternoon");
		String response = greetingService.greet("Amy");
		assertEquals("Good afternoon, Amy!", response);
	}

	@Test
	public void canSayGoodEvening() {
		GreetingService greetingService = new GreetingService("evening");
		String response = greetingService.greet("Amy");
		assertEquals("Good evening, Amy!", response);
	}

	@Test
	public void defaultServiceCanSayGoodMorning() {
		String response = defaultGreetingService.greet("Amy");
		assertEquals("Good morning, Amy!", response);
	}

}
