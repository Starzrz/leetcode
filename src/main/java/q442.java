import java.util.ArrayList;
import java.util.List;

/**
 * Created by ${zrz} on 2017/12/8.
 * Given an array of integers, 1 ≤ a[i] ≤ n (n = size of array), some elements appear twice and others appear once.

 Find all the elements that appear twice in this array.

 Could you do it without extra space and in O(n) runtime?
 */
public class q442 {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> re = new ArrayList<Integer>();
        for(int i:nums){
            if(nums[Math.abs(i)-1]<0){
                re.add(Math.abs(i));
            }
            nums[Math.abs(i)-1]*=-1;
        }
        return re;
    }
}
