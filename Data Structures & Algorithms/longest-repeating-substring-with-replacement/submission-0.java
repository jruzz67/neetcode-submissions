class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq = new int[26];
        int l = 0;
        int maxFreq = 0;
        int res = 0;
        for (int r = 0; r < s.length(); r++) {
            maxFreq = Math.max(maxFreq,
             ++freq[s.charAt(r) - 'A']);
             
            while ((r - l + 1) - maxFreq > k) {
                freq[s.charAt(l) - 'A']--;
                l++;
            }
            res = Math.max(res, r - l + 1);
        }
        return res;
    }
}

// class Solution {
//     public int characterReplacement(String s, int k) {
//         int l=0;
//         int res=0;
//         int maxFreq=0;
//         int n=s.length();
//         HashMap<Character,Integer> map=new HashMap<>();
//         for(int r=0;r<n;r++){
//             map.put(s.charAt(r),map.getOrDefault(s.charAt(r),0)+1);
//             maxFreq=Math.max(maxFreq,map.get(s.charAt(r)));
//             while(r-l-maxFreq+1>k){
//                 map.put(s.charAt(l),map.get(s.charAt(l))-1);
//                 l++;
//             }
//             res=Math.max(res,r-l+1);
//         }
//         return res;
//     }
// }