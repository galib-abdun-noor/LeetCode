public class IsPalindrome {
    public boolean isPalindrome(String s) {
        String low = s.toLowerCase();
        low = low.replaceAll("[^a-z0-9]","");
        for(int l=0,r=low.length()-1; l<r; l++,r--){
            if(low.charAt(l)==low.charAt(r)){
                continue;
            }else{
                return false;
            }
        }
        return true;
    }
}
