class Solution {
    public int lengthOfLastWord(String s) {
       int cnt=0;
       for(int i=s.length()-1;i>=0;i--){
           char c = s.charAt(i);
           if(c==' '&&cnt!=0){
              return cnt;
           }
           else if(c!=' '){
               cnt++;
           }
       }
       return cnt;
    }
}
