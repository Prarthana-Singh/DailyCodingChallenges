class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder temp = new StringBuilder();

        for(char ch : s.toLowerCase().toCharArray()){

            if(Character.isLetterOrDigit(ch)) temp.append(ch);
        }

        int st = 0, e = temp.length() - 1;

        while(st <= e){
            if(temp.charAt(st) != temp.charAt(e)) return false;
            st++;
            e--;
        }

        return true;

    }
}
