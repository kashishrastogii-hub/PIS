package com.mycompany.firstapp;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class SumController {

	@GetMapping("/api/sum")
	public int add(@RequestParam int a, @RequestParam int b) {
		log.info("Adding values a={} and b={}", a, b);
		int result = a + b;
		log.info("Returning sum with a={}, b={}, sum={}", a, b, result);
		return result;
	}
}