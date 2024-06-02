package ex04controlstatement;

public class QuPyramid04 {

	public static void main(String[] args) {
		/*
		 문제5)다음과 같은 모양을 출력하는 프로그램을 for문으로 작성하시오.
		 출력결과]
		 *
		 * *
		 * * *
		 * * * *
		 * * * * *
		 * * * *
		 * * *
		 * *
		 *
		 */
		
		int rows = 5;
		
		// k가 rows값만큼 증가할때까지 *의 개수 증가
		for(int k=1; k<=rows; k++) {
			for(int cnt=1; cnt<= k; cnt++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		// k가 rows값이 된 이후 1이 될 때까지 *의 개수 감소
		for(int k=rows; k>0; k--) {
			for(int cnt=1; cnt < k; cnt++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
