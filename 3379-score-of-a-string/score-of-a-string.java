class Solution {
    int sum =0;
    public int scoreOfString(String s) {
        for(int i=0;i<s.length()-1;i++){
            int asci = (int) s.charAt(i);
            int asci1 = (int)s.charAt(i+1);
            sum+=Math.abs(asci-asci1);
        }
        return sum;
        
    }
}