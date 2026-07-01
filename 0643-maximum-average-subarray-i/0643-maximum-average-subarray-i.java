class Solution {
    public double findMaxAverage(int[] nums, int k) {
    int maxsum=0;
    int n=nums.length;
    int sum=0;
    for(int i=0;i<k;i++){
        sum+=nums[i];
    } 
    maxsum=sum;
    for(int i=1;i<n-k+1;i++){
        sum=sum-nums[i-1]+nums[i+k-1];
        maxsum=Math.max(maxsum,sum);
    }   
    return (double)maxsum/k;
    }
}