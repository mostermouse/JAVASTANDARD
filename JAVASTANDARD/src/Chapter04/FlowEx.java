package Chapter04;

import java.util.Scanner;

public class FlowEx {

	public static void main(String[] args) {
		System.out.println("당신의 주민번호를 입력하세요. (123456 - 1234567)");
		Scanner sc = new Scanner(System.in);
		String regNo = sc.nextLine();
		char gender = regNo.charAt(7); //입력받은 번호의 8번째 문자를 gender에 저장
		
		switch(gender) {
		case '1' : case '3':
			switch(gender) {
			case '1':
				System.out.println("당신은 2000년대 이전에 태어난 남자");
				break;
			case '3':
				System.out.println("당신은 2000년대 이후에 태어난 남자");
				
			}
			break;
			
		case '2' : case '4':
			switch(gender) {
			case '2':
				System.out.println("당신은 2000년대 이전에 태어난 여자");
				break;
			case '4':
				System.out.println("당신은 2000년대 이후에 태어난 여자");
			}
			break;
		default:
			System.out.println("유효하지 않는 주민등록번호입니다.");
		}

	}

}
