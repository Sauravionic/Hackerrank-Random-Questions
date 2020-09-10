import java.util.*;

class RotateArray {
    void leftRotate(int arr[], int d, int n)
     {
         for(int j = 0; j < d; j++)
          leftRotatebyOne(arr,n);
     }
     void leftRotatebyOne(int arr[], int n)
     {
         int i,temp;
         temp = arr[0];
         for(i = 0; i < n-1; i++)
           arr[i] = arr[i+1];
        arr[i] = temp;
     }
   void printArray(int arr[], int n) {
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
       RotateArray rot = new RotateArray();

       rot.leftRotate(arr,d,n);
       rot.printArray(arr,n);

   }

}
