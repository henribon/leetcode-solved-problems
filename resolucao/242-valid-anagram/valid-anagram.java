import java.util.HashMap;
import java.util.Arrays;
class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Integer, Character> hash = new HashMap<>();
        
        if(s.length() != t.length()) {
            return false;
        }

        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();

        Arrays.sort(sArray);
        Arrays.sort(tArray);

        return Arrays.equals(tArray, sArray);
        

    }
}