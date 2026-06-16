class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
    List<Integer>list=new ArrayList<>();
    for(int i=0;i<nums1.length;i++){
        for(int j=0;j<nums2.length;j++){
            if(nums1[i]==nums2[j]){
                if(!list.contains(nums1[i]))
                list.add(nums1[i]);
            }
        }
    }
    int[] arr = new int[list.size()];
    int index = 0;

    for (Integer num : list) {
    arr[index++] = num;
    }

    return arr;
    }
}