package Arrays;

import java.util.*;
public class SortingZerosOnes {

    public static void sort(int arr[]){
        int i = 0;
        int j = arr.length-1 ;

        while(i < j){

            if(arr[i] > arr[j]){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }

            if(arr[i] == 0) i++;
            if(arr[j] == 1) j--;

            
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        //System.out.println(Arrays.toString(arr));
        sort(arr);

        for(int i : arr){
            System.out.print(i +" ");
        }
        

    }
}
