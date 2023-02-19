package TwoDimensional_Array;

public class SpiralPrint {
	 public static void main(String[] args) {
	  int arr[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
	  
	  int count = 0;
	  int minr = 0, maxr = 3, minc = 0, maxc = 3;
	  
	  while(count < 16){
	   
	   //1
	   for(int i=minc; i<=maxc; i++){
	    System.out.print(arr[minr][i] + " ");
	    count ++;
	   }
	   minr++;
	   
	   
	   
	    //2
	   for(int i=minr; i<=maxr; i++){
	    System.out.print(arr[i][maxc] + " ");
	    count ++;
	   }
	   maxc--;
	   
	    //3
	   for(int i=maxc; i>=minc; i--){
	    System.out.print(arr[maxr][i] + " ");
	    count ++;
	   }
	   maxr--;
	   
	   
	    //4
	   for(int i=maxr; i>=minr; i--){
	    System.out.print(arr[i][minc] + " ");
	    count ++;
	   }
	   minc++;
	   
	   
	  }
	 }
	}