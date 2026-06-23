class Solution {
    public int majorityElement(int[] nums) {
    int a=0;
    for(int i=0;i<nums.length;i++)
    {
        a=nums[i];
        int count=0;
        for(int j=i+1;j<nums.length;j++){
            if(a==nums[j]){
                count++;
            }
        }
        if(count>=nums.length/2){
            return a;
        }
    }
    return -1;
    }
   
       
    
}