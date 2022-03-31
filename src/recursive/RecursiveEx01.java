package recursive;

public class RecursiveEx01 {

	public static void main(String[] args) {
		System.out.println(normalSums(2));

	}
	public static int normalSums(int arg) {
		System.out.println("in : " + arg);
		
		if (arg > 5) {
			System.out.println("end : " + arg);
			return arg;
		} else {
			System.out.println("out : " + arg);
		}
		return normalSums(arg+1);
		
	}

}
