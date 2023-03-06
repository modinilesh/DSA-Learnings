package OOPs;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s = new Student();
		Student s1 = new Student();
		Student s2 = new Student();
		
//		s.name = "Nilesh";
//		s.age = 22;
		
		s.saysHi();
		
//		s1.name = "Sumit";
//		s2.name = "Ramesh";
		//System.out.println(s1.name + " "+ s2.name);
//		test2(s1, s2);
//		System.out.println(s1.name + " "+ s2.name);
//		test3(s1, s2);
//		System.out.println(s1.name + " "+ s2.name);
//		s.saysHi();
//		s.saysHi("Sumit");
		

	}
	
	public static void test1(Student s1, Student s2) {
		Student temp = s1; //No change will occur permanently 
		s1 = s2;		//As changes will be done locally only
		s2 = temp;
	}
	
//	public static void test2(Student s1, Student s2) {
//		
		//name of s1 & s2 will get swaped
//		String temp = s1.name;
//		s1.name = s2.name;
//		s2.name = temp;
//	}
	
//	public static void test3(Student s1, Student s2) {
//			
//		s1 = new Student(); //new object will be created and s1 will be referring to its location suppose z
//		String temp = s1.name; //so names get interchanged for location y & z
//		s1.name = s2.name;
//		s2.name = temp;
//	}

}
