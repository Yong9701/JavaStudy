package ex07string;

public class E02StringMethod4 {

	public static void main(String[] args) {

		/*
		시나리오1] 주민등록번호를 이용하여 성별을 판단하는
		프로그램을 charAt()을 이용해서 작성하시오.
		190419-3000000 => 남자
		190419-4000000 => 여자
		*/
		System.out.println("=== 1 ===");
		String str1 = "190419-3000000";
		String str2 = "190419-4000000";
		System.out.println((str1.charAt(7)=='1' || str1.charAt(7)=='3') ? "남자" : "여자");
		System.out.println((str2.charAt(7)=='2' || str2.charAt(7)=='4') ? "여자" : "남자");
		
		
		/*
		시나리오2] 해당 문자열이 이메일 형식인지 검사하는
		프로그램을 contains()를 이용해서 작성하시오.
		hong@daum.net => 이메일형식임
		not@naver => 이메일형식이아님
		*/
		System.out.println("=== 2 ===");
		System.out.println("hong@daum.net".contains("@") && "hong@daum.net".contains(".") ? "이메일형식임" : "이메일형식이아님");
		System.out.println("not@naver".contains("@") && "not@naver".contains(".") ? "이메일형식임" : "이메일형식이아님");
		
		
		/*
		시나리오3]주민등록번호로 성별을 구분하는 프로그램을 indexOf()와 charAt()을 
		이용해서 작성하시오.
		*/	
		System.out.println("=== 3 ===");
		String juminNum = "111111-2222222";
		System.out.println(juminNum.indexOf("-"));
		char gender = juminNum.charAt(juminNum.indexOf("-")+1);
		if(gender=='1' || gender=='3') {
			System.out.println("남자입니다.");
		}
		else if(gender=='2' || gender=='4')
			System.out.println("여자입니다.");
		
		else if(gender=='5' || gender=='6') 
			System.out.println("외국인입니다.");
		else System.out.println("주민번호를 잘못 입력하셨습니다.");
		
		/*
		시나리오4] 다음 파일명에서 확장자를 잘라내는 프로그램을
		작성하시오. 
		파일명 : my.file.images.jpg
		*/
		System.out.println("=== 4 ===");
		String file = "my.file.images.jpg";
		String fileName = file.substring(0, file.lastIndexOf("."));
		System.out.println(fileName);

	}

}
