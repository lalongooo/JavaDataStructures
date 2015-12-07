package com.lalongooo.datastructures;

public class Main {

	public static void main(String[] args) {
		
		Stack s = new Stack(5);
		
		s.push(1);
		System.out.println(s.peek());
		s.push(5);
		System.out.println(s.peek());
		s.push(3);
		System.out.println(s.peek());
		s.push(4);
		System.out.println(s.peek());
		s.push(2);
		System.out.println(s.peek());

		System.out.println("PUSH FINISHED!");
		
		System.out.println(s.pop());
		System.out.println(s.peek());
		
		System.out.println(s.pop());
		System.out.println(s.peek());
		
		System.out.println(s.pop());
		System.out.println(s.peek());
		
		System.out.println(s.pop());
		System.out.println(s.peek());
		
		System.out.println(s.pop());
		System.out.println(s.peek());

	}

}
