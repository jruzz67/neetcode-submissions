class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character>set=new HashSet<>();
        int res=0;
        // int count=0;
        int left=0;
        char arr[]=s.toCharArray();
        for(int i=0;i<arr.length;i++){
            // if(!set.add(arr[i])){
            while(!set.add(arr[i])){
                set.remove(arr[left]);
                left++;
            }
            // }
            res=Math.max(res,i-left+1);
        }
        return res;
    }
}
