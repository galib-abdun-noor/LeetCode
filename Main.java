import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        TwoSum ts = new TwoSum();
        int nums[] = {1,2,3,1};
        System.out.println(Arrays.toString(ts.twoSum(nums, 9)));
        IsPalindrome pal = new IsPalindrome();
        System.out.println(pal.isPalindrome("A man, a plan, a canal: Panama"));
        ContainsDuplicate cd = new ContainsDuplicate();
        System.out.println(cd.containsDuplicate(nums));
        IsAnagram ia = new IsAnagram();
        System.out.println(ia.isAnagram("anagram", "nagaram"));
        UniquePaths up = new UniquePaths();
        System.out.println(up.uniquePaths(3,7));
    }
}
