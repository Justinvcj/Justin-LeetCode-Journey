class Solution {
    public int secondHighest(String s) {
    List<Integer>list=new ArrayList<>();
    
   
    for(int i=0;i<s.length();i++){
        if(Character.isDigit(s.charAt(i))){
            if(!list.contains(s.charAt(i)-'0')){
                list.add(s.charAt(i)-'0');
            }
            
        }
    }
    int [] arr=new int[list.size()];
    for(int i=0;i<arr.length;i++){
        arr[i]=list.get(i);
    }
    Arrays.sort(arr);
    if(arr.length<2){
        return -1;
    }
    return arr[arr.length-2];
    

    }
}