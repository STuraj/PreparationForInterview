package day26;

public class CountVowels {
    public static int countVowels(String str) {
        int count = 0;
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' ||
                    ch == 'i' ||
                    ch == 'o' ||
                    ch == 'u' ||
                    ch == 'e' ||
                    ch == 'o') {
                count++;
            }
        }
        return count;

    }

    public static void main(String[] args) {
        String text = "Java Programming";
        System.out.println(countVowels(text));
    }
}
