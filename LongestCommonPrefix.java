import java.util.Arrays;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String s1 = strs[0];
        String s2 = strs[strs.length-1];
        int i=0;
        String com = "";
        while(i<s1.length() && i<s2.length()){
            if(s1.charAt(i)==s2.charAt(i)){
                com = com+s2.charAt(i);
            }
            else{
                break;
            }
            i++;
        }
        return com;
    }
}
