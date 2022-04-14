package coding;

import java.util.Random;

public class StockFour extends Stock {

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
		calcStockPrice = ((int)(m + m*(randomNum*0.01)));
		
		return calcStockPrice;
	}	

}
