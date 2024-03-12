/*
228. Summary Ranges  
Example 1:
Input: nums = [0,1,2,4,5,7]
Output: ["0->2","4->5","7"]
Explanation: The ranges are:
[0,2] --> "0->2"
[4,5] --> "4->5"
[7,7] --> "7"
Example 2:
Input: nums = [0,2,3,4,6,8,9]
Output: ["0","2->4","6","8->9"]
Explanation: The ranges are:
[0,0] --> "0"
[2,4] --> "2->4"
[6,6] --> "6"
[8,9] --> "8->9"
*/

class Solution {
    public List<String> summaryRanges(int[] nums) {
        int start = 0; 
        int end = 0;
        String range = "";
        int i = 0;
        ArrayList<String> op = new ArrayList<>();
        while(i < nums.length){
            range = String.valueOf(nums[start]);
            i++;
            if(i < nums.length){
                if((nums[end]+1) == nums[i]){
                    end++;
                }else{
                    if(start != end){
                        range = range + "->" + nums[end];
                    }
                    op.add(range);
                    range = "";
                    start = i;
                    end = i;
                }
            } else {
                if(start != end){
                range = range + "->" + nums[end];
                }
                op.add(range);
            }
        }
        return op;
    }
}
