package service;

import java.util.Scanner;

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
		que.print();
		System.out.println(Runtime.getRuntime().freeMemory());
		Scanner myscan = new Scanner(System.in);
		while (true) {
			int newint = myscan.nextInt();
			if (newint == 0) break;
			else {
				que.enqueue(newint);
				que.print();
				System.out.println(Runtime.getRuntime().freeMemory());
			}
			
		}
		myscan.close();
	}

}
