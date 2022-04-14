package coding;

import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class MainTest{	
	
	public static void main(String[] args) {
		
		//스레드들을 담을 어레이리스트 생성
		ArrayList<Thread> stockList = new ArrayList<Thread>();
		//ArrayList<Stock> stockList2 = new ArrayList<Stock>();
		
		//객체 생성
		Stock StockOne = new StockOne(1,13400,40);
		Thread tStockOne = new Thread(StockOne);
		Stock StockTwo = new StockTwo(2,49550,2);
		Thread tStockTwo = new Thread(StockTwo);
		Stock StockThree = new StockThree(3,29650,3);
		Thread tStockThree = new Thread(StockThree);
		Stock StockFour = new StockFour(4,39250,17);
		Thread tStockFour = new Thread(StockFour);
		Stock StockFive = new StockFive(5,118000,2);
		Thread tStockFive = new Thread(StockFive);
		
		//만든 객체들을 스레드 어레이리스트에 넣음
		stockList.add(tStockOne);
		stockList.add(tStockTwo);
		stockList.add(tStockThree);
		stockList.add(tStockFour);
		stockList.add(tStockFive);
		
		/*
		stockList2.add(StockOne);
		stockList2.add(StockTwo);
		stockList2.add(StockThree);
		stockList2.add(StockFour);
		stockList2.add(StockFive);
		*/

		LocalDateTime currentTime = LocalDateTime.now();
		String paresdTime = currentTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss:SS"));
		
		System.out.println("내 주식 잔고");
		System.out.printf("%80s", "현재 시간 : " + paresdTime+"\n");
	
		System.out.println("_______________________________________________________________________________");
		System.out.printf("%13s %9s %9s %9s %9s %7s %11s" , "번호", "전일종가", "현재가", "전일대비", "등락률", "수량", "평가액\n" );
		System.out.println("_______________________________________________________________________________");
		
		//stock 변수를 증가시키면서 stockList에 있는 객체들을 쓰레드로 돌림
		for (Thread stock : stockList) {
			
			System.out.print(stock.getName());
			stock.start();
			
			try {
				//메인쓰레드에서의 총합 계산식이 있으므로 thread join 걸어놓음
				stock.join();

			} catch (InterruptedException e) {
				//에러 메세지의 발생 근원지를 찾아서 단계별로 에러를 출력
				e.printStackTrace();
			}
		}
		
		/*
		int stockALLPrice = 0 ;
			
		for (Stock stock : stockList2) {
				stockALLPrice += stock.calcStockAllPrice();
		}
		
		System.out.println(stockALLPrice);
		*/
		
		DecimalFormat formatter = new DecimalFormat("#,##0");
		
		currentTime = LocalDateTime.now();
		paresdTime = currentTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss:SS"));
		
		System.out.println("_______________________________________________________________________________");
		System.out.printf(
		    "%79s","종합 평가액 : "  
			+ formatter.format(Stock.getsTotalPrice())
			+ " \u20A9"
			+ "\n"
		);
		System.out.printf("%80s", "갱신 시간 : " + paresdTime+"\n");
	}

}
