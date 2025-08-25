class Solution {
    public boolean isSubsequence(String s, String t) {

        if(s.length() > t.length()) {
            return false;
        }
        int it1 =0;
        int it2=0;
        char[] t1 = t.toCharArray();
        char[] s1 = s.toCharArray();

        while(it1 < s1.length && it2 < t1.length) {
            if(s1[it1] == t1[it2]) {
                it1+=1;
                it2+=1;
            } else {
                it2+=1;
            }
        }

        return it1 == s1.length;
        
    }
}