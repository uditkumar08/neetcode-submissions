class Solution {
    public int subarraySum(int[] nums, int k) {

        HashMap<Integer, Integer> mp = new HashMap<>();

        mp.put(0, 1);      // Prefix sum 0 occurs once

        int prefixSum = 0;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {

            prefixSum += nums[i];

            if (mp.containsKey(prefixSum - k)) {
                count += mp.get(prefixSum - k);
            }

            mp.put(prefixSum, mp.getOrDefault(prefixSum, 0) + 1);
        }

        return count;
    }
}