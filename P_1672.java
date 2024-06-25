class Solution {
    public int maximumWealth(int[][] accounts) {
        int[] arr=new int[accounts.length];
        int total=0;
        for(int i=0;i<accounts.length;i++){
            for(int j=0;j<accounts[0].length;j++){
                total=accounts[i][j]+total;
            }
            arr[i]=total;
            //System.out.println(total);
            total=0;
        }
        //System.out.println(Arrays.toString(arr));
        int ans=arr[0];
        for(int i=1;i<arr.length;i++){
            if(ans<arr[i]){
                ans=arr[i];
            }
        }
        return ans;
        
    }
    // static int wealth(int[][] accounts){
    //     int[]
    //     for(int i=0;i<accounts.length;i++){
    //         for(int j=0;j<accounts.length;j++){
    //             total=accounts[i][j]+total;
    //         }
    //         return total;
    //     }
    // }
}
