class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int res = 0;
        for(int i = 0; i < operations.length; i++){
            String str = operations[i];
            if("--X".equals(str) || "X--".equals(str)) res-=1;
            else res+=1;
        }
        return res;
    }
}
