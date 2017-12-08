import java.util.Arrays;

/**
 * Created by ${zrz} on 2017/12/8.
 */
public class q561 {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length/2;
        int sum = 0;
        for(int i=n;i<nums.length;i++){
            sum+=nums[i];
        }
        return sum;
    }
}
