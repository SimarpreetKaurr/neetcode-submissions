class Solution {
    public int longestConsecutive(int[] nums) {
        int n= nums.length;
        int maxlength =0;
        int count=0;
        
        HashSet<Integer> set = new HashSet<>();
        for(int num: nums){
            set.add(num);
        }
        
        for(int num : set){
            if(!set.contains(num -1)){
                int currentSum = num;
                count=1;

            
                while(set.contains(currentSum+1)){
                  currentSum++;
                  count++;
                }
            }
            
            maxlength= Math.max(maxlength,count);
        }
        return maxlength;
        
    }
}
