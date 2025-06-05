class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;

        HashMap<Integer, Integer> h = new HashMap<>();

        for(int i=0;i<n;i++){

            if(h.containsKey(target - nums[i])){
                return new int[]{i,h.get(target - nums[i])};
            }
                else{
                   h.put(nums[i],i);
                }
        }

        return new int[]{0,1};
    }
}
