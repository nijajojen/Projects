package linkedLIstDemo;

import linkedLIstDemo.KthElement.Node;

public class RemoveMiddle {

	public static class Node{
		Node next=null;
		int val;
		
		public Node(int val) {
			this.val=val;
			
		}
	}
	
	
	private static Node copyData(Node Mid) {
		Mid.val= Mid.next.val;
		Mid.next= Mid.next.next;
		return Mid;
		
	}
	
	public static void main(String[] args) {
		Node node1= new Node(3);
		Node node2= new Node(1);
		Node node3= new Node(5);
		Node node4= new Node(2);
		Node node5= new Node(3);
		node1.next= node2;
		node2.next=node3;
		node3.next=node4;
		node4.next= node5;
		Node head=copyData(node3);
		System.out.println("------------");
		while(head!=null) {
			System.out.println(head.val);
			head=head.next;
			
		}

	}

}
