class Solution 
{

    public int hIndex(int[] arr) 
    {
        int n=arr.length;
        Arrays.sort(arr);
      
        int paper=0;
        
        for(int i=0;i<n;i++)
        {
            paper=n-i;
            if(arr[i]>=paper){
                return paper;
            }
        }
        
     return 0;      
    }
    
}