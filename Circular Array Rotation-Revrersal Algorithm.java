import java.util.*;

class Rotate{
    static void rotate(int arr[], int n, int k)
     {
         reverseArray(arr, 0, n-1);
         reverseArray(arr, 0, k-1);
         reverseArray(arr, k, n-1);
     }

     static void reverseArray(int arr[] , int start, int end)
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

     static void printArray(int arr[], int n, int m[], int q)
     {
        for(int i = 0; i < q; i++)
        {
            System.out.println(arr[m[i]]);
        }
     }

    }

    class Solution {
        public static void main(String[] args)
        {
            Scanner s = new Scanner(System.in);

            int n,k,q;
            n = s.nextInt();
            k = s.nextInt();
            q = s.nextInt();
            
            int arr[] = new int[n];
            for(int i = 0; i < n; i++)
              arr[i] = s.nextInt();

           int m[] = new int[q];
           for(int i = 0; i < q; i++)
              m[i] = s.nextInt();

          Rotate.rotate(arr, n, k);
          Rotate.printArray(arr, n, m, q);
        }
    }
