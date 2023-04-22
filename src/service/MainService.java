package service;

import model.MyQueue;

public class MainService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Runtime.getRuntime().freeMemory());
		MyQueue<Integer> que= new MyQueue<>();
		System.out.println(Runtime.getRuntime().freeMemory());
		que.enqueue(5);
		que.enqueue(5);
		que.enqueue(5);
		que.enqueue(5);
		que.enqueue(5);
		que.enqueue(5);
		que.enqueue(5);
		que.enqueue(5);
		System.out.println(Runtime.getRuntime().freeMemory());
	}

}
