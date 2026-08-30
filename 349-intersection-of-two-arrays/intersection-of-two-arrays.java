import java.util.HashSet;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> intersectSet = new HashSet<>();
        
        // 1. Add all numbers from nums1 to set1
        for (int num : nums1) {
            set1.add(num);
        }
        
        // 2. If a number from nums2 is in set1, add it to our intersection set
        for (int num : nums2) {
            if (set1.contains(num)) {
                intersectSet.add(num);
            }
        }
        
        // 3. Convert the intersection set back into an int array
        int[] result = new int[intersectSet.size()];
        int index = 0;
        for (int num : intersectSet) {
            result[index++] = num;
        }
        
        return result;
    }
}
