/*
219. Contains Duplicate II
Example 1:
Input: nums = [1,2,3,1], k = 3
Output: true
Example 2:
Input: nums = [1,0,1,1], k = 1
Output: true
Example 3:
Input: nums = [1,2,3,1,2,3], k = 2
Output: false
*/

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int i = 0;
        int j = k;
        Set<Integer> window = new HashSet<>();
        for(int l = 0; l < nums.length && l <= k; l++){
            if(window.contains(nums[l])){
                return true;
            }else {
                window.add(nums[l]);
            }
        }
        while(j < nums.length ){
            window.remove(nums[i]);
            i++;
            j++;
            if(j < nums.length) {
                if (window.contains(nums[j])) {
                    return true;
                } else {
                    window.add(nums[j]);
                }
            }
        }
        return false;
    }
}
