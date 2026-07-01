class Solution {
    public boolean hasDuplicate(int[] nums) {
       HashMap<Integer,Integer>mp=new HashMap<>();
    //    for(int x:nums)mp.put(x,mp.getOrDefault(x,0)+1);

    //    for(int count : mp.values()){
    //     if(count>1)return true;
    //    } 
    for(int x:nums){
        if(mp.containsKey(x)){
            return true;
        }
        mp.put(x,1);
    }
       return false;
    }
}