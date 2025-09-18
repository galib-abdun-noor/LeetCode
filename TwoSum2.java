public class TwoSum2 {
    public int[] twoSum(int[] numbers, int target) {
        int l = 0;
        int r = numbers.length - 1;
        int[] arr = new int[2];

        while(l<r){
            int curSum= numbers[l]+numbers[r];

            if(curSum > target){
                r -= 1;
            } else if (curSum < target) {
                l += 1;
            }else{
                arr[0] = l+1;
                arr[1] = r+1;
                return arr;
            }
        }
        return null;
    }
}
