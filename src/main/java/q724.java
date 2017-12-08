/**
 * Created by ${zrz} on 2017/12/8.
 * Given an array of integers nums, write a method that returns the "pivot" index of this array.

 We define the pivot index as the index where the sum of the numbers to the left of the index is equal to the sum of the numbers to the right of the index.

 If no such index exists, we should return -1. If there are multiple pivot indexes, you should return the left-most pivot index.
 */
public class q724 {
    public static void main(String[] args) {
        q724 q724 = new q724();
        System.out.println(q724.pivotIndex(new int[]{-1,-1,-1,-1,-1,0}));
    }

    /**
     * 先算出总和，再从做累加求和
     * @param nums
     * @return
     */
    public int pivotIndex(int[] nums) {
        int sum = 0;
        int frontSum = 0;
        for(int i:nums){
            sum+=i;
        }
        for(int i=0;i<nums.length;i++){
            if(sum-2*frontSum-nums[i]==0){
                return i;
            }
        }
        return -1;
    }
}
