package ds.section2.stack;

public class Stack {
	private int maxSize; //size of stack
	private char[] stackArray; //container that stores list of items of type char
	private int top; //represents index position of last item placed on top of stack
	
	public Stack(int size){
		this.maxSize = size;
		stackArray = new char[maxSize];
		top=-1; //
	}
	
	public void push(char c){
		if(isFull()){
			System.out.println("This stack is already full");
		}else{
			top++;
			stackArray[top]=c;
		}
	}
	
	public char pop(){ //We are not removing the elements from array. we are just moving the pointers to point to different index values
		//In reality the cells in array are being overwritten with new data
		
		if(isEmpty()){
			System.out.println("There is no more data");
			return '0';
		}else{
			int old_top=top; 
			top--;
			return stackArray[old_top];
		}
		
	}
	
	public char peak(){
		return stackArray[top];
	}
	
	public boolean isEmpty(){
		return (top == -1);
	}
	
	public boolean isFull(){
		return (maxSize-1 == top);
	}
	
	
	

}
