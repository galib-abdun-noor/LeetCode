public class MaxArea {
    public int maxArea(int[] height) {
        int max = 0;
        int l = 0;
        int r = height.length - 1;

        while(l<r){
            int area = (r-l) * Math.min(height[l],height[r]);
            max = Math.max(max,area);

            if(height[l] < height[r]){
                l += 1;
            }else{
                r -= 1;
            }
        }
        return max;
    }
}
