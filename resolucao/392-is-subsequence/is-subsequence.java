class Solution {
    public boolean isSubsequence(String s, String t) {

        char[] sub = s.toCharArray();
        int count = 0;
        char[] sequence = t.toCharArray();
        HashMap<Integer, Character> hash = new HashMap<>();

        for(int i = 0; i < sequence.length; i++) {
            hash.put(i, sequence[i]);
        }
        for(int i = 0; i < sub.length; i++) {
            if(!hash.containsValue(sub[i])) {
                return false;
            }
            
            int foundPosition = -1;
            for(Map.Entry<Integer, Character> entry : hash.entrySet()) {
                if(entry.getValue().equals(sub[i]) && entry.getKey() >= count) {
                    foundPosition = entry.getKey();
                    break;
                }
            }
            
            if(foundPosition == -1) {
                return false;
            }
            
            count = foundPosition + 1;
        }

        return true;
    }
}