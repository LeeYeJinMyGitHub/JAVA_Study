package coding;

public class StockFour extends Thread{
	
	public int StockFourMoney = 0;
	
	@Override
	public void run() {
		Thread t = Thread.currentThread();
		
		System.out.println("-------- 종목 4 --------");
		System.out.println(t.getName() + " 전일 종가 : " + MainTest.myStockMarket.getPreviousCloseOfStockFour());
		MainTest.myStockMarket.forExMoney();
		System.out.println(t.getName() + " 현재가 : " + MainTest.myStockMarket.getCurrentPriceOfStockFour());
		System.out.println(t.getName() + " 등락률 : " + ((( MainTest.myStockMarket.getCurrentPriceOfStockFour() - MainTest.myStockMarket.getPreviousCloseOfStockFour()) / MainTest.myStockMarket.getPreviousCloseOfStockFour()) *100 ) +"%");

		System.out.println(t.getName() + " 현재 보유량 : " + MainTest.myStockMarket.getVolumeOfStockFour());
		StockFourMoney = (int)MainTest.myStockMarket.getCurrentPriceOfStockFour() * MainTest.myStockMarket.getVolumeOfStockFour();
		System.out.println(t.getName() + " 현재 평가액 : " + StockFourMoney);
	}
}
