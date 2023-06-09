class Solution {
    public int lengthOfLastWord(String s) {
        if(s.length() == 1) return 1;
        int count = 0;
        for(int i = s.length() - 1; i >= 0; i--){
            if(s.charAt(i) != ' '){
                count++;
            }
            else{
                if(count > 0){
                    return count;
                }
            }
        }
        return count;
    }
}
