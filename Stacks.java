package com.bl.stackandqueue;

public class Stacks<T extends Comparable <T>> {
		
	int top;
	int size;
	LinkedLists<T> list;
	LinkedLists<T> perform = new LinkedLists<T>();
	
	boolean isEmpty() {
		return (top == -1);
	}
	
	boolean isFull() {
		return (top == (size -1));
	}
	
	public void size() {
		perform.printSize();
	}
	
	public void push(T newElement) {
		if(isFull()) {
			System.out.println("Stack Overflow!");
		}
		else {
			list.add(newElement);
			top++;
			System.out.println("\nElement added! :" + newElement );
		}
	}
	
	public void pop() {
		if(isEmpty()) {
			System.out.println("Stack Underflow!");
		}
		else {
			System.out.println("Element popped :" +list.head.data);
			list.pop(list.head.data);
			top--;
		}
	}
	
	public void peek() {
		if(isEmpty()) {
			System.out.println("Stack Underflow!");
		}
		else {
			T topElement = list.head.data;
			System.out.println("\nThe top element of the stack is " + topElement);
		}
	}
	
	public T getPeek() {
		T topElement;
		
		if(isEmpty()) 
			topElement = null;
		else 
			topElement = list.head.data;
		
		return topElement;
	}
	
	public void printStack() {
		System.out.print("\nDisplaying the stack : ");
		list.printLinkedList();
	}
	
	public Stacks(int size) {
		super();
		this.top = -1;
		this.size = size;
		this.list = new LinkedLists<T>();
	}

	public Stacks() {
		top = -1;
	}
	
}
