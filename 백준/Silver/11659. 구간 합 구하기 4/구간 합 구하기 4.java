
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
		
		// suNo -> 숫자 개수, quiNo -> 질의 개수
		int suNo = Integer.parseInt(stringTokenizer.nextToken());
		int quiNo = Integer.parseInt(stringTokenizer.nextToken());
		
		long[] s = new long[suNo + 1];
		stringTokenizer = new StringTokenizer(bufferedReader.readLine());
		for(int i = 1; i <= suNo; i++) {
			s[i] = s[i-1] + Integer.parseInt(stringTokenizer.nextToken());
		}
		for(int q = 0; q < quiNo; q++) {
			stringTokenizer = new StringTokenizer(bufferedReader.readLine());
			int i = Integer.parseInt(stringTokenizer.nextToken());
			int j = Integer.parseInt(stringTokenizer.nextToken());
			System.out.println(s[j] - s[i-1]);
		}

	}

}
