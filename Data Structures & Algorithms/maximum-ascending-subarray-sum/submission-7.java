class Solution {
    public int maxAscendingSum(int[] nums) {
        int n= nums.length;
        int sum = 0;
        int maxSum = 0;

        Stack<Integer> s = new Stack<>();

        for(int i=0;i<n;i++){
            if(!s.isEmpty() && nums[i] <= s.peek()){
                while(!s.isEmpty()){
                    s.pop();
                }
                sum = 0;
            }
            s.push(nums[i]);
            sum+=nums[i];

            maxSum = Math.max(sum, maxSum);

        }
        return maxSum;
        
        
    }
    
}