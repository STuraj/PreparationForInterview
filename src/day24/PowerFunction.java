package day24;

public class PowerFunction {
    public static  int powerFunc(int n, int x){
        int result =1;
        while (n>0){
            if (n%2==1){
                result *=x;
        }
            x*=x;
            n/=2;
    }
        return result;
}

    public static void main(String[] args) {
        System.out.println(powerFunc(2,5));
        System.out.println(powerFunc(5,4));
    }
}