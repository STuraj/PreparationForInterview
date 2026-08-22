package day22;

public class FindMinArray {
    public static int  findMinArray(int [] nums){
        int min = nums[0];
        for (int i=1; i<nums.length; i++){
            if (nums[i]<min){
                min=nums[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] nums = {12, 3, 10,1, 8,2};

        System.out.println(findMinArray(nums));
    }
}
