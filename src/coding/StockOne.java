package coding;

public class StockOne extends Thread{
	
	public int StockOneMoney = 0;
	
	@Override
	public void run() {
			Thread t = Thread.currentThread();
			
			System.out.println("-------- ���� 1 --------");
			System.out.println(t.getName() + " ���� ���� : " + MainTest.myStockMarket.getPreviousCloseOfStockOne());
			MainTest.myStockMarket.upperMoney(30);
			System.out.println(t.getName() + " ���簡 : " + MainTest.myStockMarket.getCurrentPriceOfStockOne());
			System.out.println(t.getName() + " ����� : " + ((( MainTest.myStockMarket.getCurrentPriceOfStockOne() - MainTest.myStockMarket.getPreviousCloseOfStockOne()) / MainTest.myStockMarket.getPreviousCloseOfStockOne()) *100 ) +"%");
			System.out.println(t.getName() + " ���� ������ : " + MainTest.myStockMarket.getVolumeOfStockOne());
			StockOneMoney = (int)MainTest.myStockMarket.getCurrentPriceOfStockOne() * MainTest.myStockMarket.getVolumeOfStockOne();
			System.out.println(t.getName() + " ���� �򰡾� : " + StockOneMoney);

	}
}
