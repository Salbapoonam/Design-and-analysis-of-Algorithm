import java.util.Scanner;

public class Factorial_iterative_recursive {

    public static long factorialIterative(int n) {
        if (n < 0) {
            return -1; // factorial is not define
        }
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static long factorialRecursive(int n)
    {
        if(n<0)
     {
        return -1;  // factorial is not define
     }
     if(n==0 || n==1)
     {
        return 1;
     }
     return n*factorialRecursive(n-1);
    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ehich have factorial :");
        n = sc.nextInt();
        sc.close();

        long iterativeResult = factorialIterative(n);
        long recursiveResult = factorialRecursive(n);

        System.out.println("Factorial of "+ n +" using itrative method is " + iterativeResult);
         System.out.println("Factorial of "+ n +" using recursive method is " + recursiveResult);

    }
}
