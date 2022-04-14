package coding;

public class StockFive extends Stock {

	public StockFive(int stockNum, int previousClose, int volume) {
		super(stockNum, previousClose, volume);
	}

	@Override
	public int calcStockPrice() {
		int m = super.getPreviousClose();
		
		if (0 <= m && m <= 10000) {
			calcStockPrice = (m + 3000);
			
			return (m + 3000);
		}
		else if (10000 < m && m <= 50000) {
			calcStockPrice = (m + 2500);
			
			return (m + 2500);
		}
		else if (50000 < m && m <= 100000) {
			calcStockPrice = (m + 2000);
			
			return (m + 2000);
		}
		else {
			calcStockPrice = (m + 1500);
			
			return (m + 1500);	
		}
	}
		
}
