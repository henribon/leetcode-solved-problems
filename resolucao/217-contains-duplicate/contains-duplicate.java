class Solution {
    public boolean containsDuplicate(int[] nums) {

        HashSet<Integer> checker = new HashSet<>();

        for(int num : nums) {
            if(checker.contains(num)) {
                return true;
            }
            checker.add(num);
        }

        return false;
    }
}