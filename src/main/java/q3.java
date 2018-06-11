import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by ${zrz} on 2017/12/13.
 */
public class q3 {
    public int lengthOfLongestSubstring(String s) {
        String result ="";
        String temp = "";
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            String cStr= c+"";
            int index= temp.indexOf(cStr);
            if(index>0){
                if(temp.length()>result.length()){
                    result = temp;
                }
                temp =temp.substring(index);
                temp+=cStr;
            }
            else{
                temp+=cStr;
            }
        }
        return result.length();

    }
}
