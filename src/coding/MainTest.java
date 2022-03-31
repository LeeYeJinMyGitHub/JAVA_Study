package coding;

import java.time.LocalTime;

public class MainTest extends Thread{

	public static StockMarket myStockMarket = new StockMarket();

	static int StockAllAllMoney = 0;
	
	public static void main(String[] args) throws InterruptedException {
		
		while(true) { //5�ʸ� �ֱ�� ���ΰ�ħ ���ѹݺ�
		
		LocalTime displayTime = LocalTime.now();
		
		System.out.println("_______________________");
		System.out.println("�ֽ� �ܰ�");
		System.out.println("���� �ð� : " + displayTime);
		
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
		System.out.println("���� �򰡾� : " + StockAllAllMoney);
		System.out.println("���� �ð� : " + displayTime);
		System.out.println("_______________________");
	
		Thread.sleep(5000);
		}
	}

}
