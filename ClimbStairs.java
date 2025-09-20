public class ClimbStairs {
    public int climbStairs(int n) {
        if(n<=2)
            return n;
        int first = 1;
        int sec = 2;
        int res = 0;
        for(int i=2;i<n;i++){
            res = first+sec;
            first = sec;
            sec= res;
        }
        return res;
    }
}
