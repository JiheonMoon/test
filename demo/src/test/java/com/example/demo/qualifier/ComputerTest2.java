package com.example.demo.qualifier;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

//테스트에 필요한 의존성 대신 제공
@SpringBootTest
public class ComputerTest2 {
	@Autowired
	Computer computer;//이자리에 Desktop, laptop이 모두 올수 있음
	@Test
	public void widthTest() {
		System.out.println(computer.getScreenWidth());
	}
	
}
