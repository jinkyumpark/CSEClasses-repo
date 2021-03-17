public class LinkedStack<E> implements Stack<E>{
	private SinglyLinkedList<E> list = new SinglyLinkedList<>();

	public LinkedStack(){}

	public int size(){
		return list.size();
	}

	public boolean isEmpty(){
		return list.isEmpty()
	}

	public E top(){
		return list.first();
	}

	public void push(E element){
		list.addFirst(element);
	}

	public E pop(){
		return list.removeFirst();
	}
}
