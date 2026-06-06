public class LeftRightDifference {
    public int[] leftRightDifference(int[] nums) {
        int ans[] = new int[nums.length];

        int leftsum = 0;
        for(int i=0; i<nums.length; i++){
            ans[i] = leftsum;
            leftsum += nums[i];
        }

        int rightsum = 0;
        for(int j=nums.length-1; j>=0; j--){
            ans[j] = Math.abs(ans[j]-rightsum);
            rightsum += nums[j];
        }
        return ans;
    }
}
