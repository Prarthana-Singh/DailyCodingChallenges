class Solution {
    public String reverseWords(String s) {

        String[] splitstr = s.split("\\s+");
        StringBuilder res = new StringBuilder();
        for(int i = splitstr.length-1; i >= 0; i--){
            res.append(splitstr[i]).append(" ");
        }
        return res.toString().trim();

    }
}
