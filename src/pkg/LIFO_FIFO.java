package pkg;

import java.util.Stack;

public class LIFO_FIFO {
	private static final int Integer = 0;


	static void stack_insert(Stack<Integer> stack) 
    { 
        for (int i = 0; i < 5; i++) { 
            stack.push(i); 
        } 
    } 
  

    static void print_stack(Stack<Integer> stack) 
    { 
        System.out.println("Elements in stack :"); 
  
        for (int i = 0; i < 5; i++) { 
            Integer ps = (Integer)stack.pop(); 
            System.out.println(ps); 
        } 
    } 
  
    // Displaying element on the top of the stack 
    static void stack_top(Stack<Integer> stack) 
    { 
        Integer element = (Integer)stack.peek(); 
        System.out.println("First out element: " + element); 
    } 

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Stack<Integer> stack = new Stack<Integer>(); 
  
	stack_insert(stack); 
	print_stack(stack); 
     stack_insert(stack); 
     stack_top(stack);
		
	}

}
