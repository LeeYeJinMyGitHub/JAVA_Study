package bitCoding;

public class SubnetMask {

	public static void CalcSubnetMask() {
		int subnetmask = 255;
		int onesComplement =  ~ subnetmask;
		int TwosComplement =  ~ subnetmask + 1;
		
		System.out.println("����ݸ���ũ : " + toBinaryString(subnetmask));
		System.out.println("1�� ����   : " + toBinaryString(onesComplement));
		System.out.println("2�� ����   : " + toBinaryString(TwosComplement));
		System.out.println("��Ʈ ����   : " + toBinaryString(TwosComplement << 3));
		
		if(255 < subnetmask) 
			System.out.println("Ŭ���� : E Ŭ���� ");
		//else if(subnetmask < 129)
		//	System.out.println("Ŭ���� : D Ŭ���� ");
		
		//System.out.println("��밡���� Host �� : " + (subnetmask - 2));
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
