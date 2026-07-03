class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer>mp=new HashMap<>();
        for(int x:nums){
            mp.put(x,mp.getOrDefault(x,0)+1);
        }
        
        for(int key:mp.keySet()){
         if(mp.get(key)>nums.length/2)return key;
        }
        return -1;
    }
}