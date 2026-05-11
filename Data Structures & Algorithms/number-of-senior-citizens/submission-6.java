class Solution {
    public int countSeniors(String[] details) {
        int res=0;
        for(String str: details){
            if(str.charAt(11)>='6')
            {
                if(str.charAt(11)=='6'&&str.charAt(12)=='0')
                res--;
                res++;
            }
        }
        return res;
    }
}