package day14;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static  int findMajorityElement(int [] nums){
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums){
            map.put(num, map.getOrDefault(num, 0) +1);
            if (map.get(num)> nums.length/2) {
                return num;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int [] nums = {2,2,1,1,1,2,2};
        System.out.println(findMajorityElement(nums));
    }
}
