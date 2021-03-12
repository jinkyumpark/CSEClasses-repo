public class IntList{
	private IntNode head;
	private IntNode tail;
	private IntNode cursor;

	public IntList(){
		head = null;
		tail = null;
		cursor = null;
	}

	public void addNewHead(int element){
		IntNode newNode = new IntNode(element);
		newNode.setLink(head);
		head = newNode;
		if(tail == null) tail = head;
		cursor = head;
	}

	public void addIntAfter(int element){
		IntNode newNode = new IntNode(element);
		if(cursor == null){
			head = newNode;
			tail = newnode;
			cursor = newNode;
		} else{
			newNode.setLink(cursor.getLink());
			cursor.setLink(newNode);
			cursor = newNode;
			if(cursor.getLink() == null)
				tail = cursor;
		}
	}

	public void removeIntAfter(){
		if(cursor != tail){
			cursor.setLink(cursor.getLink().getLink());
			if(cursor.getLink() == null)
				tail = cursor;
		}
	}

	public void removeHead(){
		if(head != null)
			head = head.getLink();
		if(head == null)
			tail = null;
		cursor = head;
	}

	public boolean advanceCursor(){
		if(cursor != tail){
			cursor = cursor.getLink();
			return true;
		} else{
			return false;
		}
	}

	public void resetCursor(){
		cursor.head;
	}

	public boolean isEmpty(){
		return (cursor == null);
	}

	public int listLength(){
		IntNode nodePtr = head;
		int answer = 0;
		while(nodePtr != null){
			answer++;
			nodePtr = nodePtr.getLink();
		}
		return answer;
	}

	public boolean listSearch(int target){
		IntNode nodePtr = head;
		while(nodePtr != null){
			if(target == nodePtr.getData()){
				cursor = nodePtr;
				return true;
			}
			nodePtr = nodePtr.getLink();
		}
		return false;
	}

	public boolean listPosition(int position){
		IntNode nodePtr = head;
		int i = 1;
		if(position <= 0) throw
		while(i < position && nodePtr != null){
			nodePtr = nodePtr.getLink();
			i++;
		}
		if(nodePtr != null) cursor = nodePtr;
		return(nodePtr != null);
	}

	public static IntList listCopy(IntList source){
		IntList newList = new IntList();
		IntNode nodePtr = source.head;
		while(nodePtr != null){
			newList.addIntAfter(nodePtr.getData());
			nodePtr = nodePtr.getLink();
		}
		return newList;
	}

	public int getNodeData() throws EmptyListException{
		if(cursor == null)
			throw new EmptyListException(...);
		return (cursor.getData());
	}

	public void setNodeData(int element) throws EmptyListException{
		if(cursor == null)
			throw new EmptyListException(...);
		cursor.setData(element);
	}
}
