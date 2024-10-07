package com.example.demo.model;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

//Todo 테이블에 있는 내용을 담기위한 클래스
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity //자바클래스를 엔티티로 지정하기 위해 사용. 이름을 부여하고 싶다면 @Entity("TodoEntity")처럼 매개변수
@Table(name = "Todo") //테이블 이름을 지정하기 위해 @Table 어노테이션 사용
//이 엔티티는 데이터베이스의 Todo테이블에 매핑된다는 뜻
//만약 @Table을 추가하지 않거나, name을 명시하지 않으면 @Entity의 이름을 테이블로 간주함
//만약 @Entity의 이름도 지정하지 않는 경우 클래스의 이름을 테이블 이름으로 간주
public class TodoEntity {
	@Id //기본키가 될 필드에 지정
	@GeneratedValue(generator = "system-uuid") //어떻게 ID를 생성할지 지정
	@GenericGenerator(name = "system-uuid", strategy = "uuid") //나만의 제너레이터를 사용하고 싶을때 이용
	private String id; //이 객체의 id
	private String userId; //이 객체를 생성한 유저 아이디
	private String title; //Todo 타이틀
	private boolean done; //true Todo를 완료한 경우
}
