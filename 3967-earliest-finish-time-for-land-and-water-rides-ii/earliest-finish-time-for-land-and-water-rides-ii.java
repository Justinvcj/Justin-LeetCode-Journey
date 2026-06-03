class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
    
    int landtime=getMinFinishTime(landStartTime,landDuration,waterStartTime,waterDuration);

    int watertime=getMinFinishTime(waterStartTime,waterDuration,landStartTime,landDuration);

    return Math.min(landtime,watertime);
    }
    private int getMinFinishTime(int[] firstStartTime, int[] firstDuration, int[] secondStartTime, int[] secondDuration)    
    {
    int FirstEnd=Integer.MAX_VALUE;
    for(int i=0;i<firstStartTime.length;i++){
        FirstEnd=Math.min(FirstEnd,firstStartTime[i]+firstDuration[i]);
    } 
    int TotalFinish=Integer.MAX_VALUE;
    for(int j=0;j<secondStartTime.length;j++){
        int water=Math.max(FirstEnd,secondStartTime[j]);
        int finish=water+secondDuration[j];

        TotalFinish=Math.min(TotalFinish,finish);
    } 
    return TotalFinish;
    }
}