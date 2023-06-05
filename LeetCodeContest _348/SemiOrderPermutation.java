class Solution {
    public int semiOrderedPermutation(int[] nums) {
          int one = 0, nn = 0;
        for(int i = 0;i < nums.length;i++){
            if(nums[i] == 1){
                one = i;
            }
            if(nums[i] == nums.length){
                nn = i;
            }
        }
        if(one < nn){
            return one + nums.length - 1 - nn;
        }else{
            return one + nums.length - 1 - nn - 1;
        }
    }
}