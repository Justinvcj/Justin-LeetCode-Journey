class Solution {
    public List<Integer> spiralOrder(int[][] arr) {
    List<Integer> ll=new ArrayList();
    int rows=arr.length;
    int cols=arr[0].length;

    int top=0;
    int bot=rows-1;
    int left=0;
    int right=cols-1;
    
while (top <= bot && left <= right) {
    
    for(int j=left;j<=right;j++)
    {
        ll.add(arr[top][j]);
    } 
    top++;
    
    for(int i=top;i<=bot;i++)
    {
        ll.add(arr[i][right]);
    }
    right--;
    

    
    if(top<=bot){
        for(int j=right;j>=left;j--){
        ll.add(arr[bot][j]);
    }
    bot--;
    }
    
    if(left<=right){
        for(int i=bot;i>=top;i--){
        ll.add(arr[i][left]);
    }
    left++;
    }
   
}

   
    return ll;
}
}