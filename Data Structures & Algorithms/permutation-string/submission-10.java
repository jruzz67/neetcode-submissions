class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length())
        return false;
        int freq1[]=new int[26];
        for(int i=0;i<s1.length();i++){
            freq1[s1.charAt(i)-'a']++;
        }
        int freq2[]=new int[26];
        for(int i=0;i<s1.length();i++){
            freq2[s2.charAt(i)-'a']++;
        }
        int l=0;
        int r=s1.length();
        while(r<s2.length()){
            if(Arrays.equals(freq1,freq2))
            return true;
            freq2[s2.charAt(l++)-'a']--;
            freq2[s2.charAt(r++)-'a']++;
        }
        if(Arrays.equals(freq1,freq2))
        return true;
        return false;
    }
}
