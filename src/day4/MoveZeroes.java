package day4;

import java.util.Arrays;

public class MoveZeroes {
    public static void moveZeroes(int[] nums){
        int j=0;
        for (int i=0; i<nums.length; i++){
            if (nums[i]!=0){
                int temp = nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {0,1,2,0,11,0,4};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
}
