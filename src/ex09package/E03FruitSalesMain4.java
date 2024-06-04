package ex09package;

// 각 클래스는 반드시 public으로 선언해야 임포트 할 수 있다.
import ex09package.study.buyer.FruitBuyer4;
import ex09package.study.seller.FruitSeller4;

public class E03FruitSalesMain4 {
	
	public static void main(String[] args) {
		
		/*
		 생성자를 사용해서 인스턴스를 생성하면 아래와 같이 생성과 동시에 초기화까지 할 수 있다.
		 따라서 초기화 메서드를 사용하는 것보다 간단한 코드로 작성할 수 있는 장점이 있다.
		 */
		FruitSeller4 seller1 = new FruitSeller4(0, 100, 1000);		
		FruitSeller4 seller2 = new FruitSeller4(0, 80, 500);		
		FruitBuyer4 buyer = new FruitBuyer4(10000, 0);
		
		System.out.println("구매행위가 일어나기전의 상태");
		seller1.showSaleResult();
		seller2.showSaleResult();
		buyer.showBuyResult();
		
		buyer.buyApple(seller1, 5000);
		buyer.buyApple(seller2, 5000);
		
		System.out.println("구매행위가 일어난 후의 상태");
		seller1.showSaleResult();
		seller2.showSaleResult();
		buyer.showBuyResult();
		
	}

}
