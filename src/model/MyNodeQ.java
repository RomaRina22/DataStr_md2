package model;

public class MyNodeQ<T> {
	private T value;
	private MyNodeQ<T> next;
	private MyNodeQ<T> previous;
	public T getValue() {
		return value;
	}
	public void setValue(T value) {
		this.value = value;
	}
	public MyNodeQ<T> getNext() {
		return next;
	}
	public void setNext(MyNodeQ<T> next) {
		if (next != null) {
			next.previous = this;
			
		}
		else {
			this.next = null;
		}
	}
	
	public MyNodeQ<T> getPrevious() {
		return previous;
	}
	public void setPrevious(MyNodeQ<T> previous) {
		this.previous = previous;
	}
	public MyNodeQ(T value) {
		super();
		setValue(value);
		setNext(null);
		setPrevious(null);
	}
	@Override
	public String toString() {
		return getValue().toString();
	}
}
