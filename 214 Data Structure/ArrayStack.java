public class ArrayStack<E> implements Stack<E>{
	public static final int CAPACITY = 1000;
	private E[] data;
	private int t = -1;

	public ArrayStack(){
		this(CAPACITY);
	}
	
	public ArrayStack(int capacity){
		data = (E[]) new Object[capacity];
	}

	public int size(){
		return (t+1);
	}

	public boolean isEmpty(){
		return (t == -1);
	}

	public String toString(){
		StringBuilder sb = new StringBuilder("(");
		for(int j = t; j >= 0; j--){
			sb.append(data[j]);
			if(j > 0)
				sb.append(",");
		}
		sb.append(")");
		return sb.toString();
	}

	public E top() {
		if(isEmpty())
			return null;
		return data[t];
	}

	public void puch(E e) throws IllegalStateException{
		if(size() == data.length)
			throw new IllegalStateException("Stack is full");
		data[++t] = e;
	}

	public E pop() {
		if(isEmpty())
			return null;
		E answer = data[t];
		data[t] = null;
		t--;
		return answer;
	}
}
