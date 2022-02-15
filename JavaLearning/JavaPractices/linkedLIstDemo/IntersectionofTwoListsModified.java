package linkedLIstDemo;


public class IntersectionofTwoListsModified {

	public static class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}

	public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		ListNode currA= headA;
		ListNode currB= headB;
		while(currA!=currB) {
			if(currA!=null)
				currA= currA.next;
			else
				currA=headA;
			
			if(currB!=null)
				currB= currB.next;
			else
				currB=headB;
				
			}
		
		return currB;
	}

	public static void main(String[] args) {
		ListNode firstHead = new ListNode(0);
		ListNode node2 = new ListNode(9);
		ListNode node3 = new ListNode(1);

		ListNode mergeNode1 = new ListNode(2);
		ListNode mergeNode2 = new ListNode(4);

		ListNode secHead = new ListNode(3);

		firstHead.next = node2;
		node2.next = node3;
		mergeNode1.next = mergeNode2;
		mergeNode2.next = null;
		node3.next = mergeNode1;
		secHead.next = mergeNode1;
		

		ListNode l = getIntersectionNode(firstHead, secHead);
		if (l != null)
			System.out.println("They intersects at node "+l.val);
		else
			System.out.println("no intersection");

	}

}
