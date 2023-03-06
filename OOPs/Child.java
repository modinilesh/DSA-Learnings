package OOPs;

public class Child extends Parent {
	
	int d1 = 20;
	int d = 100;
	
	Child(){
		this(50);
	}
	
	Child(int n){
		super(n);		//It will call parameterized constructor of Parent class
	}
	
	
	void saysHi() {
		System.out.println("Child says Hi !");
//		System.out.println("Parents d = " +super.d);
	}
	
	

}
