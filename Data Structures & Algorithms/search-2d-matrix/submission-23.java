class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
       int rows = matrix.length;
       int cols = matrix[0].length;
       int top = 0;
       int bottom = rows - 1;

       while(top <= bottom){
         int mid = top + (bottom - top) / 2;
         if(matrix[mid][cols - 1] < target){
            top = mid + 1;
         } 
         else if(matrix[mid][0] > target){
            bottom = mid - 1;
         } else {
            int left = 0;
            int right = cols - 1;

            while(left <= right){
                int m = left + (right - left ) / 2;
                if(matrix[mid][m] == target)
                 return true;
                if(matrix[mid][m] < target){
                    left = m + 1;

                } else {
                    right =  m - 1;
                }

                

            }

            return false;
         }

       } 

       return false;

    }
}
