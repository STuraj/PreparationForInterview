package day2;

import java.util.HashSet;

public class ContainsDuplicate {
    public boolean containsDuplicate(int [] nums){
        HashSet<Integer> set = new HashSet<>();
        for (int num:nums){
            if (set.contains(num)){
                return  true;
            }
            set.add(num);
        }
        return false;
    }

    public static void main(String[] args) {
        ContainsDuplicate cd = new ContainsDuplicate();
        int[] nums = {1,3,5,4,3,6,2};
        System.out.println(cd.containsDuplicate(nums));
    }
}
