class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> res = new HashMap<>();
        for(String s:strs){
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            String sorts = new String(arr);
            res.putIfAbsent(sorts,new ArrayList<>());
            res.get(sorts).add(s);
        }
        return new ArrayList<>(res.values());

    }
}
