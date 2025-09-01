class Solution {
    public int maxArea(int[] height) {

        int resultado = 0;
        int right = height.length - 1;
        int left = 0;
        while(left < right) {
            int column = Math.min(height[left], height[right]);
            resultado = Math.max(resultado, column * (right - left));

            if (height[left] < height[right]) {
                left ++;
            }
            else {
                right--;
            }
        }

        return resultado;


    }
}