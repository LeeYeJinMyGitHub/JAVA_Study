package coding;

import java.text.DecimalFormat;
import java.time.LocalTime;
import java.util.ArrayList;

public class MainTest{
	
	public static void main(String[] args) {
		
		//스레드들을 담을 어레이리스트 생성
		ArrayList<Thread> stockList = new ArrayList<Thread>();
		
		//객체 생성
		Stock StockOne = new StockOne(1,13400,40);
		Thread stockOne = new Thread(StockOne);
		Stock StockTwo = new StockTwo(2,49550,2);
		Thread stockTwo = new Thread(StockTwo);
		Stock StockThree = new StockThree(3,29650,3);
		Thread stockThree = new Thread(StockThree);
		Stock StockFour = new StockFour(4,39250,17);
		Thread stockFour = new Thread(StockFour);
		Stock StockFive = new StockFive(5,118000,2);
		Thread stockFive = new Thread(StockFive);
		
		//만든 객체들을 스레드 어레이리스트에 넣음
		stockList.add(stockOne);
		stockList.add(stockTwo);
		stockList.add(stockThree);
		stockList.add(stockFour);
		stockList.add(stockFive);
		
		LocalTime currentTime = LocalTime.now();
		
		System.out.println("내 주식 잔고");
		System.out.printf("%80s", "현재 시간 : " + currentTime+"\n");
	
		System.out.println("_______________________________________________________________________________");
		//%s 문자열 형식으로 출력
		System.out.printf("%13s %9s %9s %9s %9s %7s %11s" , "번호", "전일종가", "현재가", "전일대비", "등락률", "수량", "평가액\n" );
		System.out.println("_______________________________________________________________________________");
		
		//stock 변수를 증가시키면서 stockList에 있는 객체들을 쓰레드로 돌림
		for (Thread stock : stockList) {
			//NEW 상태 - 시작하지 않은 상태 (호출스택을 생성하지 않은 상태)
			System.out.print(stock.getName());
			//System.out.println(stock.getState());
			
			//start 메소드는 해당 스레드가 작업을 수행하는데 필요한 호출 스택을 생성한다.
			//생성된 호출 스택에 run 메소드를 호출해서 스레드가 작업을 수행한다.
			stock.start();
			
			//Runnable 상태 - 쓰레드가 JVM에서 실행대기 중이거나 실행중인 상태
			//System.out.print(stock.getName());
			//System.out.println(stock.getState());
			
			try {
				//메인쓰레드에서의 총합 계산식이 있으므로 thread join 걸어놓음
				stock.join();
			
				//TERMINATED 상태 - 쓰레드 종효 상태
				//System.out.print(stock.getName());
				//System.out.println(stock.getState());
			} catch (InterruptedException e) {
				//에러 메세지의 발생 근원지를 찾아서 단계별로 에러를 출력
				e.printStackTrace();
			}
		}
		
		/*
		int AllPrice = 
				StockOne.calcStockAllPrice()
				+ StockTwo.calcStockAllPrice()
				+ StockThree.calcStockAllPrice()
				+ StockFour.calcStockAllPrice()
				+ StockFive.calcStockAllPrice()
		; */

		DecimalFormat formatter = new DecimalFormat("#,##0");
		currentTime = LocalTime.now();
		
		System.out.println("_______________________________________________________________________________");
		System.out.printf(
		    "%79s","종합 평가액 : "  
			+ formatter.format(Stock.allPrice)		
			+ " \u20A9"
			+ "\n"
		);
		System.out.printf("%80s", "갱신 시간 : " + currentTime+"\n");
	}

}
