package recursive;

public class RecursiveEx02 {
	
    public static void main(String[] args) {
        // 0���� 8������ �Ǻ���ġ �� ��� ���
        for (int i=0; i<9; i++) {
            System.out.printf("%d\t", fibo(i));
        }
    }

    public static int fibo(int n) {
        // ���޹��� ���� ������ ���� �����Ѵٸ� ����� �ʿ䰡 �����Ƿ� �ߴ�
        if (n <= 1) {
            return n;
        } else {
            return fibo(n-2) + fibo(n-1);
        }
    }
}
