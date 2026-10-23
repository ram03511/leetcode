class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        int left = 0;
        int right = height.length-1;
        while(left < right){
           int newmax = 0;
           if(height[left] > height[right]){
             newmax = height[right]*(right - left);
             right--;
           }else{
             newmax = height[left]*(right - left);
             left++;
           }
           if(max < newmax)max = newmax;
        }
        return max;
    }
}