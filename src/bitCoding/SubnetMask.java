package bitCoding;

public class SubnetMask {

	public static void CalcSubnetMask() {
		int subnetmask = 255;
		int onesComplement =  ~ subnetmask;
		int TwosComplement =  ~ subnetmask + 1;
		
		System.out.println("서브넷마스크 : " + toBinaryString(subnetmask));
		System.out.println("1의 보수   : " + toBinaryString(onesComplement));
		System.out.println("2의 보수   : " + toBinaryString(TwosComplement));
		System.out.println("비트 연산   : " + toBinaryString(TwosComplement << 3));
		
		if(255 < subnetmask) 
			System.out.println("클래스 : E 클래스 ");
		//else if(subnetmask < 129)
		//	System.out.println("클래스 : D 클래스 ");
		
		//System.out.println("사용가능한 Host 수 : " + (subnetmask - 2));
	}
	
	public static String toBinaryString(int value) {
		String str = Integer.toBinaryString(value);
			while(str.length()< 32) {
						str = "0"+str;
					}
			return str;
	}
	
	public static void main(String[] args) {
		
		SubnetMask.CalcSubnetMask();
	}

}
