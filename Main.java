import java.util.List;

public class Main {
    public static void main(String[] args) {
//        int nums[] = {1,3,5,6};
//        TwoSum ts = new TwoSum();
//        System.out.println(Arrays.toString(ts.twoSum(nums, 9)));
//        IsPalindrome pal = new IsPalindrome();
//        System.out.println(pal.isPalindrome("A man, a plan, a canal: Panama"));
//        ContainsDuplicate cd = new ContainsDuplicate();
//        System.out.println(cd.containsDuplicate(nums));
//        IsAnagram ia = new IsAnagram();
//        System.out.println(ia.isAnagram("anagram", "nagaram"));
//        UniquePaths up = new UniquePaths();
//        System.out.println(up.uniquePaths(3,7));
//        MissingNumber mn = new MissingNumber();
//        System.out.println(mn.missingNumber(nums));
//        HammingWeight hw = new HammingWeight();
//        System.out.println(hw.hammingWeight(11));
//        ListNode n5 = new ListNode(1);
//        ListNode n6 = new ListNode(2);
//        ListNode n7 = new ListNode(3);
//        ListNode n8 = new ListNode(4);
//        ListNode n9 = new ListNode(5);
//        n5.next = n6;
//        n6.next = n7;
//        n7.next = n8;
//        n8.next = n9;
//        ReverseList rl = new ReverseList();
//        System.out.println(rl.reverseList(n5));
//        SearchInsert si = new SearchInsert();
//        System.out.println(si.searchInsert(nums,5));
//        String[] strs = {"flower","flow","flight"};
//        LongestCommonPrefix lcp = new LongestCommonPrefix();
//        System.out.println(lcp.longestCommonPrefix(strs));
//        System.out.println("(21) Merge Two Sorted Lists");
//        ListNode n10 = new ListNode(3);
//        ListNode n11 = new ListNode(4);
//        ListNode n12 = new ListNode(5);
//        ListNode n13 = new ListNode(6);
//        n10.next = n11;
//        n11.next = n12;
//        n12.next = n13;
//        ListNode m5 = new ListNode(1);
//        ListNode m6 = new ListNode(2);
//        ListNode m7 = new ListNode(3);
//        ListNode m8 = new ListNode(4);
//        ListNode m9 = new ListNode(5);
//        m5.next = m6;
//        m6.next = m7;
//        m7.next = m8;
//        m8.next = m9;
//        MergeTwoLists mtl = new MergeTwoLists();
//        ListNode head = mtl.mergeTwoLists(n10,m5);
//        System.out.println("output: ");
//        while(head!=null){
//            System.out.print(head.val+" ");
//            head = head.next;
//        }
//        int nums[] = {4,5,6,7,0,1,2};
//        Search s = new Search();
//        System.out.println(s.search(nums,3));
//        int numbers[] = {2,7,11,15};
//        TwoSum2 ts2 = new TwoSum2();
//        System.out.println(ts2.twoSum(numbers,9));
//        int[] height = {1,8,6,2,5,4,8,3,7};
//        MaxArea ma = new MaxArea();
//        System.out.println(ma.maxArea(height));
//        ClimbStairs cs = new ClimbStairs();
//        System.out.println(cs.climbStairs(3));
//        LengthOfLongestSubstring lls = new LengthOfLongestSubstring();
//        System.out.println("output: "+lls.lengthOfLongestSubstring("ckilbkd"));
//        int[] nums7 = {1,2};
//        int[] nums8 = {3,4};
//        FindMedianSortedArrays fmtsa = new FindMedianSortedArrays();
//        System.out.println("output: "+fmtsa.findMedianSortedArrays(nums7,nums8));
//        String s ="()[]{}";
//        IsValid iv = new IsValid();
//        System.out.println(iv.isValid(s));
//        PascalTriangle pt = new PascalTriangle();
//        System.out.println(pt.generate(5));
//        PalindromeNumber pn = new PalindromeNumber();
//        System.out.println(pn.isPalindrome(121));
//        Merge m = new Merge();
//        int[][] intervals = {
//                {1, 3},
//                {2, 6},
//                {8, 10},
//                {15, 18}
//        };
//        System.out.println(m.merge(intervals));
//        String s = "the sky is blue";
//        ReverseWords rw = new ReverseWords();
//        System.out.println(rw.reverseWords(s));
//        MaxProfit mp = new MaxProfit();
//        int[] prices = {7,1,5,3,6,4};
//        System.out.println(mp.maxProfit(prices));
//        CourseSchedule cs = new CourseSchedule();
//        int[][] prerequisites = {{1,0},{0,1}};
//        System.out.println(cs.canFinish(2,prerequisites));
//        ListNode m10 = new ListNode(1);
//        ListNode m11 = new ListNode(2);
//        ListNode m12 = new ListNode(3);
//        ListNode m13 = new ListNode(4);
//        ListNode m14 = new ListNode(5);
//        m10.next = m11;
//        m11.next = m12;
//        m12.next = m13;
//        m13.next = m14;
//        RemoveNthFromEnd rnfe = new RemoveNthFromEnd();
//        ListNode head = rnfe.removeNthFromEnd(m10,2);
//        while(head != null){
//            System.out.println(head.val);
//            head = head.next;
//        }
//        HammingDistance hd = new HammingDistance();
//        System.out.println("461. Hamming Distance: " + hd.hammingDistance(1,4));
//        LeftRightDifference lrd = new LeftRightDifference();
//        int arr[] = {10,4,8,3};
//        System.out.println("2574. Left and Right Sum Differences: " + lrd.leftRightDifference(arr));
//        GenerateParenthesis gp = new GenerateParenthesis();
//        System.out.println(gp.generateParenthesis(3));
//        MinPathSum mps = new MinPathSum();
//        int[][] grid1 = {
//                {1, 3, 1},
//                {1, 5, 1},
//                {4, 2, 1}
//        };
//        System.out.println("64. Minimum Path Sum " + mps.minPathSum(grid1));

//        SwapPairs sp = new SwapPairs();
//        // Example 1: [1,2,3,4] -> [2,1,4,3]
//        ListNode head1 = buildList(new int[]{1, 2, 3, 4});
//        printList(sp.swapPairs(head1));
//
//        // Example 2: [] -> []
//        ListNode head2 = buildList(new int[]{});
//        printList(sp.swapPairs(head2));
//
//        // Example 3: [1] -> [1]
//        ListNode head3 = buildList(new int[]{1});
//        printList(sp.swapPairs(head3));
//
//        // Example 4: [1,2,3] -> [2,1,3]
//        ListNode head4 = buildList(new int[]{1, 2, 3});
//        printList(sp.swapPairs(head4));
//    }
//
//    private static ListNode buildList(int[] values) {
//        ListNode dummy = new ListNode(0);
//        ListNode current = dummy;
//        for (int val : values) {
//            current.next = new ListNode(val);
//            current = current.next;
//        }
//        return dummy.next;
//    }
//
//    // Helper: prints a linked list in LeetCode-style array format
//    private static void printList(ListNode head) {
//        StringBuilder sb = new StringBuilder("[");
//        while (head != null) {
//            sb.append(head.val);
//            if (head.next != null) sb.append(",");
//            head = head.next;
//        }
//        sb.append("]");
//        System.out.println(sb.toString());

        CombinationSum cs = new CombinationSum();
        // Test Case 1: Example 1 from the problem
        // candidates = [2,3,6,7], target = 7
        // Expected: [[2,2,3],[7]]
        runTest(cs, new int[]{2, 3, 6, 7}, 7, "Test 1 (example 1)");

        // Test Case 2: Example 2 from the problem
        // candidates = [2,3,5], target = 8
        // Expected: [[2,2,2,2],[2,3,3],[3,5]]
        runTest(cs, new int[]{2, 3, 5}, 8, "Test 2 (example 2)");
    }

    private static void runTest(CombinationSum cs, int[] candidates, int target, String label) {
        List<List<Integer>> result = cs.combinationSum(candidates, target);
        System.out.println(label);
        System.out.println("  candidates = " + arrToString(candidates) + ", target = " + target);
        System.out.println("  result = " + result);
        System.out.println("  count  = " + result.size());
        System.out.println();
    }

    private static String arrToString(int[] arr) {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            if (i < arr.length - 1) sb.append(",");
        }
        sb.append("]");
        return sb.toString();
    }
}
