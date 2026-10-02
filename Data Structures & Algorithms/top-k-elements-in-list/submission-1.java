class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> freq=new HashMap<>();
        for(int num:nums){
            freq.put(num,freq.getOrDefault(num,0)+1);
        }
        
        List<Integer> buckets[]=new List[nums.length+1];
        for(int num:freq.keySet()){
            int f=freq.get(num);
            if(buckets[f]==null){
                buckets[f]=new ArrayList<>();
            }
            buckets[f].add(num);
        }
        int arr[]=new int[k];
        int index=0;
        for(int i=buckets.length-1;i>=0;i--){
            if(index>=k){
                break;
            }
            if(buckets[i]!=null){
                for(int j=0;j<buckets[i].size();j++){
                    if(buckets[i].get(j)!=null && index<=k){
                        arr[index++]=buckets[i].get(j);
                    }
                    if(index>=k){
                        break;
                    }
                }
            }
        }
        return arr;
    }
}
