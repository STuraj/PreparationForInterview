package day22;

public class FindMaxArray {
    public static int findMaxArray(int [] arr){
        int max = arr[0];
        for (int i=1; i<arr.length; i++){
            if (arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int [] arr = {3,5,11,7,15};
        int result =findMaxArray(arr);
        System.out.println("Maximum value: " +result);
    }
}
