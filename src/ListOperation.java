/**
 * @author fsh
 * @version 1.0
 * @time 19/09/2024 10:39
 * @description:
 **/
public class ListOperation {
    public ListNode reverstList(ListNode head){
        ListNode newHead = null;
        while(head!=null){
            ListNode tmp = head.next;
            head.next = newHead;
            newHead = head;
            head = tmp;
        }
        return newHead;
    }

    public static void main(String[] args){
        ListNode n = new ListNode(1);
        n.next = new ListNode(2);
        n.next.next = new ListNode(3);
        ListOperation op = new ListOperation();
        op.reverstList(n).printList();


    }
}
