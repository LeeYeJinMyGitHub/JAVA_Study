package coding;

public class StockFour extends Thread{
	
	public int StockFourMoney = 0;
	
	@Override
	public void run() {
		Thread t = Thread.currentThread();
		
		System.out.println("-------- ���� 4 --------");
		System.out.println(t.getName() + " ���� ���� : " + MainTest.myStockMarket.getPreviousCloseOfStockFour());
		MainTest.myStockMarket.forExMoney();
		System.out.println(t.getName() + " ���簡 : " + MainTest.myStockMarket.getCurrentPriceOfStockFour());
		System.out.println(t.getName() + " ����� : " + ((( MainTest.myStockMarket.getCurrentPriceOfStockFour() - MainTest.myStockMarket.getPreviousCloseOfStockFour()) / MainTest.myStockMarket.getPreviousCloseOfStockFour()) *100 ) +"%");

		System.out.println(t.getName() + " ���� ������ : " + MainTest.myStockMarket.getVolumeOfStockFour());
		StockFourMoney = (int)MainTest.myStockMarket.getCurrentPriceOfStockFour() * MainTest.myStockMarket.getVolumeOfStockFour();
		System.out.println(t.getName() + " ���� �򰡾� : " + StockFourMoney);
	}
}
