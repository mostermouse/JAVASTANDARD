package javastandard;

public class ConstantLiteral {

	public static void main(String[] args) {
		//constant(상수)는 변수와 마찬가지로 값을 저장하는 공간이지만 다른 값 변경 x
		final int MAX_SPEED = 10; //상수 MAX_SPEED 선언 (반드시 선언과 동시에 초기화 해줌)
		//jdk 1.6이상부턴 지킬 필요는 없지만 습관화 하는것이 좋다
		//변수 : 하나의 값을 저장하기 위한 공간
		//상수 : 값을 한번만 저장할 수 있는 공간
		//리터럴 : 그 자체로 값을 의미하는 것
		
		int trigangleArea = (20*10) / 2;
		int rectangleArea = 10 * 20;
		
		//이런 식으로 리터럴을 쓰면 되지만 복잡한 계산식이 되어버리면 구하기 힘들기에
		
		final int WIDTH = 20;
		final int HEIGHT = 10;
		int trigangleArea = (WIDTH * HEIGHT) / 2;
		int rectangleArea = WIDTH * HEIGHT;
		//상수를 이용해서 기존 코드를 변경해주면 위에 코드보다 면적을 구하는 공식의 의미가 명확해지고 
		//다른 값으로 변경할 때도 여러 곳을 수정할 필요가 없
		
	}

}
