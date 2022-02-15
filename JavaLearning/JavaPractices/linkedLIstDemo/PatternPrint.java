package linkedLIstDemo;



public class PatternPrint {

	public static class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}
	
	
	public static void reorderList(ListNode head) {
        if(head==null||head.next==null) return;
        
        //Find the middle of the list
        ListNode p1=head;
        ListNode p2=head;
        while(p2.next!=null&&p2.next.next!=null){ 
            p1=p1.next;
            p2=p2.next.next;
        }
        
        //Reverse the half after middle  1->2->3->4->5->6 to 1->2->3->6->5->4
        ListNode preMiddle=p1;
        ListNode preCurrent=p1.next;
        while(preCurrent.next!=null){
            ListNode current=preCurrent.next;
            preCurrent.next=current.next;
            current.next=preMiddle.next;
            preMiddle.next=current;
        }
        
        //Start reorder one by one  1->2->3->6->5->4 to 1->6->2->5->3->4
        p1=head;
        p2=preMiddle.next;
        while(p1!=preMiddle){
            preMiddle.next=p2.next;
            p2.next=p1.next;
            p1.next=p2;
            p1=p2.next;
            p2=preMiddle.next;
        }
    }
	public static void main(String[] args) {
		ListNode l1head = new ListNode(1);
		ListNode l1node2 = new ListNode(2);
		ListNode l1node3 = new ListNode(3);
		ListNode l1node4 = new ListNode(4);
		ListNode l1node5 = new ListNode(5);
		ListNode l1node6 = new ListNode(6);
		l1head.next = l1node2;
		l1node2.next = l1node3;
		l1node3.next=l1node4;
		l1node4.next=l1node5;
		l1node5.next=l1node6;
		l1node6.next=null;
		reorderList(l1head);

	}

}
