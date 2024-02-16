import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 시험 본 과목의 개수
		int a[] = new int[n]; // 각 과목의 시험 성적, 점수를 1차원 배열에 일단 저장
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		
		long sum = 0;
		long max = 0;
		
		for(int i = 0; i < n; i++) {
			if(a[i] > max) max = a[i];
			sum += a[i];
		}
		
		System.out.println(sum * 100.0 / max / n);
	

	}

}
