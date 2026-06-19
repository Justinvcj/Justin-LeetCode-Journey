class Solution {
    public String longestCommonPrefix(String[] strs) 
    {
            if(strs==null||strs.length==0){
                return "";
            }
            int index=0;
            while(true){
                 char c=0;
            
            for(int i=0;i<strs.length;i++)
            {
           

                if(index >= strs[i].length())
                {
                    return strs[0].substring(0,index);
                }
                if(i==0)
                {
                    c=strs[i].charAt(index);
                }
                else if(strs[i].charAt(index) != c)
                {
                    return strs[i].substring(0,index);
                }
              

            }
            index++;  

                      }          }
}