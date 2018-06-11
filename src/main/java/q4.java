/**
 * Created by ${zrz} on 2017/12/13.
 */
public class q4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int finalI = 0;
        int finalJ = 0;
        for(int i=1;i<m;i++){
            int j = ((m+n+1)/2)-i;
            if(nums1[i-1]<=nums2[j] && nums2[j-1]<=nums1[i]){
                finalI = i;
                finalJ = j;
                break;
            }
        }
        int temp1 = nums1[finalI-1];
        int temp2 = nums2[finalJ-1];
        if((m+n)/2!=0){
            return Math.max(temp1,temp2);
        }
        else{
            int temp3 = nums1[finalI];
            int temp4 = nums2[finalJ];
            return ( Math.max(temp1,temp2)+Math.min(temp3,temp4))/2;
        }
    }

}
