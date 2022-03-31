package coding;

import java.time.LocalTime;

public class MainTest extends Thread{

	public static StockMarket myStockMarket = new StockMarket();

	static int StockAllAllMoney = 0;
	
	public static void main(String[] args) throws InterruptedException {
		
		while(true) { //5초를 주기로 새로고침 무한반복
		
		LocalTime displayTime = LocalTime.now();
		
		System.out.println("_______________________");
		System.out.println("주식 잔고");
		System.out.println("현재 시간 : " + displayTime);
		
		StockOne stockOne = new StockOne();
		StockTwo stockTwo = new StockTwo();
		StockThree stockThree = new StockThree();
		StockFour stockFour = new StockFour();
		StockFive stockFive = new StockFive();
		
		try {		
			
			stockOne.start();
			stockOne.join();
	
			stockTwo.start();
			stockTwo.join();
		
			stockThree.start();
			stockThree.join();
		
			stockFour.start();
			stockFour.join();
		
			stockFive.start();
			stockFive.join();
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		StockAllAllMoney = (int) (stockOne.StockOneMoney + stockTwo.StockTwoMoney + stockThree.StockThreeMoney + stockFour.StockFourMoney + stockFive.StockFiveMoney);

		displayTime = LocalTime.now();
		System.out.println("_______________________");
		System.out.println("종합 평가액 : " + StockAllAllMoney);
		System.out.println("갱신 시간 : " + displayTime);
		System.out.println("_______________________");
	
		Thread.sleep(5000);
		}
	}

}
