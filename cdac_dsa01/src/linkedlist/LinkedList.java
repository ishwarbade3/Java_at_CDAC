package linkedlist;

public class LinkedList {
	private Node head;

	public LinkedList() {
		head = null;
	}

	public void insertFirst(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
		} else {
			newNode.setNext(head);
			head = newNode;
		}
	}

	public void insertLast(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
		} else {
			Node temp = head;
			while (temp.getNext() != null) {
				temp = temp.getNext();
			}
			temp.setNext(newNode);
		}
	}

	public void display() {
		if (head == null) {
			System.out.println("Linked List Is Empty");
		} else {
			Node temp = head;
			while (temp != null) {
				System.out.print(temp.getData() + " -> ");
				temp = temp.getNext();
			}
		}
	}

	public void deleteFirst() {
		if (head == null) {
			System.out.println("Linked List Is Empty");
		} else {
			Node temp = head.getNext();
			System.out.println(head.getData() + " id Deleted Data");
			head = temp;
		}
	}
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.insertFirst(10);
		ll.insertFirst(20);
		ll.insertFirst(30);
		ll.insertFirst(40);
		ll.insertFirst(50);
		ll.display();
		System.out.println();
		ll.deleteFirst();
		ll.display();

		}

}
