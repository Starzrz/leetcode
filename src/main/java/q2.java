import java.util.Map;

/**
 * Created by ${zrz} on 2017/12/9.
 */



public class q2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode result = new ListNode(0);
        ListNode first = result;
        int in = 0;
        while(l1!=null && l2!=null){

            result.val = (l1.val+l2.val+in)%10;
            in = (l1.val+l2.val)/10;
            ListNode temp = new ListNode(0);
            result.next =temp;
            result = result.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        if(l1==null){
            result = l2;
        }else {
            result = l1;
        }
        return first;

    }
}
