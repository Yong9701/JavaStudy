package ex05method;

import java.util.Scanner;

public class QuSimpleOperation {

	public static void main(String[] args) {
		/*
		 문제1)두개의 정수를 입력받아서 사칙연산의 결과를 출력하는 메소드와 main메소드를 작성해보자. 단 나눗셈은 몫과 나머지를 각각 출력해야 한다.
			인수(파라메타)로 전달되는 두 숫자는 모두 0 이상의 양의 정수이다. 메소드명 : arithmetic()
		 */	
			Scanner scanner = new Scanner(System.in);
			System.out.print("첫번째숫자:");
			int f =scanner.nextInt();
			System.out.print("두번째숫자:");
			int s =scanner.nextInt();

			arithmetic(f, s);
	}

	static void arithmetic(int fNum, int sNum) {
		if(fNum < 0 || sNum < 0) {
			System.out.println("숫자는 0이상 이어야합니다.");
		}
		else {
			System.out.printf("덧셈결과 -> %d\n", fNum + sNum);
			System.out.printf("뺄셈결과 -> %d\n", fNum - sNum);
			System.out.printf("곱셈결과 -> %d\n", fNum * sNum);
			System.out.printf("나눗셈 몫 -> %d\n", fNum / sNum);
			System.out.printf("나눗셈 나머지 -> %d\n", fNum % sNum);
		}
	}
}
