class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>>map=new HashMap<>();
        for(int i=0;i<strs.length;i++){
            String ch = strs[i];
            char []sorted = ch.toCharArray();
            Arrays.sort(sorted);
            String key = new String(sorted);

            if(!map.containsKey(key)){
                map.put(key,new ArrayList<>());
            }
            map.get(key).add(strs[i]);
        }
        return new ArrayList<>(map.values());
    }
}
