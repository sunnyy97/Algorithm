import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        for(int i = 0; i <testCase; i++) {
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            int result = num1 * num2 / gcd(num1, num2);
            System.out.println(result);
        }
    }

    static int gcd (int num1, int num2) {
        if(num2 == 0) return num1;
        else return gcd(num2, num1 % num2);
    }
}