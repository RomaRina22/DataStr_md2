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
	public T pop() {
		if (!isEmpty()) {
			length--;
			MyNodeS<T> oldtop = topNode;
			topNode = topNode.getNext();
			return oldtop.getValue();
		}
		else {
			throw new Error("Cannot pop from empty!");
		}
	}
	public T top() {
		if (topNode!=null) {
			return topNode.getValue();
		}
		else {
			return null;
		}
	}
	public void print() {
		MyNodeS<T> iterator = topNode;
		String values = "";
		if (iterator != null) { //first step of loop without comma
			values += iterator.toString();
			iterator = iterator.getNext();
		}
		while (iterator != null) {
			values += ", "+iterator.toString();
			iterator = iterator.getNext();
		}
		System.out.println("Stack =["+values+"]");
	}
}
