lass Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxcount = 0;
        int count=0;
        for(int i = 0; i<s.length()-1 ; i++){
        for(int j = i+1; j<s.length() ; j++){

            if(s.charAt[i]!= s.charAt[j]){
                count++;


            }
            maxcount= Math.max(count,maxcount);

        }
        }
        
        return maxcount;
    }
}
