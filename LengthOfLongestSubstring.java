import java.util.HashSet;

public class LengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        int count = 0;
        int max = 0;
        char[] str = s.toCharArray();
        HashSet<Character> set = new HashSet<>();
        for(int i=0;i<str.length;i++){
            if(!set.contains(str[i])){
                set.add(str[i]);
                max = Math.max(max,i-count+1);
            }else{
                while(str[i]!=str[count]){
                    set.remove(str[count]);
                    count++;
                }
                set.remove(str[count]);
                count++;
                set.add(str[i]);
            }
        }
        return max;
    }
}
