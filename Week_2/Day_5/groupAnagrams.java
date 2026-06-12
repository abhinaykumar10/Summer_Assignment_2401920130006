class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>>map=new HashMap<>();
        for(String s:strs){
           char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String sb = new String(chars);
          map.putIfAbsent(sb,new ArrayList<>());
          map.get(sb).add(s);
        }
       ArrayList<List<String>>list=new ArrayList<>(map.values());
       return list;
    }
}
