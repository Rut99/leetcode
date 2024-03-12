/*
997. Find the Town Judge
Example 1:
Input: n = 2, trust = [[1,2]]
Output: 2
Example 2:
Input: n = 3, trust = [[1,3],[2,3]]
Output: 3
Example 3:
Input: n = 3, trust = [[1,3],[2,3],[3,1]]
Output: -1
*/

class Solution {
    public int findJudge(int n, int[][] trust) {
        HashMap<Integer, ArrayList<Integer>> trustMe = new HashMap<>();
        Set<Integer> ppl = new HashSet<>();
        int probableJudge = -1;
        if(n == 1){
            return 1;
        }
        for(int[] a : trust){
            if(trustMe.containsKey(a[1])){
                ArrayList<Integer> li = trustMe.get(a[1]);
                li.add(a[0]);
                trustMe.put(a[1], li);
                if(li.size() == n-1){
                    probableJudge = a[1];
                }
            }else{
                ArrayList li = new ArrayList<Integer>();
                li.add(a[0]);
                trustMe.put(a[1], li);
                if(li.size() == n-1){
                    probableJudge = a[1];
                }
            }
            ppl.add(a[0]);
        }
        if(ppl.contains(probableJudge)){
            return -1;
        }else{
            return probableJudge;
        }
    }
}
