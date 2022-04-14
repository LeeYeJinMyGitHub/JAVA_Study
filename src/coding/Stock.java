package coding;

import java.text.DecimalFormat;

public class Stock implements Runnable{
	
	private int stockNum;
	private int previousClose;        //전일 종가
	private int volume;               //수량	
	
	protected int calcStockPrice;     //현재가 (종목 별 계산에 따른)
	private static int sTotalPrice;   //모든 종목 총합 가격
	
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

	public int getPreviousClose() {
		return previousClose;
	}
	
	public int calcStockPrice() {
		return calcStockPrice;
	}
	
	public int getVolume() {
		return volume;
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
	
	public static int getsTotalPrice() {
		return sTotalPrice;
	}

	public void setsTotalPrice() {
		sTotalPrice += calcStockAllPrice();
	}
	
	public void showStockInfo() {
		
		DecimalFormat formatter = new DecimalFormat("#,##0");
		
		System.out.format
				("%5s %11s %10s %10s %10s %8s %12s", 
				("종목 "+ getStockNum()),
				(formatter.format(getPreviousClose()) + " \u20A9"), 
				(formatter.format(calcStockPrice()) + " \u20A9"), 
				(formatter.format(calcFluctuation()) + " \u20A9"),
				(String.format("%.2f",calcFluctuationRate()) + " %"),
				(getVolume()),
				(formatter.format(calcStockAllPrice()) + " \u20A9\n")
				);

	}
	
	@Override
	public void run() {
		showStockInfo();
		setsTotalPrice();
	}

}
