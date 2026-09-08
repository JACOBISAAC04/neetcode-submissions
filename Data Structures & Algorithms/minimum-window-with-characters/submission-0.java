class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character,Integer> have = new HashMap<>();
        HashMap<Character,Integer> need = new HashMap<>();
        if(s.length()<t.length()){
            return "";
        }
        int havecount=0;
        
        String res="";
        int l=0;
        int minl = Integer.MAX_VALUE;
        for(int i=0;i<t.length();i++){
            need.put(t.charAt(i),(need.getOrDefault(t.charAt(i),0)+1));
        }
        int needcount=need.size();
        for(int r=0;r<s.length();r++){
            char c = s.charAt(r);
            if(need.containsKey(c)){
                have.put(c,have.getOrDefault(c,0)+1);
                if(have.get(c).equals(need.get(c))){
                    havecount++;
                }
            }
            while(havecount==needcount){
                if(r-l+1<minl){
                    minl = r-l+1;
                    res=s.substring(l,r+1);
                }
                char leftchar=s.charAt(l);
                if(need.containsKey(leftchar)){
                    if (have.get(leftchar).equals(need.get(leftchar))) {
                        havecount--;
                    }

                    have.put(leftchar, have.get(leftchar) - 1);
                }
                l++;
            }
        }
        return res;
    }
}
