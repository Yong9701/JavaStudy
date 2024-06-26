package ex17collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Scanner;

import common.Student;
import common.Teacher;

/*
 문제2] 컬렉션 set에 저장된 객체를 이름으로 검색하자. 해당 정보가 있으면 해당 어벤져스의 정보를 출력하고 없으면
  "해당 영웅은 없어요ㅜㅜ" 라는 메시지 출력해야 한다. 검색 부분은 Iterator를 통해 구현하도록 한다. set계열의 컬렉션은
  기본적으로 중복저장을 허용하지 않는다. 그러나 아래와 같이 새롭게 정의한 클래스에 대해서는 equals(), hashCode() 메소드를
  적절히 오버라이딩 처리해야 중복을 제거할 수 있다. 메소드 오버라이딩을 통해 hero4 는 입력되지 않도록 Avengers 클래스를 업데이트 하시오.
 */
class Avengers {
	String name;
	String heroName;
	String weapon;

	public Avengers(String name, String heroName, String weapon) {
		super();
		this.name = name;
		this.heroName = heroName;
		this.weapon = weapon;
	}

	@Override
	public String toString() {
		return "Avengers [본명=" + name + ", 닉네임=" + heroName + ", "
				+ "능력=" + weapon +"]";
	}
	@Override
	public int hashCode() {
		int returnCode = Objects.hash(this.name, this.heroName, this.weapon);
		return returnCode;
	}
	
	@Override
	public boolean equals(Object obj) {
		// 매개변수로 전달받은 인스턴스를 다운캐스팅 한다.
		Avengers hero = (Avengers)obj;
		System.out.println("중복 제거용 equals()메소드 호출");
		
		if((hero.name.equals(this.name) && hero.heroName.equals(this.heroName) && hero.weapon.equals(this.weapon))) {
			// 모든 내용이 일치하면 true를 반환한다. 그러면 set에는 추가되지 않는다.
			return true;
		} else {
			// 내용이 다르면 정상적으로 추가된다.
			return false;
		}
	}
}

public class QuHashSet {

	public static void main(String[] args) {

		HashSet<Avengers> set = new HashSet<Avengers>();

		Avengers hero1 = new Avengers("토니스타크", "아이언맨", "Mark-48 수트");
		Avengers hero2 = new Avengers("스티브로져스", "캡틴아메리카", "비브라늄 방패");
		Avengers hero3 = new Avengers("브루스배너", "헐크", "강한피부&점프");
		Avengers hero4 = new Avengers("토니스타크", "아이언맨", "Mark-48 수트");
		
		set.add(hero1);
		set.add(hero2);
		set.add(hero3);
		set.add(hero4);		 

		System.out.println("[최초 전체 정보출력]");
		for(Avengers av : set)
		{
			System.out.println(av.toString());			
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.print("검색할 이름을 입력하세욤:");
		String rName = sc.nextLine();
		boolean isFind = false;
		
		Iterator<Avengers> itr = set.iterator();
		while(itr.hasNext()) {
			Avengers fr = itr.next();
			if(rName.compareTo(fr.name)==0) {
				System.out.println(fr);
				System.out.println("요청하신 정보를 찾았습니다");
				isFind = true;
			}
		}
		if(isFind==false)
			System.out.println("해당 영웅은 없어요ㅜㅜ");
	}
}
