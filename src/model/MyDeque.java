package model;

public class MyDeque<T> {
	private MyNodeQ<T> frontNode; //MyNodeD būtu tāda paša klases kopija
	private MyNodeQ<T> rearNode;
	private int length;
	private final int MEMORY_TRESHOLD = 10; //for isfull
	
	public MyDeque() {
		frontNode = null;
		rearNode = null;
		length = 0;
	}
}
