public class Solution {
    public int[] solve(int[] A) {
        
        int max = A[A.length-1];
        ArrayList<Integer>ans = new ArrayList<>();
        ans.add(A[A.length-1]);
        // Loop
        for(int i = A.length-2; i >= 0; i--){
            if(A[i] > max){
                max = A[i];
                ans.add(A[i]);
            }
        }
        
        int[] res = new int[ans.size()];
        for(int i = 0; i < res.length; i++) res[i] = ans.get(i);
        
        return res;
    }
}
