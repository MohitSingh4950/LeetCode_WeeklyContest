class Solution {
    public int minimizedStringLength(String s) {
         int[] freq = new int[128];
        for(char c : s.toCharArray()){
            freq[c]++;
        }
        int ret = 0;
        for(int i = 0;i < 128;i++){
            if(freq[i] >= 1){
                ret += 1;
            }
        }
        return ret;
    }
}