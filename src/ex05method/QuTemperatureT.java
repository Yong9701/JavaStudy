package ex05method;

import java.util.Scanner;

public class QuTemperatureT {
	/*
	 문제3)섭씨(Celsius)를 입력받아서 화씨(Fahrenheit)로 변환하여 리턴하는 함수와 화씨를 입력받아서 섭씨로 변환하여 리턴하는 함수를 만들어라. 공식은 아래와 같습니다.
	 메소드명 : celsiusToFahrenheit() , fahrenheitToCelsius()
	 공식]
		화씨 = 1.8 * 섭씨 + 32
		섭씨 = (화씨 - 32) / 1.8
	 */
	public static void main(String[] args) {	
			System.out.println("섭씨28도=>화씨:"+celsiusToFahrenheit(28));
			System.out.println("화씨98도=>섭씨:"+fahrenheitToCelsius(98));
	}

	// 섭씨를 화씨로..
	public static double celsiusToFahrenheit(double cel) {
		// 화씨 = 1.8 * 섭씨 + 32
		return 1.8 * cel + 32;
	}
	// 화씨를 섭씨로..
	public static double fahrenheitToCelsius(double fah) {
		// 섭씨 = (화씨 - 32) / 1.8
		double cel = (fah - 32) / 1.8;
		return cel;
	}
}
