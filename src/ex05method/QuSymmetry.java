package ex05method;

public class QuSymmetry {
	/*
	 문제6)다음과 같은 회전대칭 모양의 출력결과를 보이는 프로그램을 while문과 for문으로 작성하시오.
			단, 메서드로 작성해야 한다. 
	메서드명 : rotationSymmetry()
		0 0 0 1
		0 0 1 0
		0 1 0 0
		1 0 0 0
	 */
	static void rotationSymmetry() {
		int x=1;
		while(x<=4) {
			// 행이 고정된 상태에서 열을 4번 반복하기 위한 변수
			for(int y=1; y<=4; y++) {
				/*
				 (1, 4), (2, 3), (3, 2), (4, 1)의 자리에 1이 출력해야하므로 x+y가 5가 될 때 1을 출력
				 */
				if(x + y == 5) {
					System.out.print("1 ");
				}
				else {
					System.out.print("0 ");
				}
			}
			System.out.println();
			x++;
		}
	}
	public static void main(String[] args) {
		rotationSymmetry();
	}

}
