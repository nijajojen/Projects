package linkedLIstDemo;



public class RemoveDuplicates {
	
	public static class Node{
		Node next=null;
		int val;
		
		public Node(int val) {
			this.val=val;
			
		}
	}

	private static Node findDuplicates(Node head) {
		Node head1=head;
		Node head2= head;
		while(head1.next!=null) {
			//System.out.println("head1"+head1.val);
			while(head2!=null) {
				
				if(head2.next==null) {
					break;
				}
					if(head1.val== head2.next.val) {
						removeDups(head2);
					}
					System.out.println("head2"+head2.val);
				
				
				head2=head2.next;
				
				
				
			}
			head1= head1.next;
			head2=head1;
		}
		return head;
		
	}
	private static Node removeDups(Node head2) {
		
		head2.next=head2.next.next;
		return head2;
		
	}
	public static void main(String[] args) {
		Node node1= new Node(3);
		Node node2= new Node(1);
		Node node3= new Node(1);
		Node node4= new Node(2);
		Node node5= new Node(3);
		node1.next= node2;
		node2.next=node3;
		node3.next=node4;
		node4.next= node5;
		Node head=findDuplicates(node1);
		System.out.println("------------");
		while(head!=null) {
			System.out.println(head.val);
			head=head.next;
			
		}
	}

}
