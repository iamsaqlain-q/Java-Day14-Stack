package com.bl.stackandqueue;

public class StackOperations {
	public static void main(String[] args) {

		System.out.println("Peek and Pop from stack 56->30->70.");
		Stacks<Integer> stack = new Stacks<Integer>(3);
		stack.push(70);
		stack.printStack();
		stack.push(30);
		stack.printStack();
		stack.push(56);
		stack.printStack();
		
		while(!(stack.isEmpty())) {
			stack.peek();
			stack.pop();
			stack.printStack();
		}
	}
}
