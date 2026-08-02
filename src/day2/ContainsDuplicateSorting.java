package day2;

import java.util.Arrays;

public class ContainsDuplicateSorting {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i=1; i<nums.length; i++){
            if (nums[i]==nums[i-1]){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ContainsDuplicateSorting cds = new ContainsDuplicateSorting();
        int[] nums = {1,2,4,3,1,2};
        System.out.println(cds.containsDuplicate(nums));
    }
}
