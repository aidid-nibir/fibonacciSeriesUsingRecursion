import java.util.Scanner;
class fibonacciSeriesUsingRecursion {
    static int fibonacci(int n){
        if(n<=1){
            return n;
        }
        else {
            return fibonacci(n-1)+ fibonacci(n-2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter which term you want to print from Fibonacci Series");
        int n = sc.nextInt();
        System.out.println(fibonacci(n));
    }
}
