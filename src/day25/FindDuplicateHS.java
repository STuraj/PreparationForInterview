package day25;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateHS {
    public static int findDuplicate(int [] nums){
        Set<Integer> fd = new HashSet<>();
        for (int num :nums){
            if (fd.contains(num)){
                return num;
            }
            fd.add(num);
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {7,6,2,5,4,2,10};
        System.out.println(findDuplicate(nums));
    }
}
