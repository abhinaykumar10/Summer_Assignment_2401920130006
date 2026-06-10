class Solution {
    public boolean isSubsequence(String s, String t) {
   if("".equals(s)) return true;

  int i =0;
  int l=s.length();
  for(char ch :t.toCharArray() ){
    if(s.charAt(i)==ch) {
        i++;
    }
    if(i==l) return true;
  }
  return false;
    }
}
