package ex03_method;

public class MidTermMain {
	public static void main(String[] args) {
		MidTerm midterm = new MidTerm();
		int[] stu1 = {88,89};
		int[] stu2 = {78,100};
		int sum1 = midterm.score(stu1);
		int sum2 = midterm.score(stu2);
		
		if(sum1 > sum2) {
			System.out.println("첫번재 학생의 점수가 더 높습니다.");
		} else if(sum1 == sum2) {
			System.out.println("두 학생의 점수가 같습니다.");
		} else {
			System.out.println("두번째 학생의 점수가 더 높습니다.");
		}
	}
}
