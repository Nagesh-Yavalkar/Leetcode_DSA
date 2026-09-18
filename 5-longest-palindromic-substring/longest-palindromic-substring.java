class Solution {
    public String longestPalindrome(String s) {
        String longe ="";
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                String sub = s.substring(i,j+1);
                if(ispalindrome(sub)){
                    if(sub.length()>longe.length()){
                        longe = sub;
                    }
                }
            }
        }
        return longe;

        
    }
    public static boolean ispalindrome(String k){
        int left = 0;
        int right = k.length()-1;
        while(left<right){
            if(k.charAt(left)!=k.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}