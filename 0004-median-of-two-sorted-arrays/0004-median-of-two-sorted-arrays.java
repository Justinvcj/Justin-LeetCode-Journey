class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    List<Integer>list=new ArrayList<>();

    for(int i=0;i<nums1.length;i++){
        list.add(nums1[i]);
    }  
    for(int i=0;i<nums2.length;i++){
        list.add(nums2[i]);
    } 
    int[] arr = list.stream().mapToInt(Integer::intValue).toArray();
    Arrays.sort(arr);
    int n=arr.length;
    double result=0;
    if(arr.length % 2 !=0){
        result=arr[n/2];
    }else{
        result=(arr[n/2]+arr[n/2-1])/2.0;
    }
    return result;
    }
}