package ex04controlstatement;

public class QuPyramid02T {

	public static void main(String[] args) {
		/*
		 문제3)다음과 같은 모양을 출력하는 프로그램을 do~while문으로 작성하시오.
		 출력결과]
		 * * * * *
		 * * * *
		 * * *
		 * *
		 *
		 */
		
		int x = 5;
		do {
			int y = 1;
			do {
				System.out.print("* ");	
				y++;
			}while(y <= x );
			System.out.println();
			x--;
		}while(x >= 1);
	}

}
