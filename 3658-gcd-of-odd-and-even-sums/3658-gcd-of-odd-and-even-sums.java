class Solution {
    public int gcdOfOddEvenSums(int n) {
        int oddsum = 0;
        int evensum = 0;
        int count = 0;
        while(count <= n){
            int i = 1;
            int j = 2;
            oddsum += i;
            evensum += j;
            i++;
            j += 2;
            count++;
        }
        while(evensum != 0){
            int temp = evensum;
            evensum = oddsum % evensum;
            oddsum = temp;
        }
        return oddsum-1;
    }
}