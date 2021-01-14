class Node {
	private int data;
	public Node next;

	@SuppressWarnings("null")
	public Node() {
		this.data = (Integer) null;
		this.next = null;
	}
	public Node(int data) {
		this.data = data;
		this.next = null;
	}
	public int getdata() {
		return this.data;		
	}
}

public class SingleLinkedList {
	private Node head;
	public void addData(int data) {
		Node newNode=new Node(data);
		if(head==null) {
			head=newNode;
		}else {
			Node curr=head;
			while(curr.next!=null) {
				curr=curr.next;
			}
			curr.next=newNode;
		}
	}
	public static void main(String[] args) {
		SingleLinkedList sList=new SingleLinkedList();
		sList.addData(1);
		sList.addData(2);
		System.out.println(sList.head.next.getdata());
		System.out.println(sList.head.getdata());
	}

}
