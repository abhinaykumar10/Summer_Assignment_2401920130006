class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
      for(char i:s.toCharArray()){
        if(Character.isLetterOrDigit(i)){
            sb.append(Character.toLowerCase(i));
        }
      }
        String ab = sb.toString();
      
        int i = 0;
         int j = ab.length()-1;
        while(i<j){
            if(ab.charAt(i)!=ab.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
        
    }
}
