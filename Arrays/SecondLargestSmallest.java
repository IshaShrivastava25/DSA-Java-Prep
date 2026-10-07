/*
Problem: Find Second Largest and Second Smallest Element
Topic: Arrays

Approach:
Find the second largest and second smallest elements
without sorting the array.

Time Complexity: O(n)
Space Complexity: O(1)
*/
import java.util.*;
public class SecondLargestSmallest{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of an array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Element["+i+"]: ");
            arr[i]=sc.nextInt();
        }
        int[] ans=second(arr);
        System.out.println(Arrays.toString(ans));
        sc.close();
    }
    static int[] second(int[] arr){
        int largest=Integer.MIN_VALUE;
        int sec_lar=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;
        int sec_small=Integer.MAX_VALUE;
        //logic for largest and second largest
        for(int nums:arr){
            if(nums>largest){
                sec_lar=largest;
                largest=nums;
            }
            else if(nums<largest && nums>sec_lar){
                sec_lar=nums;
            }

            //logic for smallest and second smallest
            if(nums<smallest){
                sec_small=smallest;
                smallest=nums;
            }
            else if(nums>smallest && nums<sec_small){
                sec_small=nums;
            }
        }
         return new int[]{
            smallest,
            sec_small,
            largest,
            sec_lar
        };
    }
}