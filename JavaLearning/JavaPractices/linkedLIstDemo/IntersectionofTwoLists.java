package linkedLIstDemo;

import java.util.HashMap;
import java.util.Map;

//if one method recieves 2 arguments,does we need to return 2 arguments.
//because its showing error if return just 1 argument.

public class IntersectionofTwoLists {

	public static class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}

	public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		Map<ListNode, Integer> checkMap= new HashMap<>();
		while (headA!=null) {
			checkMap.put(headA, headA.val);
			headA=headA.next;
		}
		while(headB!=null) {
			if(checkMap.containsKey(headB)) {
				return headB;
			}
			headB=headB.next;
		}
		return null;
		
	}

	public static void main(String[] args) {
		ListNode l1head = new ListNode(0);
		ListNode l1node2 = new ListNode(9);
		ListNode l1node3 = new ListNode(1);

		ListNode mergeNode1 = new ListNode(2);
		ListNode mergeNode2 = new ListNode(4);

		ListNode l2head = new ListNode(3);

		l1head.next = l1node2;
		l1node2.next = l1node3;
		mergeNode1.next = mergeNode2;
		mergeNode2.next = null;

		l2head.next = mergeNode1;
		l1node3.next = mergeNode1;

		ListNode l = getIntersectionNode(l1head, l2head);
		if (l != null)
			System.out.println("They intersects at node "+l.val);
		else
			System.out.println("no intersection");

	}

}
