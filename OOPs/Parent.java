package OOPs;

public class Parent {
	
	int d;
	
	Parent(){
		this.d = 10;
	}
	
	Parent(int n){
		//super(); 		this will be reffering to default constructor of Object Class
		this.d = n;
	}
	
	void saysHi() {
		System.out.println("Parent says Hi !");
	}
	
	@Override
	public String toString() {
        return "In Parent's toString";
    }

}
