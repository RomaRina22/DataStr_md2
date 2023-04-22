package model;

public class MyStack<T> {
	private MyNodeS<T> topNode;
	private int length;
	private final int MAX_SIZE = 100000;
	
	public MyStack() {
		super();
		topNode = null;
		length = 0;
	}
	
	public boolean isFull() { //nav īsti jēgas no šī...
		/*if (length < MAX_SIZE) {
			return false;
		}
		else {
			return true;
		}*/
		final int MEMORY_TRESHOLD = 10;
		return (Runtime.getRuntime().freeMemory() > MEMORY_TRESHOLD);
	}
	
	public boolean isEmpty() {
		return (length == 0);
	}
	
	public int getLength() {
		return length;
	}
	
	public void push(T value) {
		if (!isFull()) {
			MyNodeS<T> newNode = new MyNodeS<T>(value);
			newNode.setNext(topNode);
			length++;
			topNode = newNode;
		}
		else {
			throw new Error("Not enough memory to increase size!");
		}
	}
}
