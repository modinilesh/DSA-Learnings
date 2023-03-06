package Stack;

public class MyStack {
	
	//Data Members
	private int arr[];
	private int top;
	
	MyStack(int n){
		this.arr = new int[n];
		this.top = 0;
	}
	
	MyStack(){
		this(5);
	}
	
	//IsEmpty
	public boolean isEmpty() {
		return this.top == 0;
	}
	
	//IsFull
	public boolean isFull() {
		return this.top == this.arr.length;
	}
	
	//push
	public void push(int ele) throws Exception{
		if(this.isFull()) {
			throw new Exception ("Stack Overflow");
		}
		else {
			this.arr[this.top++] = ele;
		}
	}
	
	
	//pop
	public int pop() throws Exception{
		if(this.isEmpty()) {
			throw new Exception ("Stack Underflow");
		}
		else {
			return this.arr[--this.top];
		}
	}
	
	
	//peek
	public int peek() throws Exception{
		if(this.isEmpty()) {
			throw new Exception ("Stack Underflow");
		}
		else {
			return this.arr[this.top-1];
		}
	}
	
	//size
	public int size() {
		return this.top;
	}
	
	
	//display
	public void display() {
		for(int i = this.top-1; i >= 0; i--) {
			System.out.print(this.arr[i] + " ");
		}
		System.out.println();
	}
	

}
