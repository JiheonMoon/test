package com.example.demo.di4;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ComputerTest {
	@Autowired
	Coding coding;
	
	@Test
	public void computerTest(){
		System.out.println(coding.getComputer().getRam());
	}
}
