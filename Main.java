import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        TwoSum ts = new TwoSum();
        int nums[] = {2,7,11,15};
        System.out.println(Arrays.toString(ts.twoSum(nums, 9)));
        IsPalindrome pal = new IsPalindrome();
        System.out.println(pal.isPalindrome("A man, a plan, a canal: Panama"));
    }
}
