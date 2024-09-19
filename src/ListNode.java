/**
 * @author fsh
 * @version 1.0
 * @time 19/09/2024 10:39
 * @description:
 **/
public class ListNode {
    int value;
    ListNode next;

    public ListNode(int value){
        this.value = value;
    }

    public ListNode( ListNode next){
        this.next = next;
    }
    public ListNode(int value, ListNode next){
        this.value = value;
        this.next = next;
    }

    public void printList(){
        System.out.print(value+" -> ");
        if(next!=null){
            next.printList();
        }
    }
}
