package linkedList;

import linkedList.InsertHead.Node;

public class InsertTail {
	Node head;
	Node tail;
	int size=0;
	class Node{
		int data;
		Node next;
		
		Node(int data, Node next){
			this.data=data;
			this.next=next;
		}
	}
	public void sizes() {
		Node curr= head;
		
		while(curr!=null) {
			curr=curr.next;
			size++;
		}
		System.out.println(size);
	}
	public void addTail(int data) {
		Node newNode =new Node(data, null);
		Node curr = head;
		if (head == null) {
			head = newNode;
			tail=newNode;
			return;
		}
		else {
//			Node temp=head;
//			head=newNode;
//			head.next=temp;
			
			tail.next=newNode;
			tail=newNode;
			
		}
		
		
//		while (curr.next!= null) {
//			curr = curr.next;
//		}
//		curr.next = newNode;
	}

	 void display() {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data +" ");
			temp=temp.next;
		}
		System.out.println();
	}
//	 public boolean search(int data) {
//		 Node temp=head;
//		 while(temp!=null) {
//			 if(data==temp.data) {
//				 return true;
//			 }
//			 temp=temp.next;
//		 }
//		 return false;
//	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InsertTail a = new InsertTail();
		a.addTail(0);
		a.addTail(1);
		a.addTail(2);
		a.addTail(3);
		a.display();
		a.sizes();
		//System.out.println(a.search(3));
	}

}
