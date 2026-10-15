class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        char low = '~';
        for(int i=0;i<letters.length;i++){
            if(letters[i] > target){
                if(low > letters[i]) low = letters[i];
            }
        }
        if(low == '~')return letters[0];
        return low;
    }
}