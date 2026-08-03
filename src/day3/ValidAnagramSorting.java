package day3;

import java.util.Arrays;

public class ValidAnagramSorting {
    public static boolean isAnagram(String s, String t){
        if (s.length()!=t.length()){
            return false;
        }
        char[] first = s.toCharArray();
        char[] second = t.toCharArray();
        Arrays.sort(first);
        Arrays.sort(second);
        return Arrays.equals(first,second);
    }

    public static void main(String[] args) {
        ValidAnagramSorting va = new ValidAnagramSorting();
        String s = "suzan";
        String t = "sanzu";
        System.out.println(isAnagram(s,t));
    }
}
