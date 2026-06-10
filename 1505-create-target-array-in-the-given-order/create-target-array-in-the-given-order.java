class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
    int n=nums.length;

    int [] arr=new int[n];
    for(int i=0;i<n;i++){
        int idx=index[i];
        int val=nums[i];

        for(int j=i;j>idx;j--){
            arr[j]=arr[j-1];
        }
        arr[idx]=val;
    } 
    return arr;   
    }
}