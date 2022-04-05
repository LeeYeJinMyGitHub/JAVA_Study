package coding;

public class StockTwo extends Stock {

	public StockTwo(int stockNum, int previousClose, int volume) {
		super(stockNum, previousClose, volume);
	}
	
	@Override
	public int calcStockPrice() {
		int m = super.getPreviousClose();
		int ratio = -30;
		calcStockPrice = ((int)(m + m*ratio*0.01));
		return ((int)(m + m*ratio*0.01));
		
	}
	@Override
	public void run() {
		showStockInfo();
		allPrice += calcStockAllPrice();
	}
			
}
