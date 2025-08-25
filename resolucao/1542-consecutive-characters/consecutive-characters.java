class Solution {
    public int maxPower(String s) {
        if(s.length() == 0 || s.isEmpty()) {
            return 0;
        }
        
        int max = 1;
        int cnt = 1;

        for(int i = 1; i < s.length(); i++) {
            if(s.charAt(i) == s.charAt(i-1)) {
                cnt++;
            } else {
                max = Math.max(max, cnt);
                cnt = 1;
            }
        }

        max = Math.max(max, cnt);

        return max;
        
    }
}