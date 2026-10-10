/*
Problem: Remove all duplicated values from an array
Topic: Arrays

Approach:
Move each distinct value to the front of the original array, preserving order.
The returned count gives the length of the unique portion.

Time Complexity: O(n^2)
Space Complexity: O(1)
*/
import java.util.*;
public class RemoveDuplicate{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of an array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Element["+i+"]: ");
            arr[i]=sc.nextInt();
        }
        int size=removeDup(arr);
        System.out.print("Array after removing duplicates: ");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("\nNew size: "+size);
        sc.close();
    }
    static int removeDup(int[] arr){
        int size=0;
        for(int i=0;i<arr.length;i++){
            boolean duplicate=false;
            for(int j=0;j<size;j++){
                if(arr[i]==arr[j]){
                    duplicate=true;
                    break;
                }
            }
            if(!duplicate){
                arr[size++]=arr[i];
            }
        }
        return size;
    }
}