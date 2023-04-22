package service;

import java.io.File;
import java.time.temporal.UnsupportedTemporalTypeException;
import java.util.Scanner;
import java.util.regex.Pattern;

import model.MyQueue;
import model.MyStack;
import model.Student;

public class MainService {

	public static void main(String[] args) {
		MyStack<Integer> intStack = new MyStack<>();
		MyStack<Student> stuStack = new MyStack<>();
		
	}
	
	public boolean syntaxCheck (File inFile) {
		int line = 0;
		boolean fileOk = true;
		try {
			Scanner fileScan = new Scanner(inFile);
			MyStack<Character> charStack = new MyStack<>();
			while (fileScan.hasNext()) {
				String newLine = fileScan.nextLine();
				line++;
				for (char temp: newLine.toCharArray()) {
					if (temp == '[' || temp == '(' || temp == '{') {
						charStack.push(temp);
					}
					else {
						if (temp == ']' || temp == ')' || temp == '}') {
							char expectedChar = ' ';
							char lastOpenBrace = charStack.pop(); 
							switch(lastOpenBrace) {
							case '[':
								expectedChar = ']';
								break;
							case '{':
								expectedChar = '}';
								break;
							case '(':
								expectedChar = ')';
								break;
							}
							if (expectedChar != temp) {
								fileOk = false;
								System.out.println("Found error at "+inFile.getName()+"("+line+")"+", expected "+expectedChar+", found "+temp+".");
							}
						}
					}
				}
			}
			fileScan.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return fileOk;
	}
}
