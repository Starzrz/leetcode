/**
 * Created by ${zrz} on 2017/12/8.
 * We have two special characters. The first character can be represented by one bit 0. The second character can be represented by two bits (10 or 11).

 *Now given a string represented by several bits. Return whether the last character must be a one-bit character or not. The given string will always end with a zero.
 */
public class q717 {

    /*
    解法：找到倒数第二个0，若最后一位为1bit，则最后一位与倒数第二位之间必有偶数个1
     */
    public boolean isOneBitCharacter(int[] bits) {
        int lastTwoIndex = bits.length-2;
        while(lastTwoIndex>=0 && bits[lastTwoIndex]!=0){
            lastTwoIndex--;
        }
        return (bits.length-lastTwoIndex)%2==0;
    }
}
