class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
    int n=landStartTime.length;
    int m=waterStartTime.length;
    int min=Integer.MAX_VALUE;
    for(int i=0;i<n;i++){
        
        int sum=landStartTime[i]+landDuration[i];


        for(int j=0;j<m;j++){
            int water=Math.max(sum,waterStartTime[j]);
            int finish=water+waterDuration[j];
            min=Math.min(min,finish);
        }
    }
    
    for(int i=0;i<m;i++){
        
        int sum=waterStartTime[i]+waterDuration[i];


        for(int j=0;j<n;j++){
            int land=Math.max(sum,landStartTime[j]);
            int finish=land+landDuration[j];
            min=Math.min(min,finish);
        }
    }
    return min;
    }
}