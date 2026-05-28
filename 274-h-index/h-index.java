class Solution 
{

    public void reverse(int [] arr,int left,int right)
    {
        while(left<right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
    }
    public int hIndex(int[] arr) 
    {
        int n=arr.length;
        Arrays.sort(arr);
       reverse(arr,0,n-1);
        int paper=0;
        int count=0;
        for(int i=0;i<n;i++)
        {
            paper=i+1;
            if(arr[i]>=paper){
                count=paper;
            }
        }
        
     return count;      
    }
    
}