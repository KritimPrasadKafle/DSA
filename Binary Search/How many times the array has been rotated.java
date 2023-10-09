import java.util.*;

public class tUf {
    public static int findKRotation(int[] arr) {
        int n = arr.length; //size of array.
        int ans = Integer.MAX_VALUE, index = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] < ans) {
                ans = arr[i];
                index = i;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2, 3};
        int ans = findKRotation(arr);
        System.out.println("The array is rotated " + ans + " times.");
    }
}




import sys
def findKRotation(arr : [int]) -> int:
    n = len(arr)  # Size of array
    ans = float('inf')
    index = -1
    for i in range(n):
        if arr[i] < ans:
            ans = arr[i]
            index = i
    return index

if __name__ == "__main__":
    arr = [4, 5, 6, 7, 0, 1, 2, 3]
    ans = findKRotation(arr)
    print("The array is rotated", ans, "times.")


Time Complexity: O(N), N = size of the given array.
Reason: We have to iterate through the entire array to check if the target is present in the array.

Space Complexity: O(1)
Reason: We have not used any extra data structures, this makes space complexity, even in the worst case as O(1).



  


import java.util.*;

public class tUf {
    public static int findKRotation(int[] arr) {
        int low = 0, high = arr.length - 1;
        int ans = Integer.MAX_VALUE;
        int index = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            //search space is already sorted
            //then arr[low] will always be
            //the minimum in that search space:
            if (arr[low] <= arr[high]) {
                if (arr[low] < ans) {
                    index = low;
                    ans = arr[low];
                }
                break;
            }

            //if left part is sorted:
            if (arr[low] <= arr[mid]) {
                // keep the minimum:
                if (arr[low] < ans) {
                    index = low;
                    ans = arr[low];
                }

                // Eliminate left half:
                low = mid + 1;
            } else { //if right part is sorted:

                // keep the minimum:
                if (arr[mid] < ans) {
                    index = mid;
                    ans = arr[mid];
                }

                // Eliminate right half:
                high = mid - 1;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2, 3};
        int ans = findKRotation(arr);
        System.out.println("The array is rotated " + ans + " times.");
    }
}






import sys
def findKRotation(arr : [int]) -> int:
    low = 0
    high = len(arr) - 1
    ans = float('inf')
    index = -1
    while low <= high:
        mid = (low + high) // 2

        # If search space is already sorted,
        # then arr[low] will always be
        # the minimum in that search space
        if arr[low] <= arr[high]:
            if arr[low] < ans:
                index = low
                ans = arr[low]
            break

        # If left part is sorted
        if arr[low] <= arr[mid]:
            # Keep the minimum
            if arr[low] < ans:
                index = low
                ans = arr[low]

            # Eliminate left half
            low = mid + 1
        else:  # If right part is sorted
            # Keep the minimum
            if arr[mid] < ans:
                index = mid
                ans = arr[mid]

            # Eliminate right half
            high = mid - 1

    return index

if __name__ == "__main__":
    arr = [4, 5, 6, 7, 0, 1, 2, 3]
    ans = findKRotation(arr)
    print("The array is rotated", ans, "times.")



  Time Complexity: O(logN), N = size of the given array.
Reason: We are basically using binary search to find the minimum.

Space Complexity: O(1)
Reason: We have not used any extra data structures, this makes space complexity, even in the worst case as O(1).

