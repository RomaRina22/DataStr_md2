package model;

public class MyQueue<T> {
	private MyNodeQ<T> frontNode;
	private MyNodeQ<T> rearNode;
	private int length;
	
	public MyQueue() {
		frontNode = null;
		rearNode = null;
		length = 0;
	}
}
