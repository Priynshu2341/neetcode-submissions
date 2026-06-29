class Solution {
    public boolean hasDuplicate(int[] nums) {
        long dup = Arrays.stream(nums).distinct().count();
        if(nums.length != dup){
            return true;

        }

        return false;
    }
}