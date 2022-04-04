package coding;

import java.time.LocalTime;
import java.util.ArrayList;

public class MainTest{
	
	public static void main(String[] args){
		
		ArrayList<Stock> stockList = new ArrayList<Stock>();
		
		Stock stockOne = new StockOne(1,13400,40);
		Stock stockTwo = new StockTwo(2,49550,2);
		Stock stockThree = new StockThree(3,29650,3);
		Stock stockFour = new StockFour(4,39250,17);
		Stock stockFive = new StockFive(5,118000,2);
		Stock stockSix = new StockFive(6,118000,2);
		
		stockList.add(stockOne);
		stockList.add(stockTwo);
		stockList.add(stockThree);
		stockList.add(stockFour);
		stockList.add(stockFive);
		stockList.add(stockSix);
		
		LocalTime displayTime = LocalTime.now();
		
		System.out.println("내 주식 잔고");
		System.out.println("현재 시간 : " + displayTime);
	
		System.out.println("____________________________________________________________________________");
		System.out.printf("%5s %9s %8s %8s %9s %10s %9s" , "번호", "전일종가", "현재가", "전일대비", "등락률", "수량", "평가액" );
		System.out.println();
		System.out.println("____________________________________________________________________________");
		
		for (Stock stock : stockList){
				stock.showStockInfo();			
		}
	
		displayTime = LocalTime.now();
		System.out.println("____________________________________________________________________________");
		
		int AllPrice = 0;
		for (Stock stock : stockList){
			AllPrice += stock.calcStockAllPrice();
		}	
		
		System.out.println(
			"                                                    종합 평가액 : "  
			+ AllPrice		
			+ " \u20A9"
		);
		
		System.out.println("갱신 시간 " + displayTime);
		
	}

}
