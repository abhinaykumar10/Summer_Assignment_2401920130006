class Solution {
    public int compress(char[] chars) {
        int i = 0;
        int j =0;

        while(i<chars.length){
            char ch = chars[i];
            int count =0;

            while(i<chars.length && chars[i]==ch){
                i++;
                count++;
            }
            chars[j++]=ch;
            if(count>1){
                String num = count+"";
                for(int s = 0;s<num.length();s++){
                    chars[j++]=num.charAt(s);
                   
                }   
            }
        }
        return j;
        
    }
}
