
import java.util.*;

public class tUf {
    public static int count(int arr[], int n, int x) {
        int cnt = 0;
        for (int i = 0; i < n; i++) {

            // counting the occurrences:
            if (arr[i] == x) cnt++;
        }
        return cnt;
    }

    public static void main(String[] args) {
        int[] arr =  {2, 4, 6, 8, 8, 8, 11, 13};
        int n = 8, x = 8;
        int ans = count(arr, n, x);
        System.out.println("The number of occurrences is: " + ans);
    }
}



def count(arr: [int], n: int, x: int) -> int:
    cnt = 0
    for i in range(n):
        if arr[i] == x:
            cnt += 1
    return cnt

if __name__ == "__main__":
    arr = [2, 4, 6, 8, 8, 8, 11, 13]
    n = 8
    x = 8
    ans = count(arr, n, x)
    print("The number of occurrences is:", ans)


  Time Complexity: O(N), N = size of the given array
Reason: We are traversing the whole array.

Space Complexity: O(1) as we are not using any extra space.



  
import java.util.*;

public class tUf {

    public static int firstOccurrence(int[] arr, int n, int k) {
        int low = 0, high = n - 1;
        int first = -1;

        while (low <= high) {
            int mid = (low + high) / 2;
            // maybe an answer
            if (arr[mid] == k) {
                first = mid;
                // look for smaller index on the left
                high = mid - 1;
            } else if (arr[mid] < k) {
                low = mid + 1; // look on the right
            } else {
                high = mid - 1; // look on the left
            }
        }
        return first;
    }

    public static int lastOccurrence(int[] arr, int n, int k) {
        int low = 0, high = n - 1;
        int last = -1;

        while (low <= high) {
            int mid = (low + high) / 2;
            // maybe an answer
            if (arr[mid] == k) {
                last = mid;
                // look for larger index on the right
                low = mid + 1;
            } else if (arr[mid] < k) {
                low = mid + 1; // look on the right
            } else {
                high = mid - 1; // look on the left
            }
        }
        return last;
    }

    public static int[] firstAndLastPosition(int[] arr, int n, int k) {
        int first = firstOccurrence(arr, n, k);
        if (first == -1) return new int[] { -1, -1};
        int last = lastOccurrence(arr, n, k);
        return new int[] {first, last};
    }

    public static int count(int arr[], int n, int x) {
        int[] ans = firstAndLastPosition(arr, n, x);
        if (ans[0] == -1) return 0;
        return (ans[1] - ans[0] + 1);
    }

    public static void main(String[] args) {
        int[] arr =  {2, 4, 6, 8, 8, 8, 11, 13};
        int n = 8, x = 8;
        int ans = count(arr, n, x);
        System.out.println("The number of occurrences is: " + ans);
    }
}



def firstOccurrence(arr, n, k):
    low = 0
    high = n - 1
    first = -1

    while low <= high:
        mid = (low + high) // 2
        # maybe an answer
        if arr[mid] == k:
            first = mid
            # look for smaller index on the left
            high = mid - 1
        elif arr[mid] < k:
            low = mid + 1  # look on the right
        else:
            high = mid - 1  # look on the left

    return first


def lastOccurrence(arr, n, k):
    low = 0
    high = n - 1
    last = -1

    while low <= high:
        mid = (low + high) // 2
        # maybe an answer
        if arr[mid] == k:
            last = mid
            # look for larger index on the right
            low = mid + 1
        elif arr[mid] < k:
            low = mid + 1  # look on the right
        else:
            high = mid - 1  # look on the left

    return last


def firstAndLastPosition(arr, n, k):
    first = firstOccurrence(arr, n, k)
    if first == -1:
        return (-1, -1)
    last = lastOccurrence(arr, n, k)
    return (first, last)

def count(arr: [int], n: int, x: int) -> int:
    first, last = firstAndLastPosition(arr, n, x)
    if first == -1:
        return 0
    return last - first + 1

if __name__ == "__main__":
    arr = [2, 4, 6, 8, 8, 8, 11, 13]
    n = 8
    x = 8
    ans = count(arr, n, x)
    print("The number of occurrences is:", ans)



  Time Complexity: O(2*logN), where N = size of the given array.
Reason: We are basically using the binary search algorithm twice.

Space Complexity: O(1) as we are using no extra space.
