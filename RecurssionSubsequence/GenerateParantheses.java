package RecurssionSubsequence;

public class GenerateParantheses {
	
	public static void generateParantheses(int op, int cl, String ans) {
		if(op < 0 || op > cl) return;
		else if(op == 0 && cl == 0) {
			System.out.println(ans);
		}
		else {
			generateParantheses(op-1, cl, ans + "(");
			generateParantheses(op, cl-1, ans + ")");
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		generateParantheses(5,5,"");
	}

}
