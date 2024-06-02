package ex04controlstatement;

public class QuPyramid01 {

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
		
		// 총 출력할 줄 수
		int rows = 5;
		int k = 1;
		
		 while (k <= rows) {
	            int cnt = 1;
	            while (cnt <= k) {
	                System.out.print("* ");
	                cnt++;
	            }
	            System.out.println(); // 줄 바꿈
	            k++;
	        }
	}

}
