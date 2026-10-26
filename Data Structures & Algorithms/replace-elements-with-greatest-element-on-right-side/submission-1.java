class Solution {
    public int[] replaceElements(int[] arr) {
        int r_max=-1;
        for(int i=arr.length-1;i>=0;i--){
            int temp=arr[i];
            arr[i]=r_max;
            r_max=Math.max(temp,r_max);
        }
        return arr;
    }
}