package com.example.core;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.core.services.PaymentService;

import static org.junit.Assert.*;

@SpringBootTest
class CoreApplicationTests {
	
	@Autowired
	PaymentService service;

	@Test
	void testDependencyInjection() {
		assertNotNull(service);
	}

}
