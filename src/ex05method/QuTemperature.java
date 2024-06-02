package ex05method;

import java.util.Scanner;

public class QuTemperature {
	/*
	 문제3)섭씨(Celsius)를 입력받아서 화씨(Fahrenheit)로 변환하여 리턴하는 함수와 화씨를 입력받아서 섭씨로 변환하여 리턴하는 함수를 만들어라. 공식은 아래와 같습니다.
	 메소드명 : celsiusToFahrenheit() , fahrenheitToCelsius()
	 공식]
		화씨 = 1.8 * 섭씨 + 32
		섭씨 = (화씨 - 32) / 1.8
	 */
	public static void main(String[] args) {	
			Scanner scanner = new Scanner(System.in);
			System.out.print("섭씨를 입력하세요:");
			double cel =scanner.nextDouble();
			celsiusToFahrenheit(cel);
			System.out.print("화씨를 입력하세요:");
			double fah =scanner.nextDouble();
			fahrenheitToCelsius(fah);
	}

	static void celsiusToFahrenheit(double cel) {
		double fah = 1.8 * cel + 32;
		System.out.printf("섭씨(%s)를 화씨로 변환한 값 : %.2f\n", cel, fah);
	}
	static void fahrenheitToCelsius(double fah) {
		double cel = (fah - 32) / 1.8;
		System.out.printf("화씨(%s)를 섭씨로 변환한 값 : %.2f\n", fah, cel);
	}
}
