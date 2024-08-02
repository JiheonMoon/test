package ex03_array;

import java.util.Random;
import java.util.Scanner;

public class Ex04_Array {
	public static void main(String[] args) {
		//10개의 정수를 담을 수 있는 배열의 생성
		//배열의 이름은 numbers
		//배열에 Random클래스를 이용하여 1~30 사이의 난수 넣기
		//nextInt(30)+1;
		//배열의 모든 요소 출력하기(가로)
		//배열 안에서 짝수의 합 구하기
		int[] numbers = new int[10];
		Random rnd = new Random();
		int sum = 0;
		for(int i = 0; i < numbers.length; i++) {
			numbers[i] = rnd.nextInt(30)+1;
			System.out.print(numbers[i] + " ");
			if(numbers[i] % 2 == 0) {
				sum += numbers[i];
			}
		}
		System.out.println();
		System.out.println("짝수의 총합 : " + sum);
		
		//배열에서 영문자만 추출하여 이여붙혀 출력하기
		char[] cards = {'1','L','2','O','3','V','E','4'};
		String myWord = "";
		for(int i = 0; i < cards.length; i++) {
			if(cards[i] >= 'A' && cards[i] <= 'Z') {
				myWord += cards[i]; 
			} else if(cards[i] >= 'a' && cards[i] <= 'z') {
				myWord += cards[i];
			}
		}
		System.out.println("단어 : " + myWord);
		
		//배열 arr에 담겨있는 모든 값의 합을 구하세요
		int[] arr = {10,20,30,40,50};
		sum = 0;
		
		//배열명.length : 배열에 들어있는 요소의 개수
		//index : 요소에게 번호표를 나눠줌 0부터
		//배열명[인덱스번호] -> 변수처럼 사용 가능
		//arr[0] -> 10
		
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		
		System.out.println("총합 : " + sum);
		
		//다음 조건에 맞는 문제를 푸세요
		//비코드에서 배열의 길이 입력받음
		//입력받은 길이만큼 알파벳을 넣고 출력
		//배열의 길이를 입력하세요 : 5
		//ABCDE
		Scanner sc = new Scanner(System.in);
		System.out.print("배열의 길이를 입력하세요 : ");
		char[] arr2 = new char[sc.nextInt()];
		char c = 'A';
		for(int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] = c++);
		}
		System.out.println();
		System.out.println();
		
		//동전의 개수 구하기
		//10~5000사이의 난수를 변수에 담는다.
		//1의자리는 반드시 0이 되어야 합니다
		//발생된 난수를 각 동전으로 바꾸면 몇개씩 필요한지. 가능한 적은수의 동전
		
		int[] coin = {500,100,50,10};
		int money = (rnd.nextInt(500) + 1) * 10;
		System.out.println("돈의 양 : " + money + "원");
		
		for(int i = 0; i < coin.length; i++) {
			int coins = money / coin[i];
			money %= coin[i];
			System.out.printf("%d원 : %d개\n",coin[i],coins);
		}
		System.out.println();
		System.out.println();
		//1~45 사이의 난수를 발생시켜 로또번호를 배열에 저장하고 출력하기
		int[] lotto = new int[6];
		outer : for(int i = 0; i < lotto.length;) {
			int r= rnd.nextInt(45) + 1;
			for(int j = 0; j < i; j++) {
				if(lotto[j] == r) {
					continue outer;
				}
			}
			lotto[i] = r;
			System.out.print(lotto[i] + " ");
			i++;
		}
	}
}
