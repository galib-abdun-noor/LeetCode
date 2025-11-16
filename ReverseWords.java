public class ReverseWords {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        String sent = "";
        for (int i=0;i<words.length;i++) {
            if(!words[i].equalsIgnoreCase("") && !words[i].equals(null)) {
                if(sent.equalsIgnoreCase("")){
                    sent = words[i];
                }else {
                    sent = words[i] + " " + sent;
                }
            }
        }
        return sent;
    }
}
