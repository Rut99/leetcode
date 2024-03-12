/*
392. Is Subsequence
Example 1:
Input: s = "abc", t = "ahbgdc"
Output: true
Example 2:
Input: s = "axc", t = "ahbgdc"
Output: false
*/

class Solution {
    public boolean isSubsequence(String s, String t) {
       int j = 0;
        int count = 0;
        if(s.length() == 0){
            return true;
        }else if(s.length() > t.length()){
            return false;
        }else if(s.equalsIgnoreCase(t)){
            return true;
        }
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();
        for(int i = 0; i < s.length() ; i++){
            while(j<t.length()){
                if(sArr[i] == tArr[j]){
                    count++;
                    j++;
                    break;
                }else{
                    j++;
                }
            }
            if(count == s.length()){
                return true;
            }
        }
        return false;
    }
}
