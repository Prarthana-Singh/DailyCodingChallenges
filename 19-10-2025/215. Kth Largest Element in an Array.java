class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer>max = new PriorityQueue<>(Collections.reverseOrder());
        int res = 0;
        for(int ele: nums){
            max.add(ele);
        }
        while(k-- != 0){
           res =  max.poll();
        }
        return res;
    }
}
