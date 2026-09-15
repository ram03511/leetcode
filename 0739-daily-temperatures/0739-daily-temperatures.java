class Solution {
    public int[] dailyTemperatures(int[] temp) {
        int n = temp.length;
        int[] ans = new int[n];
        ArrayDeque<Integer> st = new ArrayDeque<>();
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && temp[i] > temp[st.peek()]){
                int popped = st.pop();
                ans[popped] = i - popped;
            }
            st.push(i);
        }
        return ans;
    }
}