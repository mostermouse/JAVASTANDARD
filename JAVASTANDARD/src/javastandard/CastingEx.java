package javastandard;

public class CastingEx {

	public static void main(String[] args) {
		int i = 10;
		byte b =  (byte)i;
		System.out.printf("[int -> byte] i = %d -> b = %d\n",i ,b);
		
		i = 300;
		b =(byte)i; //바이트형 크기 -128~127
		System.out.printf("[int -> byte] i = %d -> b = %d\n",i ,b);
		
		b = 10;
		i = (int)b;
		System.out.printf("[int -> byte] i = %d -> b = %d\n",i ,b);
		
		b = -2;
		i = (int)b;
		System.out.printf("[int -> byte] i = %d -> b = %d\n",i ,b);
		
		System.out.println("i =" + Integer.toBinaryString(i));
		//Integer.toBinaryString을 사용하면 10진 정수를 2진수 문자열로 변환
		
		float f = 1234; //형 변환 생략해서 float f =(float)1234;와 같음 자동 캐스팅;
		//byte b = 1000; //값 초과로 에러 발생하지만
		char ch = (char)1000; //명시적으로 형변환을 해주면 프로그래머의 실수가 아니라고 간주
		
		int a = 3;
		double d = 1.0 + a;  //double d = 1.0 + (double)a; 같다
		//자동 형변환 규칙 기존의 값을 최대한 보존할 수 있는 타입으로 자동 캐스팅
		
		
		
		

		
		

	}

}
