

import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 수열의 개수
		int[] A = new int[N]; // 숫자가 들어갈 배열의 개수 ==> N개
		
		for(int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}
		Stack<Integer> stack = new Stack<>();
		StringBuffer bf = new StringBuffer();
		int num =  1; // 오름차순 수
		boolean result = true; // true이면 +  출력
		
		for(int i = 0; i < A.length; i++) {
			int su = A[i]; // 현재 수열의 수
			if(su >= num) {
				while (su >= num) {
					stack.push(num++);
					bf.append("+\n");
				}
				stack.pop();
				bf.append("-\n");
			}
			else {
				int n = stack.pop();
				if(n > su) {
					System.out.println("NO");
					result = false;
					break;
				}
				else {
					bf.append("-\n");
				}
			}
		}
		if(result) System.out.println(bf.toString());
	}

}
