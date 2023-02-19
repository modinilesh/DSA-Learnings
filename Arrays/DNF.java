package Arrays;

import java.util.*;
public class DNF {

    public static void dNF(int arr[]){
        int s = 0;
        int e = arr.length-1;
        int mid = 0;

        while( mid <= e){
            
            if( arr[mid] == 0 ) {
                int temp = arr[mid];
                arr[mid] = arr[s];
                arr[s] = temp;
                s++;
                mid++;
            }
            
            else if(arr[mid] == 1) mid++;

            else if( arr[mid] == 2 ) {
                int temp = arr[mid];
                arr[mid] = arr[e];
                arr[e] = temp;
                e--;
            }
            
            
            System.out.println( Arrays.toString(arr) );



        }
    }


    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        dNF(arr);

        // for(int i=0; i<n; i++){
        //     System.out.print( arr[i] + " " );
        // }


    }
}