/*
3. Longest Substring Without Repeating Characters
Example 1:
Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Example 2:
Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:
Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
*/

class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int start = 0;
        int end = 0;
        int length = 0;
        while(end < s.length()){
            if(set.contains(s.charAt(end))){
                while(set.contains(s.charAt(end))){
                    set.remove(s.charAt(start));
                    start++;
                }
                set.add(s.charAt(end));
                end++;
            }else{
                set.add(s.charAt(end));
                end++;
            }
            if(length < set.size()){
                length = set.size();
            }
        }
        return length;
    }
}
