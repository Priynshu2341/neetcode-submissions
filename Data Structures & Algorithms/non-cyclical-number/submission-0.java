class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> seen = new HashSet<>();

        while(n != 1 && !seen.contains(n)){
            seen.add(n);
            int sum = 0;
        

        while( n > 0){
            int digit = n % 10; //5  // second time = 4 // third time = 1
            sum += digit * digit; //25 // 25 + 16 =  41 // 41 + 1 *1 = 42

            n = n / 10; //14 // 1 // 0

        }
        n = sum;
    }

    return n == 1;
    }
    

    
}
