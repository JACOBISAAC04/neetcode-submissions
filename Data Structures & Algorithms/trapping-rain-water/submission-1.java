class Solution {
    public int trap(int[] height) {
        int[] pre = new int[height.length];
        int[] suf = new int[height.length];
        int premax=0;
        int sufmax=0;
        for(int i=0;i<pre.length;i++){
            premax=Math.max(premax,height[i]);
            pre[i]=premax;
        }
        for(int i=suf.length-1;i>=0;i--){
            sufmax=Math.max(sufmax,height[i]);
            suf[i]=sufmax;
        }
        int sum=0;
        for(int i=0;i<height.length;i++){
            sum+=Math.min(pre[i],suf[i])-height[i];
        }
        return sum;
    }
}
