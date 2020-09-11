#include <iostream>
#include <algorithm>

using namespace std;


// Recursive Binary Search

int binarySearch(int arr[], int low,
                 int high, int key)
{
    if (high < low)
        return -1;

    int mid = (low + high) / 2; /*low + (high - low)/2;*/
    if (key == arr[mid])
        return mid;

    if (key > arr[mid])
        return binarySearch(arr, (mid + 1), high, key);

    // else
    return binarySearch(arr, low, (mid - 1), key);
}

// function that rotates the array

  void rotate(int arr[], int n, int k)
     {
         reverseArray(arr, 0, n-1);
         reverseArray(arr, 0, k-1);
         reverseArray(arr, k, n-1);
     }

   void reverseArray(int arr[] , int start, int end)
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
int main()
{

    int n;
    cin >> n;

    int arr[n];

    for (int i = 0; i < n; i++)
    {
        cin >> arr[i];
    }
    sort(arr, arr + n);
    rotate(arr,n,2);  // 2== no of array rotation

    int number;
    cout << "Enter the number to be entered :- ";
    cin >> number;
    int min = INT_MAX;
    int index;
    for (int i = 0; i < n; i++)
    {
        if (arr[i] < min)
        {
            min = arr[i];
            index = i;
        }
    }
    int firstArray = binarySearch(arr, 0, index - 1, number);
    int secondArray = binarySearch(arr, index, n - 1, number);

    if (firstArray == -1 && secondArray == -1)
    {
        cout << "Number not in the array";
    }
    else
    {
        if (firstArray != -1)
        {
            cout << "Number found at position :- " << firstArray + 1 << endl;
        }
        else if (secondArray != -1)
        {
            cout << "Number found at position :- " << secondArray + 1 << endl;
        }
        else
        {
            cout << "Not Found" << endl;
        }
    }

    return 0;
}