package coding;

public class StockFive extends Thread{
	
	public int StockFiveMoney = 0;
	
	@Override
	public void run() {
		Thread t = Thread.currentThread();
		
		System.out.println("-------- ���� 5 --------");
		System.out.println(t.getName() + " ���� ���� : " + MainTest.myStockMarket.getPreviousCloseOfStockFive());
		MainTest.myStockMarket.ifelseExMoney();
		System.out.println(t.getName() + " ���簡 : " + MainTest.myStockMarket.getCurrentPriceOfStockFive());
		System.out.println(t.getName() + " ����� : " + ((( MainTest.myStockMarket.getCurrentPriceOfStockFive() - MainTest.myStockMarket.getPreviousCloseOfStockFive()) / MainTest.myStockMarket.getPreviousCloseOfStockFive()) *100 ) +"%");

		System.out.println(t.getName() + " ���� ������ : " + MainTest.myStockMarket.getVolumeOfStockFive());
		StockFiveMoney = (int)MainTest.myStockMarket.getCurrentPriceOfStockFive() * MainTest.myStockMarket.getVolumeOfStockFive();
		System.out.println(t.getName() + " ���� �򰡾� : " + StockFiveMoney);
	}
}
