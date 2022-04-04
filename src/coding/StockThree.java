package coding;

public class StockThree extends Stock{

	public StockThree(int stockNum, int previousClose, int volume) {
		super(stockNum, previousClose, volume);
	}

	@Override
	public int calcStockPrice() {
		int m = super.getPreviousClose();
		int ratio = 1;
		calcStockPrice = ((int)(m + m*ratio*0.01));
		return ((int)(m + m*ratio*0.01));
	}
}
