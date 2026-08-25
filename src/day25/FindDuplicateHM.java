package day25;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicateHM {
    public static int findDuplicate(int [] arr){
        Map<Integer, Integer> fd = new HashMap<>();
        for (int arrs : arr){
            fd.put(arrs, fd.getOrDefault(arrs, 0) + 1);
            if (fd. get(arrs)==2){
                return arrs;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int [] arrs= {8,9,3,4,1,6,3};
        System.out.println(findDuplicate(arrs));
    }
}
