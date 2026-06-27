class Solution {
    public int findMin(int[] nums) {
        int min = 999;

        for (int num : nums){
            if(min > num){
                min = num;
            } 
        }
        return min;
    }
}
