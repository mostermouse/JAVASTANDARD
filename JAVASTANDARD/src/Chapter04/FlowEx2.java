package Chapter04;

import java.util.Scanner;

public class FlowEx2 {

	public static void main(String[] args) {
		//속도를 중요시하면 switch를 써야하겠지만 복잡해지면 알아먹기 힘드니 if를 쓴다
		int score = 0;
		char grade = ' ';
		System.out.println("당신의 점수를 입력하세요.(1~100)>");
		Scanner sc = new Scanner(System.in);
		String tmp = sc.nextLine();
		score = Integer.parseInt(tmp);
		
		switch(score/10) {
		case 10 :
		case 9 :
			grade = 'A';
			break;
		case 8 :
			grade = 'B';
			break;
		case 7 :
			grade = 'C';
			break;
		default :
			grade = 'F';
		}
		System.out.println("당신의 학점은 " + grade + " 입니다.");

	}

}
