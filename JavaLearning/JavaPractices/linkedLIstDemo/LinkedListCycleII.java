package linkedLIstDemo;
import java.util.Map;
import java.util.HashMap;
//can we create linked list ,using for loop????
//use slow and fast pointer solution
public  class LinkedListCycleII {
	public static class  ListNode {
		      int val;
		      ListNode next;
		      ListNode(int x) {
		          val = x;
		          next = null;
		      }
		  }
	
	
	public static ListNode detectCycle(ListNode currentNode) {
		Map<ListNode, Integer> checkMap= new HashMap<ListNode, Integer>();		
		int pos=0;
		while(currentNode!=null) {
			if(checkMap.containsKey(currentNode)== false) {
			checkMap.put(currentNode,pos);
			pos++;
			}
			else {
				System.out.println("tail connects to node "+ checkMap.get(currentNode));
				return currentNode;
			}			
			currentNode=currentNode.next;
			}
		System.out.println("There is no cycle in the linked list.");
		return null;					
	    } 

	
public static void main(String[] args) {
		
		ListNode head= new ListNode(3);
		ListNode node2= new ListNode(2);
		ListNode node3= new ListNode(0);
		ListNode node4= new ListNode(-4);
		for(String intStr : args) {
			
		}
		/*A->B->C
		 * ListNode prevNode = head;
		for (int i = 0; i< 4;i++) {
			ListNode node = new ListNode(i);
			prevNode.next = node;
			prevNode = node;
		}*/
		head.next=node2;
		node2.next= node3;
		node3.next=node4;
		node4.next=node2;
		
	/*ListNode head= new ListNode(3);*/
	
		detectCycle(head);

	}
}
