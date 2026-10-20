class Solution {
    public String convertDateToBinary(String date) {
        StringBuilder s = new StringBuilder();
        String[] arr = date.split("-");
        for(int i=0;i<arr.length;i++){
            int n = Integer.parseInt(arr[i]);
            s.append(Integer.toBinaryString(n));
            if(i != 2)s.append('-');
        }
        return s.toString();
    }
}