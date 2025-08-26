class Solution {
    public int[] twoSum(int[] nums, int target) {

        if(nums.length < 1) {
            return null;
        }

        int[] resultado = new int[2];
        
        for(int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            for (int j = i+1; j < nums.length; j++) {
                if(complement == nums[j]) {
                    resultado = new int[]{i,j};
                    return resultado; 
                }
            }
        }
        return null;
    }
}