package model;

public class MyNodeS<T> {
	private T value;
	private MyNodeS<T> next;
	public T getValue() {
		return value;
	}
	public void setValue(T value) {
		this.value = value;
	}
	public MyNodeS<T> getNext() {
		return next;
	}
	public void setNext(MyNodeS<T> next) {
		this.next = next;
	}
	public MyNodeS(T value) {
		super();
		setValue(value);
		setNext(null);
	}
	@Override
	public String toString() {
		return getValue().toString();
	}
}
