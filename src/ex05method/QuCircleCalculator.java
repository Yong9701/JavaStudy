package ex05method;

public class QuCircleCalculator {
	/*
	 문제2)원의 반지름을 인수(파라메타)로 전달하면 원의 넓이와 둘레를 계산하여 반환하는 메소드를 각각 정의하자. 이를 호출하는 main 메소드를 정의하시오.
	 메소드명 : circleArea() > 원의넓이, circleRound() > 원의둘레
		-넓이공식 : 3.14 * 반지름 * 반지름
		-둘레공식 : 2 * 3.14 * 반지름
	 */	
	// 넓이를 구하는 메소드
	static double circleArea(double r) {
		double area = 3.14 * r * r;
		// 소수점 3자리까지 출력
		System.out.printf("원의 넓이(반지름:%s): %.3f\n", r, area);
		return area;
	}
	// 둘레를 구하는 메소드
	static double circleRound(double r) {
		double round = 2 * 3.14 * r;
		System.out.printf("원의 둘레(반지름:%s): %.3f\n", r, round);
		return round;
	}
	
	public static void main(String[] args) {
		double r = 3.5;
		circleArea(r);
		circleRound(r);
	}

}
