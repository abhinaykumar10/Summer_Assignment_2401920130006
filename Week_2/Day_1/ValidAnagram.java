import java .util.HashMap;
class Solution {
    public boolean isAnagram(String s, String t) {
     
     if(s.length()!=t.length()) return false;
     int [] frequency = new int [26];
     for(int i =0;i<s.length();i++){
        frequency[s.charAt(i) -'a']++;
        frequency[t.charAt(i) -'a']--;
     }
     for(int count:frequency){
        if(count!=0) return false;
             
     }
     return true;

}


}

//       if (s.length()!=t.length()) return false;
//     HashMap<Character,Integer>mp1 = frequency(s);
//     HashMap<Character,Integer>mp2 = frequency(t);
      
//      return mp1.equals(mp2);



//     }


//    public static HashMap<Character,Integer>frequency(String str ){
//     HashMap<Character,Integer>mp = new HashMap<>();
//     for(int i = 0 ; i<str.length();i++){
//         Character ch = str.charAt(i);
//        if(!mp.containsKey(ch)){
//         mp.put(ch,1);
//        }
//        else{
//           mp.put(ch,mp.get(ch)+1);
//        }
        
//     }
//     return mp;
// }
// }
