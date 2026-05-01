class Solution {
    public int maxAscendingSum(int[] nums) {
        int n= nums.length;
        int sum =nums[0];
        int maxSum=nums[0];
       // Stack<Integer> s = new Stack<>();
        for(int i=1;i<n;i++){
            if(nums[i]>nums[i-1]){
                sum+=nums[i];
               // maxSum=sum;
            }
            else{
                sum=nums[i];
                
            }
            maxSum = Math.max(sum, maxSum);
        }
       // int maximum = Math.max(sum,maxSum);
        return maxSum;
        
    }
}