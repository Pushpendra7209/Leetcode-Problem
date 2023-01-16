package double_linkedList;

import linkedList.DeleteAnyPosition;


public class InsertAtbegin {
	Node head;
	Node tail;
	int size=0;
	class Node{
		int data;
		Node next;
		Node prev;
		Node(int data, Node next,Node prev){
			this.data=data;
			this.next=next;
			this.prev=prev;
		}
	}
	public void addHead(int data) {
		head=new Node(data,head,null);
		size++;
	}
	public void display() {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InsertAtbegin d=  new InsertAtbegin();
		d.addHead(7);
		d.addHead(6);
		d.addHead(5);
		d.addHead(4);
		d.addHead(3);
		d.addHead(2);
		d.addHead(1);
		d.display();	
	}
}
