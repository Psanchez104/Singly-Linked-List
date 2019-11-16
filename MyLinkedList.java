//a simple singly linked list


public class MyLinkedList<E> {
	public class Node<E>{
		private E element;
		private Node<E> next;
		//constructor
		public Node(E e){
			element = e;
			next = null;
		}
		
		//other methods
		public E getElement() {
			return element;
		}
		public Node<E> getNext(){
			return next;
		}
	}
	
	//List variables
	int size;
	Node<E> head;
	Node<E> tail;
	
	//constructor
	MyLinkedList(){
		head = null;
		tail = null;
		size = 0;
	}
	
	//other methods
	public void addFirst(E value)throws Exception {
		if(value == null) throw new Exception("Value passed in is empty");
		Node<E> node = new Node<E>(value);
		node.next = head;
		head = node;
		size++;
	}
	public void addLast(E value)throws Exception {
		if(value == null) throw new Exception("Value passed in is empty");
		Node<E> node = new Node<E>(value);
		tail.next = node;
		tail = node;
		size++;
	}
	public E removeFirst()throws Exception {
		if(size == 0) throw new Exception("List is empty");
		Node<E> temp = new Node<E>(head.getElement());
		head = head.getNext();
		size--;
		return temp.getElement();
	}
	public E removeLast()throws Exception {
		if(size == 0) throw new Exception("List is empty");
		if(head == tail) return removeFirst();
		Node<E> temp = head;
		while(temp.getNext() != tail) {
		temp = temp.getNext(); 
		}
		tail = temp;
		size--;
		return temp.getElement();
	}
	public boolean contains(E key) {
		Node<E> temp = head;
		while(temp != tail) {
			if(temp.getElement() == key) return true;
			temp = temp.getNext();
		}
		return temp.getElement() == key;
	}
}
