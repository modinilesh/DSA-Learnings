package ExceptionHandling;

public class Student {
	
	
	//Data members
		private String name;
		private int age;
		
		
		//CONSTRUCTORS
		Student(){
//			name = "Nilesh";
//			age = 22;
			this("xyz", 22);
		}
		
		Student(String name, int age){
//			this();
			setName(name);
			
			try {
				setAge(age);
				//YES WE CAN USE Try BLOCK INSIDE CATCH BLOCK
//				try {
//					int a = 2/0;
//				}
//				catch(ArithmeticException ae) {
//					System.out.println(ae.getMessage());
//				}
			}
			catch(Exception e){
				e.printStackTrace();
				
				//YES WE CAN USE TRY ANS CATCH BLOCK INSIDE CATCH BLOCK
//				try {
//					int a = 2/0;
//				}
//				catch(ArithmeticException ae) {
//					System.out.println(ae.getMessage());
//				}
			}
		}
		
		
		
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getAge() {
			return age;
		}

		//Way 1 to handle Exceptions
		public void setAge(int age) throws Exception {
			if(age >0 && age <=100)
				this.age = age;
			else
				throw new Exception("Wrong age Entered");
		}
		
		//Way 2 to handle Exceptions
//		public void setAge(int age){
//			try {
//				if(age >0 && age <=100)
//					this.age = age;
//				else
//					throw new Exception("Wrong age Entered");
//			}
//			catch(Exception e) {
//				//System.out.println(e);
//				//System.out.println(e.getMessage());
//				e.printStackTrace();
//			}
//			
//			System.out.println("After Age");
//		}

		//Introduce
		void introduce() {
			System.out.println(this.name +" " + this.age);
		}

}
