/*
Problem: Check whether an array is sorted or not
Topic: Arrays

Approach:
Check whether an array is sorted or not.

Time Complexity: O(n)
Space Complexity: O(1)
*/
import java.util.*;
public class CheckArray{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of an array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Element["+i+"]: ");
            arr[i]=sc.nextInt();
        }
        int ans=checkSort(arr);
        if(ans==1){
            System.out.println("Array is sorted");
        }
        else{
            System.out.println("Array is not sorted");
        }
        sc.close();
    }
    static int checkSort(int[] arr){
        int n=arr.length;
        for(int i=1;i<n;i++){
            if(arr[i]<arr[i-1]){
                return 0;
            }
        }
        return 1;
    }
}