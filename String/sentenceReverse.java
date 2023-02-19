package String;

public class sentenceReverse {
	
	public static void reverseS(String s) {
		int sp = s.lastIndexOf(" ");
		String str = "";
		int end = s.length();
		
		while(sp != -1) {
			 str = str + " " + s.substring(sp + 1, end);
			 end = sp;
			 sp = (s.substring(0,end)).lastIndexOf(" ");
			 //if (sp == -1) break;
			 //System.out.println(str);
		}
		str = str + " " + s.substring(0, s.indexOf(" "));
		System.out.print(str);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = "my name is nilesh modi";
		reverseS(str1);
		
	}

}
