package Arrays;


import java.util.*;
public class MaximumSumPath {



     //Maximum path
    public static int maxPath(int arr[], int brr[]){

        int i = 0;
        int j = 0;
        int sum1 = 0;
        int sum2 = 0;
        int ans = 0;

        while(i < arr.length && j < brr.length){
        	
        	//System.out.println(sum1 +" "+ sum2);
            
            if(arr[i] == brr[j]){
                ans += Math.max(sum1, sum2);
                ans += arr[i];
                i++;
                j++;

                sum1 = 0;
                sum2 = 0;
            }else if(arr[i] > brr[j]){
                sum2 += brr[j];
                j++;
            }else{
                sum1 += arr[i];
                i++;
            }
        
        }
        
        while (i < arr.length){
            sum1 += arr[i];
            i++;
        }
        while (j < brr.length){
            sum2 += brr[j];
            j++;
        }

        ans += Math.max(sum1, sum2);
        
        return ans;
    }


    
    public static void main(String args[]) {
    	
        int arr[] = {2, 3, 7, 10, 12};
        int brr[] = {1, 5, 7, 8};
        
        int sum1 = maxPath(arr, brr);
        System.out.println(sum1);
        

    }
}
