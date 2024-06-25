class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            int ans=num(num);
            if(ans%2==0){
                count++;
            }
        }
        return count;
    }

    public int num(int num){
        int res=0;
        while(num>0){
            num=num/10;
            res++;
            if(num==0){
                return res;
            }
            continue;
        }
        // String s=num+"";
        // res=s.length();
        return res;
    }
}
