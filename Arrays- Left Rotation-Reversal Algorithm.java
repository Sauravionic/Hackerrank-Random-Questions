import java.util.*;

class RotateArray {
   
  public static void leftRotate(int arr[], int d, int n)
   {
       if(d == 0)
         return;
       reverse(arr, 0, d-1);
       reverse(arr, d, n-1);
       reverse(arr, 0, n-1);
   }
   static void reverse(int arr[], int start, int end)
   {
       int temp;
       while(start < end)
        {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
   }
   public static void printArray(int arr[], int n) {
         for(int i = 0; i < n; i++)
           System.out.print(arr[i] + " ");
     }
}
 public class Solution {
  public static void main(String[] args)
   {
       Scanner s = new Scanner(System.in);

       int n = s.nextInt();
       int d = s.nextInt();
       int arr[] = new int[n];
       for(int i = 0; i < n; i++)
       {
         arr[i] = s.nextInt();
       }
       
       if(d > n)
         d %= n;
       RotateArray.leftRotate(arr,d,n);
       RotateArray.printArray(arr,n);

   }

}