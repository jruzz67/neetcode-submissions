class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max=0;
        int res=0;
        for(int num:nums){
            if(num==1)
            res++;
            else{
                max=Math.max(max,res);
                res=0;
            }
        }
        return Math.max(max,res);
    }
}