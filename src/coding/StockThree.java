package coding;

public class StockThree extends Thread{
	
	public int StockThreeMoney = 0;
	
	@Override
	public void run() {
		Thread t = Thread.currentThread();
		
		System.out.println("-------- ���� 3 --------");
		System.out.println(t.getName() + " ���� ���� : " + MainTest.myStockMarket.getPreviousCloseOfStockThree());
		MainTest.myStockMarket.blueChipMoney(1);
		System.out.println(t.getName() + " ���簡 : " + MainTest.myStockMarket.getCurrentPriceOfStockThree());
		System.out.println(t.getName() + " ����� : " + ((( MainTest.myStockMarket.getCurrentPriceOfStockThree() - MainTest.myStockMarket.getPreviousCloseOfStockThree()) / MainTest.myStockMarket.getPreviousCloseOfStockThree()) *100 ) +"%");
		System.out.println(t.getName() + " ���� ������ : " + MainTest.myStockMarket.getVolumeOfStockThree());
		StockThreeMoney = MainTest.myStockMarket.getCurrentPriceOfStockThree() * MainTest.myStockMarket.getVolumeOfStockThree();
		System.out.println(t.getName() + " ���� �򰡾� : " + StockThreeMoney);
	}
}
