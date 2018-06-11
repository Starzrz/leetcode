/**
 * Created by ${zrz} on 2017/12/7.
 */
public class main {
    public static void main(String[] args) {
        int num=21;
        int num1 = num;
        int num2 = (num1+(num/num1))/2;
        while(num1!=num2){
            num1 = num2;
            num2 = (num1+(num/num1))/2;
        }
        System.out.println(num2);

    }
    class Solution {
        public int[] twoSum(int[] nums, int target) {
            int one=0;
            int two=0;
            int []re = new int[2];
            for(int i=0;i<nums.length;i++){
                int t=target-nums[i];
                for(int j=i+1;j<nums.length;j++){
                    if(j==t){
                        one= i;
                        two=j;
                        re[0]= one;
                        re[1]= two;
                        return re;
                    }
                }
            }
            return re;
        }

    }
}
