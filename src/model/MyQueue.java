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
}
