package Queue;

public class Client {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		MyQueue q = new MyQueue();
		
		for(int i = 1; i<5; i++) {
			q.enqueue(i);
		}
		q.display();
		
		System.out.println(q.dequeue());
		q.display();

		q.enqueue(9);
		q.display();
		
		q.enqueue(9);
		q.display();
		
		q.enqueue(9);
		q.display();
	}
	

}
