package ex04controlstatement;

public class Qu3Or7Sum {

	public static void main(String[] args) {
		/*
		 문제1)1~100까지의 숫자중 3의배수 이거나 7의배수인 숫자의 합을 구하는 프로그램을 while, do~while, for문으로 각각 작성하시오.
		 	단, 3과 7의 공배수인 경우 합에서 제외해야 한다. 출력의 결과는 누적되는 모든 수를 콘솔에 print한다. 
			하나의 파일에 한꺼번에 작성하므로 동일한 결과가 3번 출력됩니다. 
		 */
		
		// while문
		int totalwh = 0;
		int k = 1;
		// k가 100이하일 때만 반복한다.
		while(k <= 100) {
			// 3의 배수 혹은 7의 배수이므로 논리Or를 사용하고 3과 7의 공배수인 21의 배수를 제외한다.
			if((k % 3 == 0 || k % 7 == 0) && k % 21 != 0) {					
				totalwh += k;
			}
			k++;
		}
		System.out.println("3또는7의배수의합(while문): "+ totalwh);
		
		// do~while문
		int totalDowh = 0;
		k = 1;
		do {
            if ((k % 3 == 0 || k % 7 == 0) && k % 21 != 0) {
                totalDowh += k;
            }
            k++;
        } while (k <= 100);
        System.out.println("3또는7의배수의합(do~while문): "+ totalDowh);
        
        // for문
        int totalFor = 0;
        for (k = 1; k <= 100; k++) {
            if ((k % 3 == 0 || k % 7 == 0) && k % 21 != 0) {
                totalFor += k;
            }
        }
        System.out.println("3또는7의배수의합(for문): "+ totalFor);
	}

}
