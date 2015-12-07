package com.lalongooo.datastructures;

public class Stack {
	
	private int size;
	private int [] stackArray;
	private int top = -1;
	
	Stack(int size) throws IllegalArgumentException {
		if(size < 1){
			throw new IllegalArgumentException("The size of the stack must be greater than zero.");
		}
		this.size = size;
		stackArray = new int [size];		
	}
	
	public int push(int newItem) {
		if(top+1 < size){
			top++;
			stackArray[top] = newItem;
			return top;
		}else{
			System.out.println("The stack is full.");	
			return -1;
		}
	}
	
	public int pop(){
		if(top > -1){
			int oldItem = stackArray[top];
			stackArray[top] = -1;
			top--;
			return oldItem;
		}else{
			System.out.println("The stack is empty.");
			return -1;
		}
	}
	
	public int peek(){
		if(top > -1){
			return stackArray[top];
		}else{
			System.out.println("The stack is empty.");
			return -1;
		}
	}
	
	public int size(){
		return size;
	}

}
