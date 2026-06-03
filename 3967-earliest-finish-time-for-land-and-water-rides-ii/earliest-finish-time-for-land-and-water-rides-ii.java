class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        // Case 1: Land ride first, then Water ride
        int landFirst = getMinFinishTime(landStartTime, landDuration, waterStartTime, waterDuration);
        
        // Case 2: Water ride first, then Land ride
        int waterFirst = getMinFinishTime(waterStartTime, waterDuration, landStartTime, landDuration);
        
        // Return the best path
        return Math.min(landFirst, waterFirst);
    }
    
    private int getMinFinishTime(int[] firstStart, int[] firstDuration, int[] secondStart, int[] secondDuration) {
        // Step 1: Find the absolute earliest finish time for the FIRST ride category
        int minFirstEnd = Integer.MAX_VALUE;
        for (int i = 0; i < firstStart.length; i++) {
            minFirstEnd = Math.min(minFirstEnd, firstStart[i] + firstDuration[i]);
        }
        
        // Step 2: Find the earliest finish time for the SECOND ride category based on that start time
        int minTotalFinish = Integer.MAX_VALUE;
        for (int j = 0; j < secondStart.length; j++) {
            // You can only start the second ride when it opens AND after the first ride finishes
            int actualStart = Math.max(minFirstEnd, secondStart[j]);
            int currentFinish = actualStart + secondDuration[j];
            
            minTotalFinish = Math.min(minTotalFinish, currentFinish);
        }
        
        return minTotalFinish;
    }
}