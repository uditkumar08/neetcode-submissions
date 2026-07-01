class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer>mp=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int leftover = target-nums[i];
            if(mp.containsKey(leftover)){
                return new int[]{mp.get(leftover),i};

            }
            mp.put(nums[i],i);
        }
        return new int[]{-1,-1};
    }
}
