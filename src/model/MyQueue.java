package model;

public class MyQueue<T> {
	private MyNodeQ<T> frontNode;
	private MyNodeQ<T> rearNode;
	private int length;
	private final int MEMORY_TRESHOLD = 10; //for isfull
	
	public MyQueue() {
		frontNode = null;
		rearNode = null;
		length = 0;
	}
	
	public boolean isFull() {
		return (Runtime.getRuntime().freeMemory() > MEMORY_TRESHOLD);
	}
	public boolean isEmpty() {
		return (length == 0);
	}
	public int getLength() {
		return length;
	}
	
	public void enqueue(T value) {
		if (!isFull()) {
			MyNodeQ<T> newnode = new MyNodeQ<T>(value);
			newnode.setNext(rearNode);
			rearNode = newnode;
			length++;
			if (frontNode == null) {
				frontNode = rearNode;
			}
		}
		else {
			throw new Error("Not enough space to enqueue");
		}
	}
	public T dequeue() {
		if (!isEmpty()) {
			MyNodeQ<T> oldfront= frontNode;
			frontNode = frontNode.getPrevious();
			if (frontNode != null) {
				frontNode.setNext(null);
			}
			else {
				rearNode = null;
			}
			length--;
			return oldfront.getValue();
		}
		else {
			throw new Error("Queue is already empty!");
		}
	}
}
