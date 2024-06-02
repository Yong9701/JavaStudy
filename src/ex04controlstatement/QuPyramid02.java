package ex04controlstatement;

public class QuPyramid02 {

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
		
		int stars = 5;
		
		do {
            int cnt = 1;
            do {
                System.out.print("* ");
                cnt++;
            } while (cnt <= stars);
            System.out.println();
            stars--;
        } while (stars > 0);
	}

}
