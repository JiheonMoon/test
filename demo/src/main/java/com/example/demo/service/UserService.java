package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.UserEntity;
import com.example.demo.presistence.UserRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class UserService {
	
	@Autowired //스프링이 UserRepository 타입의 bean을 자동으로 주입해줌
	private UserRepository repository;
	
	//유저를 생성하려는 메서드
	public UserEntity create(UserEntity userEntity) {
		// 주어진 UserEntity가 null이거나 username이 null인 경우, 예외를 던진다.
		if(userEntity == null||userEntity.getUsername() == null) {
			//유효하지 않은 진자에 대해 예외 발생시킴
			throw new RuntimeException("Invalid arguments");
		}
		
		final String username = userEntity.getUsername();
		
		//주어진 username이 이미 존재하는 경우, 경로로그를 남기고 예외처리
		if(repository.existsByUsername(username)) {
			log.warn("Username already exists {}",username);
			throw new RuntimeException("Username already exists");
		}
		
		//username이 중복되지 않았다면, UserEntity를 데이터베이스에 저장
		return repository.save(userEntity);
	}
	
	//주어진 username과 password로 UserEntity 조회하기
	public UserEntity getByCredentials(String username, String password) {
		return repository.findByUsernameAndPassword(username, password);
	}
	
}
