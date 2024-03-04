
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 입력값을 String으로 받고 substring()함수를 이용해 자릿수 단위로 분리를 먼저 함
		Scanner sc = new Scanner(System.in);
		String string = sc.next();
		int A[] = new int[string.length()];
		for(int i = 0; i < string.length(); i++) {
			A[i] = Integer.parseInt(string.substring(i, i+1));
		}
		
		for(int i = 0; i < string.length(); i++) {
			int max = i;
			for(int j = i + 1; j < string.length(); j++) {
				if(A[j] > A[max]) {
					max = j;
				}
			}
			if(A[i] < A[max]) {
				int temp = A[i];
				A[i] = A[max];
				A[max] = temp;
			}
		}
		
		for(int i = 0; i < string.length(); i++) {
			System.out.print(A[i]);
		}

	}

}
