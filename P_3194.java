class Solution {
    public double minimumAverage(int[] nums) {
        double[] arr=new double[nums.length/2];
        Arrays.sort(nums);
       // System.out.print(Arrays.toString(nums));
        //return arr.length;
        int st=0;
        int end=nums.length-1;
        double avg=0;
        while(st<=end){
            avg =nums[st]+nums[end];
            arr[st]=avg/2;
            st++;
            end--;
            avg=0;
        }
        Arrays.sort(arr);
        double res=arr[0];
        return res;

    }
}
