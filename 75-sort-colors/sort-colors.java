class Solution {
    public void sortColors(int[] nums) {
        int max = nums[0];
        for(int num:nums){
            if(num>max){
                max = num;
            }
        }
        int count[] = new int[max+1];
        for(int num:nums){
            count[num]++;
        }
        int index = 0;
        for(int i = 0;i<count.length;i++){
            while(count[i]>0){
                nums[index]=i;
                index++;
                count[i]--; 
            }
        }

    }
}