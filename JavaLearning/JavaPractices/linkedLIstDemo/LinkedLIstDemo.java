package linkedLIstDemo;

import java.lang.reflect.Array;

public class LinkedLIstDemo {
	
	NodeEx head;
	/*@ NodeEx
	 This is the Node structure. It has data part and 
	address part and head.The structure has a constructor.
	which should initialize address and data.
	*/
	
	public static class NodeEx{
		int data;
		NodeEx next;
		NodeEx(int d){
			data= d;
			next=null;
		}
		public NodeEx() {
			// TODO Auto-generated constructor stub
		}
		
	  }

/*
 * reverseLinkedList() method is to reverse the 2 linked list.
 */
	private static NodeEx reverseLinkedList(NodeEx l) {
		
		NodeEx prev=null;
		NodeEx nextNode=null;
		NodeEx currentNode=l;
		while (currentNode!= null) {

			nextNode=currentNode.next;
			currentNode.next=prev;
			prev=currentNode;
			currentNode=nextNode;
			
				}
		l=prev;
		return l;
	}

	
// To add 2 linked lists numbers.
 static int addition(NodeEx list1, NodeEx list2) {
	String concat1="";
	String concat2="";
	 while (list1!=null) {
		 concat1= concat1+ Integer.toString(list1.data);
		 concat2= concat2+ Integer.toString(list2.data);
		 list1=list1.next;
		 list2=list2.next;
		 
	 }
	 int num1= Integer.parseInt(concat1);
	 int num2= Integer.parseInt(concat2);
	 int totalSum= num1+ num2;
	return totalSum;
	 
}


//To display linked list
	static boolean printList(NodeEx node) 
    { 
        while (node != null) { 
            System.out.print(node.data + " "); 
            node = node.next; 
        }
		return true; 
    } 

	
//every methods are called from main. boolean printList(NodeEx node),
//int addition(NodeEx list1, NodeEx list2), NodeEx reverseLinkedList(NodeEx l)

	public static void main(String[] args) {
		
		LinkedLIstDemo demo= new LinkedLIstDemo();
		demo.head= new NodeEx(2);
		NodeEx node2= new NodeEx(4);
		NodeEx node3= new NodeEx(3);
		demo.head.next=node2;
		node2.next= node3;
		node3.next=null;
		NodeEx l1=demo.head;
		
		LinkedLIstDemo demo12= new LinkedLIstDemo();
		demo12.head= new NodeEx(5);
		NodeEx node12= new NodeEx(6);
		NodeEx node13= new NodeEx(4);
		demo12.head.next=node12;
		node12.next= node13;
		node13.next=null;
		NodeEx l2=demo12.head;
		
		NodeEx list1=reverseLinkedList(l1);
		NodeEx list2=reverseLinkedList(l2);
		int sum=addition(list1,list2);
		String[] digits= (Integer.toString(sum)).split("");
		NodeEx element1= new NodeEx(Integer.parseInt(digits[0]));
		NodeEx element2= new NodeEx(Integer.parseInt(digits[1]));
		NodeEx element3= new NodeEx(Integer.parseInt(digits[2]));
		element1.next= element2;
		element2.next=element3;
		element3.next= null;
		NodeEx sumReverse= reverseLinkedList(element1);
		printList(sumReverse);
		
		
			
	
	}
}
