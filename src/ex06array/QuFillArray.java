package ex06array;

import java.util.Scanner;

public class QuFillArray {
	/*
	 문제3)홀수/짝수 구분하여 배열채우기
	 	길이가 10인 배열을 선언한 후 총 10개의 정수를 입력받아 순서대로 저장한다. (첫번째배열)
		그리고 순서대로 저장된 숫자들을 홀수는 배열의 앞에서부터 채워나가고 짝수는 배열의 끝에서부터 채워나간다.(두번째배열)
	 */
	public static void main(String[] args) {
		int[] arr = new int[10];
		int[] arr2 = new int[10];
		int frontIdx = 0;
		int backIdx = arr2.length-1;
		
		Scanner scanner = new Scanner(System.in);
		for(int i=0; i< arr.length; i++) {
			System.out.print((i+1)+"번째 정수를 입력하세요:");
			arr[i] =scanner.nextInt();
		}
		for(int i=0; i<arr.length; i++) {
			if(arr[i] % 2 != 0) {
				arr2[frontIdx++] = arr[i];
			} 
			else {
				arr2[backIdx--] = arr[i];
			}	
		}
		
		System.out.println("순서대로 입력된 결과");
		for(int i=0; i< arr.length; i++) {
			System.out.printf("%d ", arr[i]);
		}
		System.out.println("\n홀수/짝수 구분입력결과");
		for(int i=0; i< arr.length; i++) {
			System.out.printf("%d ", arr2[i]);
		}
	}

}
