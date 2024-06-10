package quiz;

public class QuUpgradeGuGu {

	public static void main(String[] args) {
		int result;
		
		// 구구단 9단까지 출력을 위해 단을 10미만으로 설정
		for(int dan=2; dan<10; dan++) {
			for(int k=1; k<10; k++) {
				for(int i=1; i<=k; i++) {
					System.out.printf("%d ", dan);
					if(k == 1) {
						System.out.printf("X %d", k);
					}
					if(i == k) {
						// i만큼 dan을 거듭제곱하여 result에 대입
						result = (int)Math.pow(dan, i);
						System.out.printf("= %d", result);
					}
					else {
						System.out.print("X ");
					}
				}
				System.out.println();
				
			}
			System.out.println();
		}
	}

}
