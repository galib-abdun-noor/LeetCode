public class SearchInsert {
    public int searchInsert(int[] nums, int target) {
        int ind=0;
        while(ind<nums.length){
            if(nums[ind]>=target){
                break;
            }
            ind++;
        }
        return ind;
    }
}
