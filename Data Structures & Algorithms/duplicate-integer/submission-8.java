class Solution {
    public boolean hasDuplicate(int[] nums) {
        var count = Arrays.stream(nums).distinct().count();
        if(count != nums.length){
            return true;
        } else{
            return false;
        }
    }
}