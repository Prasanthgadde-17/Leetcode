class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum=0;
        double maxsum=Integer.MIN_VALUE;
        int j=0;
        int i=0;
        while(j<nums.length){
         sum += nums[j];
         if(j-i+1<k){
            j++;
         }
         else if(j-i+1==k){
            maxsum=Math.max(sum,maxsum);
            sum -=nums[i];
            i++;
            j++;

         }
        }
        return maxsum/k;
    }
}
