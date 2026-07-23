class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        int top = 0;
        int bottom = rows - 1;

        while(top <= bottom){
            int mid = top + (bottom - top ) / 2;
            if(target > matrix[mid][columns - 1]){
                top = mid + 1;
            } else if(target < matrix[mid][0]){
                bottom =  mid - 1;
            }
             else {
                int left = 0;
                int right = columns - 1;

                while(left <= right){
                    int m = left + (right - left) / 2;

                    if(matrix[mid][m] == target){
                        return true;
                    }
                    else if(matrix[mid][m] < target){
                        left = m + 1;
                    }else {
                        right = m - 1;
                    }
                }

                return false;
            }
        }

        return false;
    }
}
