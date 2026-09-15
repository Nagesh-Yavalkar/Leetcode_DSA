class Solution {
    public int longestPalindrome(String s) {
        Set<Character> ch = new HashSet<>();
        int count =0;
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(ch.contains(c)){
                ch.remove(c);
                count++;
            }else{
                ch.add(c);
            }

        }
        count*=2;
        if(!ch.isEmpty()){
            count++;
        }
        return count;
        
    }
}