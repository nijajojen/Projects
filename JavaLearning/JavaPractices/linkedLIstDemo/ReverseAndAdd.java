package linkedLIstDemo;

public class ReverseAndAdd {
	
	public static class Node{
		Node next=null;
		int data;
		public Node(int data) {
			this.data= data;
		}
		
	}
	
	private static Node linkedListReversal(Node curr) {
		
		Node prev=null;
		Node temp=null;
		while(curr.next!=null) {
			
			temp=curr.next;
			curr.next=prev;
			prev=curr;
			curr=temp;
			
		}
		curr.next = prev;
		return curr;
		
	}

	private static Node addReversedList(Node head1, Node head2) {
		int carry=0;
		
		Node prior=null;
		boolean headStatus=true;
		Node newHead=null;
		while(head1!=null && head2!=null) {
			int val= head1.data+ head2.data;
			
			val+=carry;
			if(val>=10) {
				carry=val/10;
				val= val%10;
			}
			
			Node sum= new Node(val);
			if(headStatus==true) {
					
					prior=sum;
					newHead=prior;
					headStatus=false;
				}
				else {
					prior.next=sum;
					prior=prior.next;
				}				
				head1=head1.next;
				head2=head2.next;
			}
			if(carry>0) {
				Node carryNode= new Node(carry);
				prior.next=carryNode;
			}
		return newHead;
		
	}
	public static void main(String[] args) {
		Node node1= new Node(7);
		Node node2= new Node(1);
		Node node3= new Node(6);
		node1.next=node2;
		node2.next=node3;
		node3.next=null;
		
		Node node4= new Node(5);
		Node node5= new Node(9);
		Node node6= new Node(2);
		node4.next=node5;
		node5.next=node6;
		node6.next=null;
		
		Node head1=linkedListReversal(node1);
		Node head2=linkedListReversal(node4);
		
	    Node ansBeforeReversal=addReversedList(head1, head2);
	    Node ans=linkedListReversal(ansBeforeReversal);
		while(ans!=null) {
			System.out.println(ans.data);
			ans=ans.next;
			
		}
				
	}

}
