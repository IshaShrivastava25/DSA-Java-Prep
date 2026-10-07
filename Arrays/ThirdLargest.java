/*
Problem: Find Third Largest Element
Topic: Arrays

Approach:
Find the third largest element without sorting the array.

Time Complexity: O(n)
Space Complexity: O(1)
*/
import java.util.*;
public class ThirdLargest{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of an array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Element["+i+"]: ");
            arr[i]=sc.nextInt();
        }
        int ans=thirdLargest(arr);
        System.out.println("Third largest element: " + ans);
        sc.close();
    }
    static int thirdLargest(int[] arr){
        int largest=Integer.MIN_VALUE;
        int sec_lar=Integer.MIN_VALUE;
        int third_lar=Integer.MIN_VALUE;
        //logic for third largest
        for(int num:arr){
            if(num>largest){
                third_lar=sec_lar;
                sec_lar=largest;
                largest=num;
            }
            else if(num<largest && num>sec_lar){
                third_lar=sec_lar;
                sec_lar=num;
            }
            else if(num<sec_lar && num>third_lar){
                third_lar=num;
            }
        }
        return third_lar;
    }
}