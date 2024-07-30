package ex03_variable;

public class Ex_Variable01 {

	public static void main(String[] args) {
		/*
		 * 변수
		 * 개발자는 프로그램에 필요한 값들을 메모리에 저장해두고 필요할때 꺼내서 사용
		 * 무질서하게 저장하는것이 아닌 규칙속에서 일부공간 할당
		 */
		
		//변수의 선언
		//변수 사용을 위해서는 변수 선언이 선행 두가지 정보가 필요
		//변수에 담을 데이터의 타입과 변수의 이름
		
		int number;
		
		/*변수명 명명 규칙
		 *1.숫자가 먼저 들어가면 안됨
		 *2.영어 대소문자를 구별함
		 *3.일반적으로 영어 소문자
		 *4._$이외의 특수문자 사용 불가
		 *5.예약어 금지(if,for,while 같은)
		 *6.한글은 쓰지 말것
		 *
		 *문자수의 제한이 없으므로 변수의 의미를 쉽게 파악할수 있도록 구체적으로 명명하는게 좋음
		 *
		 *표기법
		 *카멜표기법(camel case):두번째 단어부터 첫글자를 대문자로 표기 (userName, phoneNumber)
		 *스네이크표기법(snake case):모든 단어가 소문자로 시작하고 단어랑 단어사이는 _로 연결(user_name, phone_number)
		 */
		
		//변수에 데이터 대입하기: 데이터를 변수에 저장해두고 변수의 이름을 호출하여 그값사용
		//=기호 사용 우변의 값을 좌변에 대입
		
		int studentAge; //학생의 나이 저장 변수 선언
		studentAge = 20; // 변수에 값을 대입(처음으로 값을 대입하는것은 초기화(initialization))
		System.out.println(studentAge);
		String myCity = "Seoul"; //변수를 선언하고 초기와 하는 작업을 한줄로 축약가능
		System.out.println("I'm from " + myCity);
		
		
	}

}
