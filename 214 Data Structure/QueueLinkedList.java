public class IntQueue implements Cloneable{
	private IntNode front;
	private IntNode rear;

	public IntQueue(){
		front = null;
		rear = null;
	}

	public boolean isEmpty(){
		return (front == null);
	}

	public void enqueue(int item){
		IntNode newNode = new IntNode(item);
		if(front == null){
			front = newNodel rear = front;
		}else{
			rear.setLink(newNode);
			rear = newNode;
		}
	}

	public int dequeue(){
		int answer;
		if(front == null)
			throw new EmptyQueueException();
		answer = front.getData();
		front = front.getLink();
		if(front == null) rear = null;
		return answer;
	}
}
