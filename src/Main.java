//        inner class / jvm .... / upcastin class / Bufferstring /interface & abstract / enum class / annotation
//        / anonymous class / THREAD , RUNNABLE / collection API

import java.util.Arrays;

class Solution {
    public boolean isAnagram(String s, String t) {
        char[] sortedStr1 = s.toCharArray();
        char[] sortedStr2 = t.toCharArray();

        Arrays.sort(sortedStr1);
        Arrays.sort(sortedStr2);

        String sortedString1 = new String(sortedStr1);
        String sortedString2 = new String(sortedStr2);

        return sortedString1.equals(sortedString2);


    }
}


public class Main {
    public static void main(String[] args) {
            Solution solution = new Solution();
            solution.isAnagram("rat", "car");
    }
}