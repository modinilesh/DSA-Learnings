package OOPs;

public class Inheritance{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Child c = new Child();
//		
//		System.out.println(c.d);
//		
//		c.saysHi();
//		
//		System.out.println(c.d);
//		
		
//		Parent p = new Child();
//		System.out.println(p.d);  //variable ambiguity will be resolved through reference (Parent vala)
//		p.saysHi(); // Function ambiguity will be resolved through Object (Child vala)
//		
//		//After type cast
//		System.out.println( ((Child)p).d );
//		p.saysHi(); //ye to object vala hi krega
//		

		
		Parent p = new Parent();
		System.out.println(p);
		System.out.println(p.d); //It will return p ka d .....kyuki humne toString function override kra h 
									//Integer vala nahi kara
		
		
	}

}
