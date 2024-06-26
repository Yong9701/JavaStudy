package ex04controlstatement;

public class QuPyramid03T {

	public static void main(String[] args) {
		/*
		 문제4)다음과 같은 모양을 출력하는 프로그램을 for문으로 작성하시오.
		 출력결과]
		         *
		       * * *
		     * * * * *
		   * * * * * * *
		 * * * * * * * * *
		 */
		
		// 행의 갯수 지정
		int num = 5;
		
		for(int i=0; i<num; i++) {
			// 공백 출력하기
			for(int j=1; j<=num-i; j++) {
				// i가 증가함에 따라 j의 반복은 감소함
				System.out.print("  ");
			}
			
			// * 출력하기. 조건의 일반식에 의해 1, 3, 5, 7..이 생성된다.
			for(int k=0; k<(i*2+1); k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
