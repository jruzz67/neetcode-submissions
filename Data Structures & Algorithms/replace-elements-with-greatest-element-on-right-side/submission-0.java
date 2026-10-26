class Solution {
    public int[] replaceElements(int[] arr) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(max<=arr[i]){
                max=Integer.MIN_VALUE;
                for(int j=i+1;j<arr.length;j++){
                    if(max<arr[j]){
                        max=arr[j];
                    }
                }
            }
            arr[i]=max;
        }
        arr[arr.length-1]=-1;
        return arr;
    }
}