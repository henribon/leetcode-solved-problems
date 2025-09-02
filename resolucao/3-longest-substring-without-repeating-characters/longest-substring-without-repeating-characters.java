class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxSubSequence = 0;
        int momentaniumSub = 0;
        int right = 0;
        int left = 0;
        String sub = "";

        while(right < s.length()) {
            if(!sub.contains(String.valueOf(s.charAt(right)))) {
                momentaniumSub++;
                sub += s.charAt(right);
                maxSubSequence = Math.max(momentaniumSub, maxSubSequence);
                right++;
            } else {
                left++;
                right = left;
                momentaniumSub = 0;
                sub ="";
            }
        }

        return maxSubSequence;     
    }
}