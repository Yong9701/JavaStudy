package ex18lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/*
 Java에서 제공하는 함수형 인터페이스에는 아래 4가지 정도가 있다.
 차이점이라면 매개변수와 리턴값으 유무 정도이다.
 
 Predicate<T> : 매개변수 O, 리턴값 boolean
 Supplier<T> : 매개변수 X, 리턴값 O
 Consumer<T> : 매개변수 O, 리턴값 X
 Function<T,E> : 둘다 있음
 */
public class Ex06Define1Predicate {

	public static void main(String[] args) {

		// 4개의 Humna 인스턴스 생성
		Human p1 = new Human("케이윌", "남", 80);
		Human p2 = new Human("에일리", "여", 77);
		Human p3 = new Human("임재범", "남", 97);
		Human p4 = new Human("아이유", "여", 99);
		
		/*
		 Predicate<T>
		 - 사전적의미 : ~에 근거를 두다.
		 - 매개변수와 boolean 리턴값이 있는 추상메서드 test()가 정의되어있다.
		 - 파라미터를 조사해 true / false 를 반환한다.
		 
		 interface Predicate<T> {
		 	boolean test(T t);
		 }
		 
		 인터페이스에 정의된 test()를 오버라이딩하여 아래와 같이 람다식을 정의한다.
		 매개변수로 Human 인스턴스를 전달하고, getter인 getGender()를 통해
		 성별이 '남'인 경우 true를 반환하도록 정의되어있다.
		 */
		Predicate<Human> pre = (Human h) -> {
			return h.getGender().equals("남");
		};
		
		// '남'이므로 true
		System.out.println("p.test(p1) => "+ pre.test(p1));
		// '여'이므로 false 반환됨
		System.out.println("p.test(p2) => "+ pre.test(p2));
		/*
		 인수로 사용된 4개의 인스턴스를 저장한 List를 생성한다.
		 단 해당 컬렉션은 값을 변경할 수는 없고 참조만 가능하다.
		 */
		List<Human> list1 = Arrays.asList(p1, p2, p3, p4);
		double maleAvg = avg((Human h) -> h.getGender().equals("남"), list1);
		System.out.println("남자 평균:"+ maleAvg);
		/*
		 Predicate<Human> aaa = (Human h) -> h.getGender().equals("남);
		 이와같이 람다식을 정의한 후 참조변수인 aaa를 전달하는 것과 동일하게 람다식 자체를
		 매개변수로 사용하고 있다.
		 */
	}
		/*
		 첫번째 매개변수는 성별이 '남'이면 true를 반환하는 람다식이고
		 두번째 매개변수는 4개의 Human 인스턴스가 저장된 List컬렉션읻.
		 */
		public static double avg(Predicate<Human> ph, List<Human> li) {
			// 카운트용 변수
			int pCount = 0;
			int tCount = 0;
			
			for(Human h : li) {
				if(ph.test(h)== true) {
					pCount++;
					tCount += h.getScore();
				}
			}
			return (double)tCount/pCount;
		}

		
		// List에 저장된 Human인스턴스의 갯수만큼 반복(확장for문)
			// 람다식을 통해 각 Human 인스턴스의 성별을 판단한다.
			// '남'인 경우에만 변수를 1증가
			// 점수를 합산
		
		// 총점을 사람의 명수로 나눠서 평균값을 반환한다.

}
