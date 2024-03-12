/*
14. Longest Common Prefix
Example 1:
Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:
Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
*/  
class Solution {
    public String longestCommonPrefix(String[] strs) {
                int count = 0;
        String prefix = strs[0];
        for(String s: strs){
            if(prefix.length() > s.length()){
                prefix = s;
            }
        }
        while(count < strs.length && prefix.length() > 0){
            if(hasPrefix(prefix.toCharArray(), strs[count].toCharArray())){
                count++;
            }else{
                prefix = prefix.substring(0,prefix.length()-1);
                System.out.println(prefix);
            }
        }
        return prefix;
   }

    boolean hasPrefix(char[] prefix, char[] word){
        for(int i = 0; i< word.length && i<prefix.length ; i++){
                if(prefix[i] != word[i]){
                    return false;
                }
            }
        return true;
    }
}
