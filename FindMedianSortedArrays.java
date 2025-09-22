public class FindMedianSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int length = nums1.length+nums2.length;
        int[] arr = new int[length];
        int i=0,j=0,k=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<nums2[j]){
                arr[k]=nums1[i];
                i++;
            }else{
                arr[k]=nums2[j];
                j++;
            }
            k++;
        }
        while(i<nums1.length || j<nums2.length){
            arr[k] = i<nums1.length?(arr[k]=nums1[i++]):(arr[k]=nums2[j++]);
            k++;
        }
        double med = (length%2==0)?((Double.valueOf(arr[length/2-1])+Double.valueOf(arr[length/2]))/2):arr[length/2];
        return med;
    }
}
