/**
 * @author fsh
 * @version 1.0
 * @time 19/09/2024 10:39
 * @description:list operation
 **/
public class ListOperation {
    public static void main(String[] args){
        ListNode n = new ListNode(1);
        n.next = new ListNode(2);
        n.next.next = new ListNode(3);
        n.next.next.next = new ListNode(4);
        n.next.next.next.next = new ListNode(5);

        ListOperation op = new ListOperation();
        op.reverseKGroup(n,3).printList();


    }
    /**
     * 反转链表
     * @param head ListNode
     * @return 反转链表后新的头节点
     */
    public ListNode reverseList(ListNode head){
        ListNode newHead = null;
        while(head!=null){
            ListNode tmp = head.next;
            head.next = newHead;
            newHead = head;
            head = tmp;
        }
        return newHead;
    }


    /**
     * 给定一个链表，每隔k个元素做一次反转 java （字节）（leetcode-25）
     * @param head ListNode
     * @param k int
     * @return 反转后新头节点
     */
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || k <= 1) return head;

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode pre = dummy;
        ListNode end = dummy;

        while(end.next!=null){
            for(int i=0;i<k && end != null; i++){
                end = end.next;
            }
            if(end == null) break;
            ListNode start = pre.next;
            ListNode next = end.next;
            end.next = null;
            pre.next = reverseList(start);
            start.next = next;
            pre = start;
            end = pre;
        }
        return dummy.next;
    }

}
