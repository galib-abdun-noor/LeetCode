import java.util.Stack;

public class IsValid {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='['){
                st.push(s.charAt(i));
            }
            else{
                if(st.isEmpty()){
                    return false;
                }
                switch (s.charAt(i)){
                    case ')':
                        if(st.pop()!='('){
                            return false;
                        }
                        break;
                    case '}':
                        if(st.pop()!='{'){
                            return false;
                        }
                        break;
                    case ']':
                        if(st.pop()!='['){
                            return false;
                        }
                        break;
                }
            }
        }
        if(!st.isEmpty()){
            return false;
        }
        return true;
    }
}
