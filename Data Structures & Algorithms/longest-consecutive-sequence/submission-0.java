class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums == null || nums.length==0){
            return 0;
        }
        Set<Integer> numset = new HashSet<>();
        for(int num:nums){
            numset.add(num);
        }
        int maxl=0;
        for(int num:nums){
            if(!numset.contains(num-1)){
                int curnum=num;
                int curl=1;
                while(numset.contains(curnum+1)){
                    curnum+=1;
                    curl+=1;
                }
                maxl = Math.max(maxl,curl);
            }

        }
        return maxl;
    }
}
