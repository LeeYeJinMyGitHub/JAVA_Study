package coding;

public class StockOne extends Thread{
	
	public int StockOneMoney = 0;
	
	@Override
	public void run() {
			Thread t = Thread.currentThread();
			
			System.out.println("-------- 종목 1 --------");
			System.out.println(t.getName() + " 전일 종가 : " + MainTest.myStockMarket.getPreviousCloseOfStockOne());
			MainTest.myStockMarket.upperMoney(30);
			System.out.println(t.getName() + " 현재가 : " + MainTest.myStockMarket.getCurrentPriceOfStockOne());
			System.out.println(t.getName() + " 등락률 : " + ((( MainTest.myStockMarket.getCurrentPriceOfStockOne() - MainTest.myStockMarket.getPreviousCloseOfStockOne()) / MainTest.myStockMarket.getPreviousCloseOfStockOne()) *100 ) +"%");
			System.out.println(t.getName() + " 현재 보유량 : " + MainTest.myStockMarket.getVolumeOfStockOne());
			StockOneMoney = (int)MainTest.myStockMarket.getCurrentPriceOfStockOne() * MainTest.myStockMarket.getVolumeOfStockOne();
			System.out.println(t.getName() + " 현재 평가액 : " + StockOneMoney);

	}
}
