import java.util.Arrays;

class Solution {
    public boolean checkInclusion(String s1, String s2) {

        int n = s1.length();
        int m = s2.length();

        if (n > m) {
            return false;
        }

        char[] sortedS1 = s1.toCharArray();
        Arrays.sort(sortedS1);

        for (int i = 0; i <= m - n; i++) {

            String sub = s2.substring(i, i + n);

            char[] sortedSub = sub.toCharArray();
            Arrays.sort(sortedSub);

            if (Arrays.equals(sortedS1, sortedSub)) {
                return true;
            }
        }

        return false;
    }
}