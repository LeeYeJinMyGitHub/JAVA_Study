package coding;

public class Stock {
	
	private int stockNum;
	private int previousClose;     //전일 종가
	protected int calcStockPrice;  //현재가 (종목 별 계산에 따른)
	private int volume;            //수량
	
	public Stock(int stockNum, int previousClose, int volume) {
		this.stockNum = stockNum;

		if (previousClose >= 0 && volume >= 0 ) {
			this.previousClose = previousClose;
			this.volume = volume;
		} else if (previousClose < 0) {
			throw new IllegalArgumentException("전일 종가를 잘못 입력하였습니다.");
		} else if (volume < 0) {
			throw new IllegalArgumentException("보유수량을 잘못 입력하였습니다.");
		}		
	}
	
	public int getStockNum() {
		return stockNum;
	}

	public void setStockNum(int stockNum) {
		this.stockNum = stockNum;
	}
	
	public int getPreviousClose() {
		return previousClose;
	}
	
	public void setPreviousClose(int previousClose) {
		this.previousClose = previousClose;
	}
	
	public int calcStockPrice() {
		return calcStockPrice;
	}
	
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	public double calcFluctuationRate() {	
		return (((double)calcFluctuation()/(double)previousClose)*100);
	}
	
	public int calcStockAllPrice() {
		return calcStockPrice * volume;
	}
	
	public int calcFluctuation() {
		return calcStockPrice - previousClose;
	}
	
	public void showStockInfo() {
		System.out.format("%5s %10s %10s %10s %10s %10s %10s", 
				("종목 "+ getStockNum()),
				(getPreviousClose() + " \u20A9"), 
				(calcStockPrice() + " \u20A9"), 
				(calcFluctuation()  + " \u20A9"),
				((int)calcFluctuationRate() + " %"),
				(getVolume()),
				(calcStockAllPrice() + " \u20A9")
				);
		System.out.println();
	}

}
