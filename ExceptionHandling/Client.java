package ExceptionHandling;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s = new Student();
		
//		s.introduce();
//		
//		s.setName("Nilesh");
		//s.setAge(22);
		
		s.introduce();
//		
//		s.setAge(-22);
		
		Student s2 = new Student("Sumit", -22);
		s2.introduce();

	}

}
