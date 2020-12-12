package classAssignments;

import java.util.*;

public class Stack211 <T> {
	public int stackTop;
	public ArrayList <T> myStack = new ArrayList <T>();
	
	Stack211(){
		stackTop= -1;
	}
	
	public void push (T c){
		stackTop++;
		myStack.add(c);
		
	}
	
	public T read () {
		T c = myStack.get(stackTop);
		return c;
	}
	
	public T pop() {
		T c = myStack.remove(stackTop);
		stackTop--;
		return c;
	}
	
	public boolean isEmpty() {
		if (stackTop<0) {
			return true;
		}else {
			return false;
		}
	}
	
	public T topOfStack() {
		T c = myStack.get(stackTop);
		return c;
	}
}
