class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> str = new HashSet<>();
        int l=0;
        int maxl=0;
        for(int r=0;r<s.length();r++){
            while(str.contains(s.charAt(r))){
                
                str.remove(s.charAt(l));
                l++;
            }
            str.add(s.charAt(r));
            maxl=Math.max(maxl,r-l+1);
        }
        return maxl;
    }
}
