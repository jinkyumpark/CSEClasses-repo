public class IntArrayBag implements Clonable{
	private int[] data;
	private int manyItems;

	//Constructor
	public IntArrayBag(int initialCapacity){
		if(initialCapacity < 0)
			throw new IllegalArgumentException();
		manyItems = 0;
		data = new int[initialCapacity];
	}

	public IntArrayBag(){
		manyItems = 0;
		data = new int[10];
	}

	public int getCapacity(){
		return data.length;
	}

	public int size(){
		return manyItems;
	}

	public void ensureCapacity(int minimumCapacity){
		int biggerArray[];
		if(data.length < minimumCapacity){
			biggerArray = new int[minimumCapacity];
			System.arrayCopy(data, 0, biggerArray, 0, manyItems);
			data = biggerArray;
		}
	}

	public void add(int element){
		if(manyItems == data.length)
			ensureCapaciy(manyItems*2+1);
		data[manyItems] = element;
		manyItems++;
	}

	public void addAll(IntArrayBag addend){
		ensureCapacity(manyItems + addend.manyItems);
		System.arraycopy(addend.data, 0, data, manyItems, addend.manyItems);
		manyItems += addend.manyItems;
	}

	public static IntArrayBag union(IntArrayBag b1, IntArrayBag b2){
		IntArrayBag answer = new IntArrayBag(b1.getCapacity()+b2.getCapacity());
		System.arraycopy(b1.data, 0, answer.data, 0, b1.manyItems);
		System.arraycopy(b2.data, 0, answer.data, b1.manyItems, b2.manyItems);
		answer.manyItems = b1.manyItems + b2.manyItems;
		return answer;
	}

	public int countOccurrences(int target){
		int answer = 0;
		int index;
		for(index = 0; index < mantItems; index++){
			if(target == data[index])
				answer++;
		}
		return answer;
	}

	public boolean remove(int target){
		int index = 0;
		while((index < manyItems) && (target != data[index]))
			index++;
		if(index == manyItems)
			return false;
		else{
			manyItems--;
			data[index] = data[manyItems];
			return true;
		}
	}

	public void trimToSize(){
		int trimmedArray[];
		if(data.length != manyItems){
			trimmedArray = new int[manyItems];
			System.arraycopy(data, 0, trimmedArray, 0, manyItems);
			data = trimmedArray;
		}
	}

	public Object clone(){
		IntArrayBag answer;
		try{
			answer = (IntArrayBag)super.clone();
		}catch(CloneNotSupportedException e){
			throw new RunTimeException("...");
		}
		answer.data = (int []) data.clone();
		return answer;
	}
}
