package linkedLIstDemo;


public class KthElement {
	
	public static class Node{
		Node next=null;
		int val;
		
		public Node(int val) {
			this.val=val;
			
		}
	}
	public static Node findKElement(Node head,int k) {
		int count =0;
		while(head!= null) {
			count++;
			if(count==k) {
				return head;
			}
			head=head.next;
		}
		return null;
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
		Node head=findKElement(node1,3);
		System.out.println("------------");
		while(head!=null) {
			System.out.println(head.val);
			head=head.next;
			
		}

	}

}
