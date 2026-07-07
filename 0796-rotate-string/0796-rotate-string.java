class Solution {
    
    public boolean rotateString(String s, String goal) {

    char [] arr=s.toCharArray();
    Arrays.sort(arr);
    char [] srr=goal.toCharArray();
    Arrays.sort(srr);

    String str=new String(arr);
    String sty=new String(srr);

    return str.equals(sty);
    
   
    }
}