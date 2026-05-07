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
                int currentNum = num;
                count=1;

            
                while(set.contains(currentNum+1)){
                  currentNum++;
                  count++;
                }
            }
            
            maxlength= Math.max(maxlength,count);
        }
        return maxlength;
        
    }
}
