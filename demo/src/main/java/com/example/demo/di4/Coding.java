package com.example.demo.di4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

//코딩을 하려면 컴퓨터가 필요함
@Component
@RequiredArgsConstructor
@Getter
public class Coding {
	//@Autowired
	
	private Computer computer;
	
	
	//생성자 주입
	//생성자가 호출되는 시점 -> 객체가 만들어 질때 매개변수가 객체가 주입
//	public Coding(Computer computer) {
//		this.computer = computer;
//	}
	
	
//	//setter 주입
//	@Autowired
//	public void setComputer(Computer computer) {
//		this.computer = computer;
//	}
	

}
