class Solution {
    public int[][] merge(int[][] intervals) {
        ArrayList<int[]> list = new ArrayList<>();
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        int[] curr = intervals[0];
        for (int i = 0; i < intervals.length; i++){
            if (intervals[i][0] <= curr[1]) {
                curr[1] = Math.max(curr[1], intervals[i][1]);
            } else {
                list.add(curr);
                curr = intervals[i];
            }
        }
        list.add(curr);
        int[][] ans = new int[list.size()][2];
        for (int i = 0; i < list.size(); i++){
            ans[i][0] = list.get(i)[0];
            ans[i][1] = list.get(i)[1];
        }

        return ans;
    }
}
