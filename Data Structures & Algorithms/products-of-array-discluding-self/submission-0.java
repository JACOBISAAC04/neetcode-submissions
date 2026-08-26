class Solution {
    public int[] productExceptSelf(int[] nums) {
        int p=1;
        int c=0;
        int[] arr = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                c+=1;
            }
            else{
                p*=nums[i];
            }
        }
        for(int i=0;i<nums.length;i++){
            if(c>1){
                arr[i]=0;
            }
            else if(c==1){
                arr[i]=(nums[i]==0)?p:0;
            }
            else{
                arr[i]=p/nums[i];
            }
            
        }
        return arr;
    }
}  
