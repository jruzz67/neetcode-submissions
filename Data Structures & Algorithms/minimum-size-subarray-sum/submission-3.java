class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l = 0;
        int min_length = Integer.MAX_VALUE;
        int sum = 0;
        
        // Let the loop naturally expand the right boundary
        for (int r = 0; r < nums.length; r++) {
            sum += nums[r];
            
            // Shrink the window as much as possible while conditions are met
            while (sum >= target) {
                min_length = Math.min(min_length, r - l + 1);
                sum -= nums[l++];
            }
        }
        
        return min_length == Integer.MAX_VALUE ? 0 : min_length;
    }
}



// class Solution {
//     public int minSubArrayLen(int target, int[] nums) {
//         int l=0;
//         int r=-1;
//         int min_length=Integer.MAX_VALUE;
//         int sum=0;
//         while(r<=nums.length-1){
//             if(sum<target && (r+1)!=nums.length){
//                 sum+=nums[++r];
//             }
//             else if(sum>=target){
//                 min_length=Math.min(min_length,(r-l+1));
//                 sum-=nums[l++];
//             }
//             else{
//                 break;
//             }
//         }
//         if(min_length==Integer.MAX_VALUE)
//         return 0;
//         return min_length;
//     }
// }