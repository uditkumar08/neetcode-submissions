class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prod=1;
        int zero=0;
       for(int x:nums){
        if(x==0)zero++;
        else prod*=x;

       }

        int res[]=new int[nums.length];

        for(int i=0;i<nums.length;i++){
         if(zero>1)res[i]=0;

         else if(zero==1){
            if(nums[i]==0)res[i]=prod;
            else res[i]=0;
         }else{
            res[i]=prod/nums[i];
         }
        }
        return res;
    }
}  
