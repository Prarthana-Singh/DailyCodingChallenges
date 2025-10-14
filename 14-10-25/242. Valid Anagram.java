class Solution {
    public boolean isAnagram(String s, String t) {
        int[] s1 = new int[26];
        int[] t1 = new int[26];

        for(char ch: s.toCharArray()){
            s1[ch - 'a']++;
        }

        for(char ch: t.toCharArray()){
            t1[ch - 'a']++;
        }

        for(int i = 0; i < 26; i++){
            if(s1[i] != t1[i]) return false;
        }
        return true;
        
    }
}
