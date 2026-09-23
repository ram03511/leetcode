class Solution {
    public int[] decrypt(int[] c, int k) {
        int n = c.length;
        int[] copy = new int[n*3]; 
        int[] ans = new int[n];
        if (k == 0) {
            return ans;
        }
        for(int i = 0; i < n; i++) {
            copy[i] = c[i];
            copy[n+i] = c[i];
            copy[(n*2)+i] = c[i];
        }
        int x = 0;
        if (k > 0) {
            for (int i = 0; i < n; i++) {
                int sum = 0;
                int count = 0;
                for (int j = i + 1; j < copy.length; j++){
                    if(count < k){
                        sum += copy[j];
                        count++;
                    }else{
                        break;
                    }
                }
                ans[i] = sum;
            }
        }else{
            for (int i = n; i < n*2; i++) {
                int sum = 0;
                int count = 0;
                for (int j = i - 1; j < copy.length; j--){
                    if(count < Math.abs(k)){
                        sum += copy[j];
                        count++;
                    }else{
                        break;
                    }
                }
                ans[x] = sum;
                x++;
            }
        }
        return ans;
    }
}