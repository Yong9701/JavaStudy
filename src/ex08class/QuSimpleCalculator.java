package ex08class;

/*
문제1] 기본 4칙연산을 할때마다 연산의 결과와 몇번 수행되었는지를 출력하는 계산기 클래스를 정의해보자.
	  아래 main함수에 부합하는 CalculatorEx 클래스를 정의하면되고 해당 수치는 임의로 바꿔도 된다.
	  init() 멤버메소드에서는 계산의 결과를 카운트하는 멤버변수를 0으로 초기화 한다.
 */
class CalculatorEx {
    int addCount, subCount, mulCount, divCount;

    void init() {
        addCount = 0;
        subCount = 0;
        mulCount = 0;
        divCount = 0;
    }

    int add(int fNum, int sNum) {
        addCount++;
        return fNum + sNum;
    }

    double sub(double fNum, double sNum) {
        subCount++;
        return fNum - sNum;
    }

    double mul(double fNum, double sNum) {
        mulCount++;
        return fNum * sNum;
    }

    double div(double fNum, double sNum) {
        divCount++;
        return fNum / sNum;
    }

    void showOpCount() {
        System.out.println("덧셈횟수: " + addCount);
        System.out.println("뺄셈횟수: " + subCount);
        System.out.println("곱셈횟수: " + mulCount);
        System.out.println("나눗셈횟수: " + divCount);
    }
}

public class QuSimpleCalculator {
	public static void main(String[] args) {
        CalculatorEx cal = new CalculatorEx();
        cal.init();
        System.out.println("1 + 2 = " + cal.add(1, 2));
        System.out.println("10.5 - 5.5 = " + cal.sub(10.5, 5.5));
        System.out.println("4.0 * 5.0 = " + cal.mul(4.0, 5.0));
        System.out.println("100 / 25 = " + cal.div(100, 25));
        System.out.println("10.0 * 3.0 = " + cal.mul(10.0, 3.0));
        cal.showOpCount();
    }    
}
