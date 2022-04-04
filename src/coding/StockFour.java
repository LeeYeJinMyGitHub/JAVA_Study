package coding;

import java.util.Random;

public class StockFour extends Stock{

	public StockFour(int stockNum, int previousClose, int volume) {
		super(stockNum, previousClose, volume);
	}

	@Override
	public int calcStockPrice() {
		int m = super.getPreviousClose();
		Random random = new Random();
		int max = 30;
		int min = -30;
		int randomNum = random.nextInt(max-min+1)+min;
		//int randomNum = (int)(Math.random()*60)- 1;
		calcStockPrice = ((int)(m + m*(randomNum*0.01)));
		//System.out.println(randomNum + "," + calcStockPrice);
		return calcStockPrice;
	}
	
}
