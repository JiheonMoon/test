package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.model.TodoEntity;
import com.example.demo.presistence.TodoRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@RequiredArgsConstructor
public class TodoService {
	
	//TodoRepository 주입
	private final TodoRepository repository;
	
	//메서드 형태로 비지니스 로직을 구현
	public String testService() {
		//TodoEntity 생성
		TodoEntity entity = TodoEntity.builder().title("My first todo item").build();
		//TodoEntity 저장
		//save() insert
		repository.save(entity);
		//TodoEntity 검색
		//findById(entity.getId()) 기본키를 이용해 db에 저장된 TodoEntity찾기
		TodoEntity savedEntity  = repository.findById(entity.getId()).get();
		return savedEntity.getTitle();
	}
	
	//controller에서 넘어온 데이터를 검증하고 Todo 테이블에 저장
	//데이터를 추가하고, 추가가 잘됐는지 확인하는 로직
	public List<TodoEntity> create(TodoEntity entity){
		
		validate(entity);
		
		//넘어온 Entity에 문제가 없을때 db에 추가
		repository.save(entity);
		
		//{}는 Slf4j 제공하는 플레이스 홀더로, 두번째 매개변수로 전달된 entity.getId()와 같이 대입되어 출력
		log.info("Entity Id : {} is saved", entity.getId());
		
		//넘어온 entity로 부터 userId를 가지고 db에서 조회된 내용을 List에 묶어서 반환
		return repository.findByUserID(entity.getUserId());
	}

	//userId를 넘겨받아 해당 유저가 추가한 Todo를 모두 조회하는 메서드
	public List<TodoEntity> retrieve(String userId){
		return repository.findByUserID(userId);
	}
	
	//Entity를 수정하고, 수정한 entity를 확인할수 있는 update 메서드
	//TodoEntity entity 매개변수는 수정된 값이 들어있다.
	public List<TodoEntity> update(TodoEntity entity){
		//1.수정할 entity가 유효한지 확인
		//존재하지 않는 entity는 업데이트 할수 없음
		validate(entity);
		Optional<TodoEntity> original = repository.findById(entity.getId());
		
//		original.ifPresent(todo -> {
//			//반환된 TodoEntity가 존재하면 값을 새 Entity로 덮어쓴다
//			todo.setTitle(entity.getTitle());
//			todo.setDone(entity.isDone());
//			//데이터베이스에 새 값 저장
//			repository.save(todo);
//		});
		if(original.isPresent()) {
			TodoEntity todo = original.get();
			todo.setTitle(entity.getTitle());
			todo.setDone(entity.isDone());
			//데이터베이스에 새 값 저장
			repository.save(todo);
		}
		//수정이 잘 됐는지 확인하기 위해 retrieve 메서드를 실행한 결과를 반환
		return retrieve(entity.getUserId());
	}
	
	public List<TodoEntity> delete(TodoEntity entity){
		//엔티티가 유효한지 확인
		validate(entity);
		try {
			repository.delete(entity);
			//엔티티를 삭제
		} catch (Exception e) {
			//예외발생시 id와 exception을 로그로 찍음
			log.error("error deleting entity " , entity.getId(), e);
			//컨트롤러로 exception을 날린다
			//데이터베이스 내부 로직을 캡슐화하기위해 e를 반환하지 않고 새 exception 객체를 반환한다
			throw new RuntimeException("error deleting entity " + entity.getId());
		}
		//새 TodoList를 가져와 반환
		return retrieve(entity.getUserId());
	}
	
	private void validate(TodoEntity entity) {
		//매개변수로 넘어온 entity가 유효한지 검사
		if(entity == null) {
			log.warn("Entity cannot be null");
			throw new RuntimeException("Entity cannot be null");
		}
		//userId가 안넘어 왔을때
		if(entity.getUserId() == null) {
			log.warn("Unknwon user");
			throw new RuntimeException("Unknown user");
		}
	}
}
