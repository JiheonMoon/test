package ex06_Calendar;

import java.util.Calendar;

public class Ex01_Calendar {
	public static void main(String[] args) {
		//java.util 패키지에 있는 날짜와 시간 정보를 제공해주는 클래스
		//객체를 만들때 new와 생성자를 이용하여 선언하지 않고
		//생성된 객체를 받아오는 형식으로 선언한다.
		
		Calendar cal = Calendar.getInstance();
		
		//Calendar 클래스의 속성
		//YEAR,MONTH,DATE 연,월(0-11),일(1-31)을 나타내는 상수
		//DAY_OF_MONTH 현재 달의 몇번째 날인지 나타내는 상수
		//DAY_OF_WEEK 현재 주의 몇번째 요일인지 나타내는 상수(1-7), 1이 일요일
		//HOUR, MINUTE 시, 분을 나타내는 상수
		//SECOND, MILLISECOND 초, 밀리초를 나타내는 상수
		//HOUR_OF_DAY 현재 날의 시각을 의미하는 상수
		//AM_PM HOUR가 정오보다 이전이면 0, DLGNDLAUS 1의 값을 가지는 상수
		//WEEK_OF_MONTH 현재 달의 몇번째 주인지 나타내는 상수
		//WEEK_OF_YEAR 현재 해의 몇번째 주인지 나타내는 상수
		
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		int day = cal.get(Calendar.DAY_OF_MONTH);
		System.out.printf("오늘 날짜는 %d년 %d월 %d일 입니다\n", year, month, day);
	}
}
