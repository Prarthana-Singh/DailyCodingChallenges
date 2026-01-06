class Solution {
    public int findFinalValue(int[] nums, int original) {
        
       
        List<Integer> check = new ArrayList<>();
        for(int ele : nums){
           check.add(ele);
        }
        int element = original;
        for(int i = 0; i < check.size(); i++){
            if(check.contains(element)){
            element = 2*element;

            }
           
        }
        return element;
    }
}
