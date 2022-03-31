package coding;

import java.util.Random;

public class StockMarket {
	
	private int previousCloseOfStockOne = 13400; 
	private int currentPriceOfStockOne;
	private int volumeOfStockOne = 40;
	
	private int previousCloseOfStockTwo = 49550;
	private int currentPriceOfStockTwo; 
	private int volumeOfStockTwo = 2;
	
	private int previousCloseOfStockThree = 29650;
	private int currentPriceOfStockThree; 
	private int volumeOfStockThree = 3;
	
	private int previousCloseOfStockFour = 39250;
	private int currentPriceOfStockFour;
	private int volumeOfStockFour = 20;
	
	private int previousCloseOfStockFive = 118000;
	private int currentPriceOfStockFive;
	private int volumeOfStockFive = 2;

	public int getPreviousCloseOfStockOne() {
		return previousCloseOfStockOne;
	}

	public int getPreviousCloseOfStockTwo() {
		return previousCloseOfStockTwo;
	}

	public int getPreviousCloseOfStockThree() {
		return previousCloseOfStockThree;
	}

	public int getPreviousCloseOfStockFour() {
		return previousCloseOfStockFour;
	}

	
	public int getPreviousCloseOfStockFive() {
		return previousCloseOfStockFive;
	}
		
	public int getVolumeOfStockOne() {
		return volumeOfStockOne;
	}

	public int getVolumeOfStockTwo() {
		return volumeOfStockTwo;
	}

	public int getVolumeOfStockThree() {
		return volumeOfStockThree;
	}

	public int getVolumeOfStockFour() {
		return volumeOfStockFour;
	}
	
	public int getVolumeOfStockFive() {
		return volumeOfStockFive;
	}
	
	public int getCurrentPriceOfStockOne() {
		return currentPriceOfStockOne;
	}

	public void setCurrentPriceOfStockOne(int currentPriceOfStockOne) {
		this.currentPriceOfStockOne = currentPriceOfStockOne;
	}

	public int getCurrentPriceOfStockTwo() {
		return currentPriceOfStockTwo;
	}

	public void setCurrentPriceOfStockTwo(int currentPriceOfStockTwo) {
		this.currentPriceOfStockTwo = currentPriceOfStockTwo;
	}

	public int getCurrentPriceOfStockThree() {
		return currentPriceOfStockThree;
	}

	public void setCurrentPriceOfStockThree(int currentPriceOfStockThree) {
		this.currentPriceOfStockThree = currentPriceOfStockThree;
	}

	public int getCurrentPriceOfStockFour() {
		return currentPriceOfStockFour;
	}

	public void setCurrentPriceOfStockFour(int currentPriceOfStockFour) {
		this.currentPriceOfStockFour = currentPriceOfStockFour;
	}
	

	public int getCurrentPriceOfStockFive() {
		return currentPriceOfStockFive;
	}

	public void setCurrentPriceOfStockFive(int currentPriceOfStockFive) {
		this.currentPriceOfStockFive = currentPriceOfStockFive;
	}


	public void upperMoney(final int ratio) {
		int m = this.getPreviousCloseOfStockOne();
			setCurrentPriceOfStockOne((int) (m + previousCloseOfStockOne*ratio*0.01));
	}
	
	public void lowerMoney(final int ratio) {
		int m = this.getPreviousCloseOfStockTwo();
		setCurrentPriceOfStockTwo ((int)(m - previousCloseOfStockTwo*ratio*0.01));
	}
	
	public void blueChipMoney(final int ratio) {
		int m = this.getPreviousCloseOfStockThree();
		setCurrentPriceOfStockThree((int)(m + previousCloseOfStockThree*ratio*0.01));
	}
	
	public void forExMoney() {
		int m = this.getPreviousCloseOfStockFour();
			
		Random random = new Random();
		int randomNum = random.nextInt(100);
			
		for (int i=0; i<randomNum; i++) {
			setCurrentPriceOfStockFour(m += i);
		}
	}
	
	public void ifelseExMoney() {
		int m = this.getPreviousCloseOfStockFive();
			
		if (0 <= m && m <= 10000) {
			setCurrentPriceOfStockFive(m + 3000);
		}
		else if (10000 < m && m <= 50000) {
			setCurrentPriceOfStockFive(m + 2500);
		}
		else if (50000 < m && m <= 100000) {
			setCurrentPriceOfStockFive(m + 2000);
		}
		else {
			setCurrentPriceOfStockFive(m + 1500);	
		}
			
	}
}