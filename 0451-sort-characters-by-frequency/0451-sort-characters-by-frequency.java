class Solution {
    public String frequencySort(String s) {

        StringBuilder sb = new StringBuilder();

        int[] freq = new int[128];

        for(char ch : s.toCharArray()){
            freq[ch]++;
        }

        List<Character>[] bucket = new ArrayList[s.length()+1];

        for(int i = 0; i < bucket.length; i++){
            bucket[i] = new ArrayList<>();
        }

        for(int i = 0; i < 128; i++){
            if(freq[i] > 0){
                bucket[freq[i]].add((char)(i));
            }
        }

        for(int i = bucket.length-1; i >= 0; i--){
            for(char ch : bucket[i]){
                for(int j = 0; j < i; j++){
                    sb.append(ch);
                }
            }
        }

        return sb.toString();
    }
}