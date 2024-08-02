package ex03_array;

public class Ex01_Array {
	public static void main(String[] args) {
		/*
		 * 배열 array - 같은 자료형의 변수를 지정하여 여러 데이터를 저장할수 있는 저장공간을 의미
		 * 여러개의 데이터를 한번에 담을수 있는 구조를 자료구조라고 함
		 * 배열을 사용하면 같은 자료형의 데이터를 효율적으로 다룰 수 있다
		 * 
		 * 배열이 필요한 이유 - 10개의 데이터를 저장하려면 자료형 변수 10개가 필요함
		 * 데이터가 많아질수록 관리하기 힘들어짐
		 * 
		 * 자료형[] 배열명;
		 * 자료형 배열명[];
		 * 대괄호는 배열의 연산자를 의미. 자료형뒤나 변수명 뒤에 붙이면 배열이라는 의미. 자료형 뒤에 붙이는게 자주 사용됨
		 * 
		 * 배열의 경우 데이터 저장을 위한 별도의 장소가 필요
		 * null이라는 키워드 부여 - 없다라는 의미를 가짐
		 * 배열변수는 만들어졌지만 담을 공간이 생성되지 않았다는 뜻
		 * 
		 * 배열 생성
		 * 배열을 선언한후 여러개의 데이터를 저장하기 위해서 먼저 메모리에 공간을 확보하기 위해 생성을 해야한다
		 * 프로그래밍에서는 뭔가를 기억할때 메모리를 사용함
		 * 배열은 데이터를 저장하기 위한 공간이 필요하므로 메모리에 필요한 만큼의 공간을 만들도록 선언해야함
		 * new라는 연산자와 함께 자료형의 길이를 지정해야함
		 */
		int[] arr; //배열의 생성
		arr = new int[4]; //배열 arr에 4개의 데이터를 저장하기위한 공간을 메모리에서 할당
		
		int[] arr2 = new int[4];//선언과 생성을 동시에 할 수 있다.
		
		//배열에 저장될 값을 미리 부여해 선언하는 방법도 있다
		int[] arr3 = {1, 2, 3, 4, 5}; //배열을 선언할때 값 저장 가능. 5개 값을 대입했기 때문에 크기는 5. 순서에 맞게 데이터 삽입.
		//이 방법은 배열을 최초 선언할때만 가능
		
//		int[] arr4;
//		arr4 = {1,2,3,4,5}; <-에러 발생
		
		int arr4[];
		arr = new int[] {1,2,3,4,5}; //선언한후 값을 대입해야 하는 경우 이런 방법이 가능
		
		int n = 100;
		System.out.println(n);
		System.out.println(arr); //배열명을 출력하면 주소값을 출력
		
		/*
		 * 배열의 특징
		 * 배열을 만들때 크기를 꼭 지정해야 한다.
		 * 배열 만든 후 공간의 크기를 늘리거나 줄일수 없다.
		 * 배열을 만들때 지정한 자료형의 값만 저장할 수 있다.
		 * 
		 * 배열의 구조
		 * 1.index ->집의 호수
		 * 배열을 만든 후에 값을 넣거나 꺼내야 하는데, 배열은 각 공간마다 위치를 알려주는 위치값이 존재함
		 * 배열이 지니는 값들의 위치를 알려주는 위치값 - index
		 * 0번부터 시작하여 순차적으로 증가함
		 */
		
		
	}
}
