import java.util.*;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        
        // loop through each row
        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            
            // first and last elements of every row are always 1
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    // element is sum of two numbers from previous row
                    row.add(result.get(i - 1).get(j - 1) + result.get(i - 1).get(j));
                }
            }
            
            result.add(row);
        }
        
        return result;
    }
}
