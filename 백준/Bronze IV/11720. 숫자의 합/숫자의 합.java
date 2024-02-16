import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		String sNum = scanner.next();
		char[] cNum = sNum.toCharArray();
		int sum = 0;
		for(int i = 0; i < cNum.length; i++) {
			sum += cNum[i] - '0';
		}
		System.out.println(sum);

	}

}
