
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Queue<Integer> myQueue = new LinkedList<Integer>();
		
		for(int i = 1; i <= N; i++) {
			myQueue.add(i);
		}
		while (myQueue.size() > 1) {
			myQueue.poll();
			myQueue.add(myQueue.poll());
		}
		System.out.println(myQueue.poll());

	}

}
