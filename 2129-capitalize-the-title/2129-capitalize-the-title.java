class Solution {
    public String capitalizeTitle(String title) {
        String[] arr = title.split(" ");
        for(int i=0;i<arr.length;i++){
            if(arr[i].length() <= 2){
                arr[i] = arr[i].toLowerCase();
            }else{
                arr[i] = arr[i].toLowerCase();
                StringBuilder sb = new StringBuilder(arr[i]);
                sb.setCharAt(0 , Character.toUpperCase(sb.charAt(0)));
                arr[i] = sb.toString();
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < arr.length ; i++){
            if(i > 0) sb.append(" ");
            sb.append(arr[i]);
        }
        return sb.toString();
    }
}