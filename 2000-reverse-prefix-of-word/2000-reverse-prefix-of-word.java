class Solution {
    public String reversePrefix(String word, char ch) {
        int index = word.indexOf(ch);
        if(index != -1){
        StringBuilder ans = new StringBuilder(word.substring(0,index+1));
        return  ans.reverse().toString()+word.substring(index+1);
        }
        return word;
    }
}