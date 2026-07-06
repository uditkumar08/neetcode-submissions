class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;

        // for(int i=1;i<=n+1;i++){
        //     boolean found=false;
        //     for(int j=0;j<n;j++){
        //         if(nums[j]==i){
        //             found=true;
        //             break;
        //         }
                
        //     }
        //     if(!found)return i;
        // }
        // return n+1;

        // using hasset

        HashSet<Integer>set=new HashSet<>();
        int findno=1;

        for(int num:nums)set.add(num);

        for(int num:nums){
            if(!set.contains(findno)){
                return findno;
            }
            findno++;
        }
        return findno;
    }
}