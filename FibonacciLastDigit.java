import java.util.Scanner;

public class FibonacciLastDigit {
    private static int getFibonacciLastDigit(int n) {
        if (n <= 1) {
            return n;
        } else {
            int[] myArray = new int[n];
            for(int i = 0; i < n; i++) {
                if(i < 2) {
                    myArray[i] = i % 10;
                } else {
                    myArray[i] = (myArray[i-1] + myArray[i-2]) % 10;
                }
            }
            return (myArray[n - 1] + myArray[n - 2]) % 10;
        }
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c = getFibonacciLastDigit(n);

        System.out.println(c);
    }
}
