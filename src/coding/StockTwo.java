package coding;

public class StockTwo extends Thread{
	
	public int StockTwoMoney = 0;
	
	@Override
	public void run() {
		Thread t = Thread.currentThread();
		
		System.out.println("-------- ���� 2 --------");
		System.out.println(t.getName() + " ���� ���� : " + MainTest.myStockMarket.getPreviousCloseOfStockTwo());
		MainTest.myStockMarket.lowerMoney(30);
		System.out.println(t.getName() + " ���簡 : " + MainTest.myStockMarket.getCurrentPriceOfStockTwo());
		System.out.println(t.getName() + " ����� : " + ((( MainTest.myStockMarket.getCurrentPriceOfStockTwo() - MainTest.myStockMarket.getPreviousCloseOfStockTwo()) / MainTest.myStockMarket.getPreviousCloseOfStockTwo()) *100 ) +"%");
		System.out.println(t.getName() + " ���� ������ : " + MainTest.myStockMarket.getVolumeOfStockTwo());
		StockTwoMoney = MainTest.myStockMarket.getCurrentPriceOfStockTwo() * MainTest.myStockMarket.getVolumeOfStockTwo();
		System.out.println(t.getName() + " ���� �򰡾� : " + StockTwoMoney);
	}
}
