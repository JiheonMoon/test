package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.ResponseDTO;
import com.example.demo.dto.TestRequestBody;

@RestController
//controller = responseBody 합친것
//모든 메서드에 @ResponseBody가 적용되어있는 상태

@RequestMapping("test") //localhost:9090/test 접속시 이 컨트롤러로 들어옴
public class TestController {
	
	@GetMapping("/testGetMapping")
	public String testControllerWithPath() {
		return "Hello World testGetMapping";
	}
	
	@GetMapping("/{id}")
	public String testControllerWidthPathVariables(@PathVariable(required=false)int id) {
		return "Hello world! ID"+id;
	}
	
	@GetMapping("/testRequestParam")
	public String testControllerRequestParam(@RequestParam(required=false)int id) {
		return "Hello World! ID" + id;
	}
	
	//요청 바디에 데이터가 넘어왔을때 -> 자바 객체로 변환 사용
	@GetMapping("/testRequestBody")
	public String testControllerRequestBody(@RequestBody TestRequestBody testRequestBodyDTO) {
		return "Hello World! ID"+testRequestBodyDTO.getId() + " Message : " + testRequestBodyDTO.getMessage();
	}
	
	//응답 바디에 데이터를 넘기는것
	@GetMapping("/testResponseBody")
	public ResponseDTO<String> testControllerResponseBody(){
		List<String> list = new ArrayList<>();
		list.add("Hellow World! I'm ResponseDTO");
		ResponseDTO<String>response = ResponseDTO.<String>builder().data(list).build();
		return response;
	}
	
	//ResponseEntity
	//HTTP 응답을 보다 세밀하게 제어할수 있음
	//HTTP 상태코드, 헤더, 바디를 구성할수 있다
	@GetMapping("/testResponseEntity")
	public ResponseEntity<?> testControllerResponseEntity(){
		List<String> list = new ArrayList<>();
		list.add("Hellow World! I'm ResponseEntity. And you got 400");
		ResponseDTO<String>response = ResponseDTO.<String>builder().data(list).build();
		//http status를 400으로 설정
		return ResponseEntity.badRequest().body(response);
	}
}
