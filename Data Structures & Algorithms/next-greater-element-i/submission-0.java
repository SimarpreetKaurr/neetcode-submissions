class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n= nums1.length;
        int m= nums2.length;
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=-1;
        }
        int index =0;
        for(int i=0; i<n;i++){
            for(int j=0; j<m;j++){
                if(nums1[i]==nums2[j]){
                    index=j;
                    break;
                }
            }
            for(int k=index+1;k<m;k++){
                if(nums2[k]>nums1[i]){
                    arr[i]=nums2[k];
                    break;
                }
            }
        }
        return arr;
        
        
    }
}