class Solution {
    public boolean isPalindrome(String s) {
        String nova = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int left = 0;
        int right = nova.length() - 1;

        while(right > left) {
            if(nova.charAt(left) != nova.charAt(right)) {
                return false;
            }
            right--;
            left++;
        }
        return true;
    }
}