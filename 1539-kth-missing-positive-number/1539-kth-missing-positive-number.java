class Solution {
    public int findKthPositive(int[] arr, int k) {
        int count = 0;
        int c2 = 0;
        int j=0,i=1;
        int max = arr[arr.length-1];
        while(i<=max){
            if(arr[j] != i){
               count++;
               c2++;
            }
            if(arr[j] == i){
               j++;
            }
            if(count == k){
                return i;
            }
            i++;
        }
        if(count == 0){
            return max+k;
        }
        if(count>0){
           return max+(k-c2);
        }
        return -1;
    }
}