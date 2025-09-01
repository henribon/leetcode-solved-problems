class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int left = 0;
        int right = k;
        double soma = 0;

        for(int i = 0; i < k; i++) {
            soma += nums[i];
        }

        double maiorSoma = soma;

        while(right < nums.length) {

            soma -= nums[left];
            left++;

            soma += nums[right];
            right++;

            maiorSoma = Math.max(soma, maiorSoma);

        }

        return maiorSoma / k;
    }
}