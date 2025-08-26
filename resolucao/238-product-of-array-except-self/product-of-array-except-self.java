class Solution {
    public int[] productExceptSelf(int[] nums) {

        if(nums.length < 1) {
            return new int[0];
        } if (nums.length == 1) {
            return nums;
        }
        int n = nums.length;

        int[] left = new int[n];
        Arrays.fill(left, 1);
        
        for(int i=1; i < n; i++) {
            left[i] = left[i-1] * nums[i-1];
        }

        int[] right = new int[n];
        Arrays.fill(right, 1);
        for(int i = n-2; i >= 0; i--) {
            right[i] = right[i+1] * nums[i+1];
        }
        int[] resultado = new int[n];
        for(int i = 0; i < n; i++) {
            resultado[i] = left[i] * right[i];
        }

        return resultado;

    
    }
}