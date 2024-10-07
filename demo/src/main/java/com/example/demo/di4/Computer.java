package com.example.demo.di4;

import org.springframework.stereotype.Component;

@Component
public class Computer {
	private int ram = 32;
	public int getRam() {
		return ram;
	}
}
