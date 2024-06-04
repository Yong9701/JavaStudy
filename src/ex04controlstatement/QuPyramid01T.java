package ex04controlstatement;

public class QuPyramid01T {

	public static void main(String[] args) {
		/*
		 문제2)다음과 같은 모양을 출력하는 프로그램을 while문으로 작성하시오.
		 출력결과]
		 *
		 * *
		 * * *
		 * * * *
		 * * * * *
		 */
		
		// for문으로 구현
		// 행을 반복
		for(int i=1; i<=5; i++) {
			// 열을 반복
			for(int j=1; j<=5; j++) {
				// i(행)의 갯수만큼 j(열)를 출력한다.
				if(j<=i) {
					System.out.print("* ");	
				}	
			}
			System.out.println();
		}
		
		System.out.println("=================");
		
		// while문으로 구현
		int i = 1; // for문의 지역변수이므로 새롭게 선언가능
		
		while(i <= 5) {
			int j = 1;
			// i번 만큼 반복해서 출력
			while(j <= i) {
				System.out.print("* ");	
				j++;
			}
			System.out.println();
			i++;
		}
	}

}
