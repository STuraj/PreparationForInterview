package day16;

public class FibonacciNumber {
    public static int fibonacci(int n){
        if (n<=1){
            return n;
        }
        int prev =0;
        int curr =1;
        for (int i=2; i<=n; i++){
            int next = prev+curr;
            prev=curr;
            curr=next;
        }
        return curr;
    }

    public static void main(String[] args) {
        int n=10;
        System.out.println(fibonacci(n));
    }
}
