class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> numHash = new HashMap<>();

        for(int i=0; i < nums.length; i++) {
            int comp = target - nums[i];
            if(numHash.containsKey(comp)) {
                return new int[]{numHash.get(comp), i};
            }
            numHash.put(nums[i], i);
        }

        return null;
    }
}