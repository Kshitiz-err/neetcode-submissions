class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map=new HashMap();
        for(String s: strs){
            char[] ch=s.toCharArray();Arrays.sort(ch);
            String sorted=new String(ch);
            List<String> l=map.getOrDefault(sorted,new ArrayList());
            l.add(s);
            map.put(sorted,l);
        }
        return new ArrayList(map.values());
    }
}
