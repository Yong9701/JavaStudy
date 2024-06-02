package ex05method;

public class QuFindPrimeNumber {
	/*
	 문제4)전달된 값이 소수인지 아닌지를 판단하여 소수인 경우 true를 아니면 false를 반환하는 메소드를 정의하고, 이를 이용해서 1부터 100사이의 소수를 전부 출력하는 main메소드를 정의하자.
	 메소드명 : isPrimeNumber()
	 소수란 : 특정 정수를 나눌수 있는것이 1과 자기 자신밖에 없는 수.
	 */
	
	public static void main(String[] args) {
		int N = 100;

		// 전달된 값이 소수인 경우 true를 반환, 아닐 경우 false를 반환을 통해 소수여부를 출력
		System.out.println("전달된 숫자 "+ N + "은 " + (isPrimeNumber(N)== true ? "소수입니다." : "소수가 아닙니다."));
		// 0 ~ N 까지 수 중 소수를 구하는 반복문        
		for(int i = 1; i <= N; i++) {
			if(isPrimeNumber(i) == true)
				System.out.println("소수 : "+ i);
		}
    
	}
 
	// 소수 생성 메소드 
	public static boolean isPrimeNumber(int number) {
		for(int i = 2; i < number; i++) {
			// 소수가 아닐경우 종료
			if(number % i == 0) {
				return false;
			}
		}
		// 위 for문에서 약수를 갖고 있지 않는경우 소수다.
		return true;
	}

}
