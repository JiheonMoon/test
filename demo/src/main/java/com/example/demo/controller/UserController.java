package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.ResponseDTO;
import com.example.demo.dto.UserDTO;
import com.example.demo.model.UserEntity;
import com.example.demo.security.TokenProvider;
import com.example.demo.service.UserService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequestMapping("/auth")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private TokenProvider tokenProvider;
	
	//회원가입 -> 데이터베이스에 데이터를 추가
	@PostMapping("/signup")
	public ResponseEntity<?> registerUser(@RequestBody UserDTO userDTO){
		//requset body에 포함된 UserDTO객체를 수신하여 처리
		try {
			UserEntity user = UserEntity.builder().username(userDTO.getUsername())
								.password(userDTO.getPassword()).build();
			//UserService를 이용해 만든 UserEntity를 데이터베이스에 저장함
			UserEntity registeredUser = userService.create(user);
			
			//등록된 UserEntity 정보를 UserDTO로 변환하여 응답에 사용함
			UserDTO responseUserDTO = UserDTO.builder()
										.id(registeredUser.getId())
										.username(registeredUser.getUsername())
										.build();
			
			//성공적으로 전환된 유저정보를 포함한 HTTP 200응답을 반환한다
			
			return ResponseEntity.ok().body(responseUserDTO);
		} catch (Exception e) {
			//예외가 발생한 경우, 에러 메시지를 포함한 ReponseDTO 객체를 만들어 응답
			ResponseDTO responseDTO = ResponseDTO.builder().error(e.getMessage()).build();
			//HTTP 400 상태코드를 반환하고, 에러 메세지를 Response Body에 포함시킴
			return ResponseEntity.badRequest().body(responseDTO);
		}
	}
	
	@PostMapping("/signin")
	public ResponseEntity<?> authenticate(@RequestBody UserDTO userDTO){
		//요청 본문으로 전달된 userDTO의 username과 password를 기반으로 유저
		UserEntity user = userService.getByCredentials(userDTO.getUsername(), userDTO.getPassword());
		//사용자가 존재한다면
		if(user != null) {
			final String token = tokenProvider.create(user);
			//인증에 성공한다면 유저정보를 UserDTO로 변환하여 응답에 사용
			final UserDTO responseUserDTO = UserDTO.builder().id(user.getId()).username(user.getUsername()).token(token).build();
			return ResponseEntity.ok().body(responseUserDTO);
		}else {
			//유저가 존재하지 않거나, 인증 실패시 에러메세지를 포함한 ResponseDTO
			ResponseDTO responseDTO = ResponseDTO.builder().error("Login failed").build();
			
			//HTTP 400 상태코드를 반환하고, 에러메시지를 응답 본문에 포함
			return ResponseEntity.badRequest().body(responseDTO);
		}
		
		
	}
}
