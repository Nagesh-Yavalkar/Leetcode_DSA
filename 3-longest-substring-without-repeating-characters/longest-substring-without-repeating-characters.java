class Solution {
    public int lengthOfLongestSubstring(String s) {

        HashSet<Character> h = new HashSet<>();
        int maxlength = 0;
        int left =0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            
            while(h.contains(ch)){
                h.remove(s.charAt(left));
                left++;
            }
            h.add(ch);
            int length = i-left+1;
            maxlength = Math.max(maxlength,length);
        }
        return maxlength;
        
    }
}