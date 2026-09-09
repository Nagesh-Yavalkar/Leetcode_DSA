class Solution {
    public boolean isSubsequence(String s, String t) {
        int left =0;
        int right =0;
        while(left<t.length()&&right<s.length()){
            if(t.charAt(left)==s.charAt(right)){
                left++;
                right++;
            }else{
                left++;
            }
        }
        return right==s.length();
        
    }
}