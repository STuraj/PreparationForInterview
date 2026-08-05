package day4;

public class MoveZeroesOrder {
    //Move zeroes to end
    //keep the order of numbers
    public static void moveZeroes(int [] nums){
        int index =0;
        for (int i=0; i<nums.length; i++){
            if (nums[i]!=0){
                nums[index]=nums[i];
                index++;
            }
        }
        while (index<nums.length){
            nums[index]=0;
            index++;
        }
    }

    public static void main(String[] args) {
        int[] nums = {0,1,2,0,4,0,3};
        moveZeroes(nums);
        for (int num : nums){
            System.out.print(num + " ");
        }
    }
}
