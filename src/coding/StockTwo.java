package coding;

public class StockTwo extends Thread{
	
	public int StockTwoMoney = 0;
	
	@Override
	public void run() {
		Thread t = Thread.currentThread();
		
		System.out.println("-------- 종목 2 --------");
		System.out.println(t.getName() + " 전일 종가 : " + MainTest.myStockMarket.getPreviousCloseOfStockTwo());
		MainTest.myStockMarket.lowerMoney(30);
		System.out.println(t.getName() + " 현재가 : " + MainTest.myStockMarket.getCurrentPriceOfStockTwo());
		System.out.println(t.getName() + " 등락률 : " + ((( MainTest.myStockMarket.getCurrentPriceOfStockTwo() - MainTest.myStockMarket.getPreviousCloseOfStockTwo()) / MainTest.myStockMarket.getPreviousCloseOfStockTwo()) *100 ) +"%");
		System.out.println(t.getName() + " 현재 보유량 : " + MainTest.myStockMarket.getVolumeOfStockTwo());
		StockTwoMoney = MainTest.myStockMarket.getCurrentPriceOfStockTwo() * MainTest.myStockMarket.getVolumeOfStockTwo();
		System.out.println(t.getName() + " 현재 평가액 : " + StockTwoMoney);
	}
}
