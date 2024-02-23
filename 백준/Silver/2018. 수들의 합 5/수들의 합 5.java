
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int count = 1; // n이 5일 때, 숫자 5만 뽑는 경우의 수를 미리 생각!
		int start_index = 1;
		int end_index = 1;
		int sum = 1;
		
		while(end_index != n) {
			if(sum == n) {
				count++;
				end_index++;
				sum = sum + end_index;
			}
			else if(sum > n) {
				sum = sum - start_index;
				start_index++;
			}
			else {
				end_index++;
				sum = sum + end_index;
			}
		}
		System.out.println(count);

	}

}
