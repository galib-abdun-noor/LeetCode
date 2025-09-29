public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        String right = Integer.toString(x);
        char ch;
        String left = right;
        for(int i=0, j=left.length()-1; i<j; i++,j--){
            if(right.charAt(i)==left.charAt(j))
                continue;
            else {
                return false;
            }
        }
        return true;
    }
}
