public class MissingNumber {
    public int missingNumber(int[] nums) {
        int rslt = nums.length;
        for(int i=0;i<nums.length;i++){
            rslt += i-nums[i];
        }
        return rslt;
    }
}
