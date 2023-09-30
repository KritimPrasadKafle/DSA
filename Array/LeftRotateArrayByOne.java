
import java.util.*;

class TUF{
static void solve(int arr[], int n) {
  int temp[]=new int[n];
  for (int i = 1; i < n; i++) {
    temp[i - 1] = arr[i];
  }
  temp[n - 1] = arr[0];
  for (int i = 0; i < n; i++) {
    System.out.print(temp[i]+" ");
  }
  
}
public static void main(String args[]) {
  int n=5;
  
  int arr[]= {1,2,3,4,5};
  solve(arr, n);
}
}




def solve(arr, n):
    temp = [0] * n
    for i in range(1, n):
        temp[i - 1] = arr[i]
    temp[n - 1] = arr[0]
    for i in range(n):
        print(temp[i], end=" ")
    print()

n = 5
arr = [1, 2, 3, 4, 5]
solve(arr, n)



//   Time Complexity: O(n), as we iterate through the array only once.

// Space Complexity: O(n) as we are using another array of size, same as the given array.



  
import java.util.*;

class TUF{
static void solve(int arr[], int n) {
  int temp = arr[0]; // storing the first element of array in a variable
  for (int i = 0; i < n - 1; i++) {
    arr[i] = arr[i + 1];
  }
  arr[n - 1] = temp; // assigned the value of variable at the last index
  for (int i = 0; i < n; i++) {
    System.out.print(arr[i]+" ");
  }

  
}
public static void main(String args[]) {
  int n=5;
  
  int arr[]= {1,2,3,4,5};
  solve(arr, n);
}
}




def solve(arr, n):
    temp = arr[0]  # storing the first element of the array in a variable
    for i in range(n - 1):
        arr[i] = arr[i + 1]
    arr[n - 1] = temp  # assign the value of the variable at the last index
    for i in range(n):
        print(arr[i], end=" ")

n = 5
arr = [1, 2, 3, 4, 5]
solve(arr, n)



//   Time Complexity: O(n), as we iterate through the array only once.

// Space Complexity: O(1) as no extra space is used
