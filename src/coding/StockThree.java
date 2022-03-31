package coding;

public class StockThree extends Thread{
	
	public int StockThreeMoney = 0;
	
	@Override
	public void run() {
		Thread t = Thread.currentThread();
		
		System.out.println("-------- 종목 3 --------");
		System.out.println(t.getName() + " 전일 종가 : " + MainTest.myStockMarket.getPreviousCloseOfStockThree());
		MainTest.myStockMarket.blueChipMoney(1);
		System.out.println(t.getName() + " 현재가 : " + MainTest.myStockMarket.getCurrentPriceOfStockThree());
		System.out.println(t.getName() + " 등락률 : " + ((( MainTest.myStockMarket.getCurrentPriceOfStockThree() - MainTest.myStockMarket.getPreviousCloseOfStockThree()) / MainTest.myStockMarket.getPreviousCloseOfStockThree()) *100 ) +"%");
		System.out.println(t.getName() + " 현재 보유량 : " + MainTest.myStockMarket.getVolumeOfStockThree());
		StockThreeMoney = MainTest.myStockMarket.getCurrentPriceOfStockThree() * MainTest.myStockMarket.getVolumeOfStockThree();
		System.out.println(t.getName() + " 현재 평가액 : " + StockThreeMoney);
	}
}
