package ex17collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

import common.Student;

/*
 문제1] 사용자로부터 이름을 입력받아 그 이름으로 검색해서 인덱스 위치(indexOf사용)를 알아내서 해당 인덱스로 그 객체를 삭제하고 삭제된 객체의 정보(이름,나이,학번)를 출력하여라.
 */

public class QuArrayListT {

	public static void main(String[] args) {
		
		//ArrayList<Student> list = new ArrayList<Student>();
		LinkedList<Student> list = new LinkedList<Student>();
		
		//저장할 객체 생성
		Student st1 = new Student("가길동", 10, "2018");
		Student st2 = new Student("나길동", 20, "2017");
		Student st3 = new Student("다길동", 30, "2016");
		Student st4 = new Student("마길동", 40, "2015");
		
		//객체 추가(컬렉션에 저장)
		list.add(st1);
		list.add(st2);
		list.add(st3);
		list.add(st4);
			
			// 1.검색할 이름을 입력받음
			Scanner sc = new Scanner(System.in);
			System.out.print("검색할 이름을 입력하세요:");
			String str = sc.next();			

			// 2.확장for문으로 컬렉션 전체를 접근
			
			// List의 인덱스는 0부터 시작이므로 초기값은 -1로 설정
			int index = -1;
	        // 리스트에 저장된 갯수만큼 반복
			for(Student stu : list) {
				// 검색할 이름과 일치하는 인스턴스를 검색
				if(stu.getName().equals(str)) {
					// 참조값을 통해 index를 얻어온다.
					index = list.indexOf(stu);
					System.out.println("[검색되었습니다]");
					break;
				}
			}
			// 3.검색결과 유/무에 따라
			//검색결과 없을때...검색결과가 없다고 출력
			if(index == -1) {
				System.out.println("검색결과가 없습니다.");
			}
			else {
				//검색결과 있을때…검색된 데이터 삭제
				Student s = list.remove(index);
				System.out.println("다음 정보가 삭제됨");
				System.out.println(s);
				}		
			
			//4.전체정보 출력
			System.out.println("[삭제후 정보출력]");
			Iterator<Student> itr = list.iterator();
			while(itr.hasNext()) {
				Student st = itr.next();
				// toString()을 통해 정보를 출력
				System.out.println(st);
			}
	}


}
