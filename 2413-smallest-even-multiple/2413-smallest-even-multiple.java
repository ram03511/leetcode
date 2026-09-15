class Solution {
    public int smallestEvenMultiple(int n) {
        int x = 2;
        boolean flag = true;
        int ans = 0;
        while(flag){
            if(x % 2 == 0 && x % n == 0){
               ans = x;
               break;
            }
            x += 2;
        }
        return ans;
    }
}