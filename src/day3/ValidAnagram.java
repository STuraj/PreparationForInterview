package day3;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
    public static boolean isAnagram(String s, String t){
        if (s.length()!= t.length()){
            return false;
        }
        Map<Character, Integer> map = new HashMap<>();
        //Count characters in s
        for (char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c,0) + 1);
        }
        //Remove characters using t
        for (char c : t.toCharArray()){
            if (!map.containsKey(c)){
                return false;
            }
            map.put(c, map.get(c)-1);
            if (map.get(c)<0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        ValidAnagram va= new ValidAnagram();
        String s = "timur";
        String t = "urtim";
        System.out.println(isAnagram(s,t));
    }
}
