/*
209. Minimum Size Subarray Sum
Example 1:
Input: target = 7, nums = [2,3,1,2,4,3]
Output: 2
Explanation: The subarray [4,3] has the minimal length under the problem constraint.
Example 2:
Input: target = 4, nums = [1,4,4]
Output: 1
Example 3:
Input: target = 11, nums = [1,1,1,1,1,1,1,1]
Output: 0
*/

class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int start = 0;
        int end = 0;
        int sum = 0;
        int length = Integer.MAX_VALUE;
        ArrayList<Integer> window = new ArrayList<>();
        while(start <= nums.length && end <= nums.length){
            if(sum >= target){
                start++;
                if(length > window.size()){
                    length = window.size();
                }
                if(!window.isEmpty()){
                    sum = sum - window.get(0);
                    window.remove(0);
                }
            }else {
                if(end < nums.length ) {
                    sum += nums[end];
                    window.add(nums[end]);
                }
                end++;
            }
        }
        return length == Integer.MAX_VALUE? 0 : length;
    }
}
