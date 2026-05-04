class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int [] arr = new int [n];
        int zerocount=0;
        int prod=1;
        

        for(int i=0;i<n;i++){
            if(nums[i]==0){
                zerocount++;
            }
            else if(nums[i]!=0){
                prod*=nums[i];
            }
            
        }
        if(zerocount>1){
            for(int i=0;i<n;i++){
                arr[i]=0;
            }
            return arr ;
        }
        for(int i=0;i<n;i++){
            int prod1=1;
            if(nums[i]!=0 && zerocount==1){
                prod1=0;
            }
            else if(nums[i]!=0 && zerocount==0){
                prod1=prod/nums[i];
            }
            else{
                prod1=prod;
            }
            arr[i]=prod1;
        }

        
        return arr;

    }
    
}  

