package javastandard;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("두 자리 정수를 하나 입력해주세요.");
		String input = sc.nextLine();
		int num = Integer.parseInt(input); //문자열을 인트형으로 변환해야 해서 문자열 안 넣으면 에러남
		
		System.out.println("입력내용 :" + input);
		System.out.printf("num = %d\n" ,num);
		
		
		//어떤 타입의 형 변환을 캐스팅이라고 함 
		char ch = 'A';
		int code = (int)ch; //캐스팅
		
		System.out.printf("%c = %d(%#X)\n" , ch , code, code);
		// 'A' -> 65 인코딩
		// 65 -> 'A' 디코딩  인코딩을 했는지 알아야 디코딩이 가능
		//정수형의 변수의 값이 표현범위를 벗어나면 오버플로우
		//실수형으로 표현할수 없는 아주 작은 값 언더플로우
		
		
	}
}
