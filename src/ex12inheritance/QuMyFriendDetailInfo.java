package ex12inheritance;

import java.util.Scanner;

/*
 문제2] 다음 상속관계에 있는 두 클래스의 적절한 생성자를 정의해보자.
	   main 함수에서는 MyFriendDetailInfo 클래스를 통해서 객체를 생성해야 하고 생성된 정보를 확인할 수 있도록 해보자.
 */

//친구의 정보를 저장할 기본클래스
class MyFriendInfo{
	private String name;
	int age;
	
	public void insertInfo() {
		Scanner scan = new Scanner(System.in);
		System.out.print("이름: ");name = scan.nextLine();
		System.out.print("나이: ");age = scan.nextInt();
	}
	public void showMyFriendInfo() {
		System.out.println("이름: "+ name);
		System.out.println("나이: "+ age);
	}
}
//친구의 기본정보 외 상세정보를 저장할 클래스
class MyFriendDetailInfo extends MyFriendInfo
{
	private String addr;
  	private String phone;

  	public void insertDetailInfo() {
  		insertInfo();
  		Scanner scan = new Scanner(System.in);
	  	System.out.print("주소: "); addr = scan.nextLine();
	  	System.out.print("전화: ");phone = scan.nextLine();
  	}
	public void showMyFriendDetailInfo(){
		showMyFriendInfo();
		System.out.println("주소: "+ addr);
		System.out.println("전화: "+ phone);
	}
}
class QuMyFriendDetailInfo {
	public static void main(String[] args) {
		//이름, 나이, 주소, 전화번호를 인자로 객체를 생성…
		//정보Print
		MyFriendDetailInfo friend = new MyFriendDetailInfo();
		friend.insertDetailInfo();
		friend.showMyFriendDetailInfo();
	}
}
