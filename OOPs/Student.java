package OOPs;

public class Student {

	//Data members
	private String name;
	private int age;
	
	
	//CONSTRUCTORS
	Student(){
//		name = "Nilesh";
//		age = 22;
		this("xyz", 22);
	}
	
	Student(String name, int age){
//		this();
		this.name = name;
		this.age = age;
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

	public void setAge(int age) {
		if(age >0 && age <=100)
			this.age = age;
		else
			this.age = 0;
	}

	//Introduce
	void introduce() {
		System.out.println(this.name +" " + this.age);
	}
	
	
	//Data Functions
	void saysHi() {
		System.out.println(name + " with age " + age + " says Hi");
	}
	
	//FUNCTION OVERLOADING
	void saysHi(String name) {
		System.out.println(this.name + " with age " + this.age + " says Hi to "+ name );
	}
	
}
