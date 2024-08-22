/*
 * CREATE TABLE 테이블명(
 * 	컬럼명 타입(길이),
 * 	컬럼명 타입(길이),
 * 	컬럼명 타입(길이),
 * 	컬럼명 타입(길이),
 * );
 * */
--이름
--VARCHAR2(100)
--NUMBER
CREATE TABLE TBL_MEMBER(
	NAME VARCHAR2(100),
	AGE NUMBER
);
-- 주의점
-- 컬럼이 여러개일때 콤마, 잘써야함
-- 사이에 공백 두지 않기
-- 같은 이름으로는 안만들어짐
-- 마지막에는 콤마 안붙임

CREATE TABLE TBL_CAR(
	ID NUMBER, --차량 식별번호
	BRAND VARCHAR2(100), --브랜드
	COLOR VARCHAR2(100), --색깔
	PRICE NUMBER, --가격
	CONSTRAINT CAR_PK PRIMARY KEY (ID) -- 테이블을 생성하면서 제약조건을 지정
);
--영구삭제이기 때문에 조심
DROP TABLE TBL_CAR;
DROP TABLE TBL_MEMBER;

-- 테이블명 : ex2_10
-- 속성1 : Col1 문자형 길이 10 null값 비허용
-- 속성2 : Col2 문자형 길이 10 null값 허용
-- 속성3 : Create_date 날짜타입 기본값 현재날짜(SYSDATE)

CREATE TABLE ex2_10(
	Col1 VARCHAR2(10) NOT NULL,
	Col2 VARCHAR2(10),
	Create_date DATE DEFAULT SYSDATE
);

-- 컬럼명 변경 Col1 -> Col11
-- alter table 테이블명 RENAME COLUMN 기존 컬럼명 TO 새로운 컬럼명;
ALTER TABLE EX2_10 RENAME COLUMN col1 TO col11;

-- 컬럼타입 변경
-- alter table 테이블명 modify 컬럼명 데이터타입;
ALTER TABLE EX2_10 MODIFY col2 varchar2(22);

-- 컬럼추가
-- alter table 테이블명 add 컬럼명 컬럼타입;
ALTER TABLE EX2_10 ADD col3 NUMBER;

-- 컬럼삭제
-- alter table 테이블명 drop column 컬럼명;
ALTER TABLE EX2_10 DROP COLUMN create_date;

-- 제약조건 추가
-- 테이블이 생성된 후 제약조건을 추가 or 삭제
-- alter table 테이블명 add constraint 제약조건명 제약조건종류(칼럼명);
ALTER TABLE EX2_10 ADD CONSTRAINT pk_ex2_10 PRIMARY KEY (col11);

-- 제약조건 삭제
-- alter table 테이블명 drop constraint 제약조건명;
ALTER TABLE EX2_10 DROP CONSTRAINT pk_ex2_10;

-- 테이블 생성
-- 테이블 tbl_Aniaml
-- id 숫자 기본키
-- "Type" 문자형 길이 100
-- age 숫자형 길이 3
-- feed 문자형 길이 100
CREATE TABLE tbl_animal(
	id NUMBER PRIMARY key,
	"TYPE" varchar2(100),
	age number(3),
	feed varchar2(100)
);

ALTER TABLE tbl_animal ADD CONSTRAINT pri PRIMARY KEY(id);

ALTER TABLE tbl_animal drop CONSTRAINT pri;

--제약조건 추가하기
--ID 컬럼에 animal_pk라는 이름으로 기본키 설정하기
ALTER TABLE tbl_animal ADD CONSTRAINT animal_pk PRIMARY KEY(id);

--tbl_animal 테이블 삭제하기
DROP TABLE TBL_ANIMAL;

--default와 check 제약조건
CREATE TABLE tbl_student(
	id NUMBER,--학번
	name varchar2(100), --이름
	major varchar2(100), --전공
	gender char(1) DEFAULT 'W' NOT NULL CONSTRAINT ban_char check(gender = 'M' OR gender = 'W'),
	birth DATE CONSTRAINT ban_date CHECK(birth >= TO_DATE('1980-01-01','yyyy-mm-dd')),
	CONSTRAINT std_pk PRIMARY KEY(id)
);