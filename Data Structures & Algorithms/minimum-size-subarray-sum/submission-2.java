class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l=0;
        int r=-1;
        int min_length=Integer.MAX_VALUE;
        int sum=0;
        while(r<=nums.length-1){
            if(sum<target && (r+1)!=nums.length){
                sum+=nums[++r];
            }
            else if(sum>=target){
                min_length=Math.min(min_length,(r-l+1));
                sum-=nums[l++];
            }
            else{
                break;
            }
        }
        if(min_length==Integer.MAX_VALUE)
        return 0;
        return min_length;
    }
}