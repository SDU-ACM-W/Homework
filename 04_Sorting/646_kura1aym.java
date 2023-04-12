class Solution {
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs, (a, b) -> a[1] - b[1]); 
        int cnt = 1;
        int[] cur = pairs[0];
        for (int i = 1; i < pairs.length; i++) {
            if (pairs[i][0] > cur[1]) {
                cnt++;
                cur = pairs[i];
            }
        }
        return cnt;
    }
}
