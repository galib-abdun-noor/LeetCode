import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        TwoSum ts = new TwoSum();
        int nums[] = {3,0,1};
        System.out.println(Arrays.toString(ts.twoSum(nums, 9)));
        IsPalindrome pal = new IsPalindrome();
        System.out.println(pal.isPalindrome("A man, a plan, a canal: Panama"));
        ContainsDuplicate cd = new ContainsDuplicate();
        System.out.println(cd.containsDuplicate(nums));
        IsAnagram ia = new IsAnagram();
        System.out.println(ia.isAnagram("anagram", "nagaram"));
        UniquePaths up = new UniquePaths();
        System.out.println(up.uniquePaths(3,7));
        MissingNumber mn = new MissingNumber();
        System.out.println(mn.missingNumber(nums));
        HammingWeight hw = new HammingWeight();
        System.out.println(hw.hammingWeight(11));
        ListNode n5 = new ListNode(1);
        ListNode n6 = new ListNode(2);
        ListNode n7 = new ListNode(3);
        ListNode n8 = new ListNode(4);
        ListNode n9 = new ListNode(5);
        n5.next = n6;
        n6.next = n7;
        n7.next = n8;
        n8.next = n9;
        ReverseList rl = new ReverseList();
        System.out.println(rl.reverseList(n5));
    }
}
