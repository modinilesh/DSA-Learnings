package Queue;

public class MyQueue {
	
	//Data Members
		private int arr[];
		private int size;
		private int front;
		
		MyQueue(int n){
			this.arr = new int[n];
			this.size = 0;
			this.front = 0;
		}
		
		MyQueue(){
			this(5);
		}
		
		//IsEmpty
		public boolean isEmpty() {
			return this.size == 0;
		}
		
		//IsFull
		public boolean isFull() {
			return this.size == this.arr.length;
		}
		
		//enqueue
		public void enqueue(int ele) throws Exception{
			if(this.isFull()) {
				throw new Exception ("Queue Overflow");
			}
			else {
				this.arr[(this.size + this.front) % this.arr.length] = ele;
				this.size++;
			}
		}
		
		
		//dequeue
		public int dequeue() throws Exception{
			if(this.isEmpty()) {
				throw new Exception ("Queue Underflow");
			}
			else {
				int x = this.arr[this.front];
				this.front = (this.front+1) % this.arr.length;
				size--;
				return x;
			}
		}
		
		
		//peek
		public int peek() throws Exception{
			if(this.isEmpty()) {
				throw new Exception ("Queue Underflow");
			}
			else {
				int x = this.arr[this.front];
				return x;
			}
		}
		
		//size
		public int size() {
			return this.size;
		}
		
		
		//display
		public void display() {
			for(int i = this.front; i < this.front + this.size; i++) {
				System.out.print(this.arr[i%this.arr.length] + " ");
			}
			System.out.println();
		}
		


}
