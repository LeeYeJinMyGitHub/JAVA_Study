package coding;

public class StockFive extends Thread{
	
	public int StockFiveMoney = 0;
	
	@Override
	public void run() {
		Thread t = Thread.currentThread();
		
		System.out.println("-------- 종목 5 --------");
		System.out.println(t.getName() + " 전일 종가 : " + MainTest.myStockMarket.getPreviousCloseOfStockFive());
		MainTest.myStockMarket.ifelseExMoney();
		System.out.println(t.getName() + " 현재가 : " + MainTest.myStockMarket.getCurrentPriceOfStockFive());
		System.out.println(t.getName() + " 등락률  : " + ((( MainTest.myStockMarket.getCurrentPriceOfStockFive() - MainTest.myStockMarket.getPreviousCloseOfStockFive()) / MainTest.myStockMarket.getPreviousCloseOfStockFive()) *100 ) +"%");

		System.out.println(t.getName() + " 보유량 : " + MainTest.myStockMarket.getVolumeOfStockFive());
		StockFiveMoney = (int)MainTest.myStockMarket.getCurrentPriceOfStockFive() * MainTest.myStockMarket.getVolumeOfStockFive();
		System.out.println(t.getName() + " 현재 평가액  : " + StockFiveMoney);
	}
}
