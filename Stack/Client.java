package Stack;

public class Client {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

		MyStack st = new MyStack();
		
		for(int i=1; i<=5; i++) {
			st.push(i);
			
		}
		
		st.display();
		System.out.println(st.peek());
		st.pop();
		st.display();
	}

}
