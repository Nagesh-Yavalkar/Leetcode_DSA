
import java.util.*;

class Solution {
    public List<Integer> findAnagrams(String s, String p) {

        List<Integer> result = new ArrayList<>();

        int n = s.length();
        int m = p.length();

        // If p is longer than s, no anagram is possible
        if (m > n) {
            return result;
        }

        // Frequency of p
        int[] pFreq = new int[26];

        for (int i = 0; i < m; i++) {
            pFreq[p.charAt(i) - 'a']++;
        }

        // Generate every substring of length m
        for (int i = 0; i <= n - m; i++) {

            int[] windowFreq = new int[26];

            // Count frequency of current substring
            for (int j = i; j < i + m; j++) {
                windowFreq[s.charAt(j) - 'a']++;
            }

            // Compare frequencies
            if (Arrays.equals(pFreq, windowFreq)) {
                result.add(i);
            }
        }

        return result;
    }
}