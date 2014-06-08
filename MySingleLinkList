package mydemoproject;

class node {

	int value;
	node prev, next;

	public node() {
		this.value = -1;
		this.prev = null;
		this.next = null;
	}

	public node getPrev() {
		return prev;
	}

	public void setPrev(node prev) {
		this.prev = prev;
	}

	public node getNext() {
		return next;
	}

	public void setNext(node next) {
		this.next = next;
	}

}

class MyLinkList {
	node head;
	public static int size;

	public MyLinkList() {
		head = new node();

	}

	public void addNode(int data) {
		node n = new node();
		if (size == 0) {
			
			// head is added
	//		head = new node();
			head.value = data;
			head.next = null;
			head.prev = null;
			size++;
		} else {
			
			node cur = new node();
			
			cur = head;
			while (cur.next != null) {
				
				cur = cur.next;
			}
			n.value = data;
			cur.next = n;
			n.prev = cur;
			size++;
		}
	}

	void displayLinkList() {
	
		node cur = head;
		while (cur.next!=null) {
			System.out.println(cur.value);
			cur = cur.next;
		}
		System.out.println(cur.value);
		System.out.println("+++++++++++++++++++++++++++++++++++++++\n");
		
		while(cur.prev!=null)
		{
			System.out.println(cur.value);
			cur = cur.prev;
		}
		System.out.println(cur.value);
	}
}

public class MySingleLinkList {

	public static void main(String args[]) {

		MyLinkList ll = new MyLinkList();
		ll.addNode(4);
		ll.addNode(6);
		ll.addNode(3);
		ll.addNode(9);
		ll.displayLinkList();

	}
}
