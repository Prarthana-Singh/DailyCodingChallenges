class Solution {
    public int kthSmallest(int[] arr, int k) {
        // Code here
        PriorityQueue<Integer> min = new PriorityQueue<>();
        
        for(int ele: arr) min.add(ele);
        
        int res = 0;
        
        while(k -- != 0){
            res = min.poll();
        }
        
        return res;
        
    }
}
