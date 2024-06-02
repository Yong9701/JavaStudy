package ex04controlstatement;

public class QuPyramid03 {

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
		// 총 출력 줄 수
		int rows = 5; 
        
        for (int nowRow = 1; nowRow <= rows; nowRow++) {
            // 공백 출력
            for (int blank = rows; blank > nowRow; blank--) {
                System.out.print("  ");
            }
            // 별 홀수개 출력
            for (int stars = 0; stars < 2 * nowRow - 1; stars++) {
                System.out.print("* ");
            }            
            System.out.println();
        }
	}

}
