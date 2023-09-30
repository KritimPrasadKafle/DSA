class TUF {
  static boolean isSorted(int arr[], int n) {
    for (int i = 0; i < n; i++) {
      for (int j = i + 1; j < n; j++) {
        if (arr[j] < arr[i])
          return false;
      }
    }

    return true;
  }

  public static void main(String args[]) {
    int arr[] = {1, 2, 3, 4, 5}, n = 5;

    System.out.println(isSorted(arr, n));
  }
}



def isSorted(arr, n):
    for i in range(n):
        for j in range(i + 1, n):
            if arr[j] < arr[i]:
                return False

    return True

if __name__ == "__main__":
    arr = [1, 2, 3, 4, 5]
    n = len(arr)
    ans = isSorted(arr, n)
    if ans:
        print("True")
    else:
        print("False")



//   Time Complexity: O(N^2)

// Space Complexity: O(1)



  
class TUF {
  static boolean isSorted(int arr[], int n) {
    for (int i = 1; i < n; i++) {
      if (arr[i] < arr[i - 1])
        return false;
    }

    return true;
  }

  public static void main(String args[]) {
    int arr[] = {1, 2, 3, 4, 5}, n = 5;

    System.out.println(isSorted(arr, n));
  }
}




def isSorted(arr, n):
    for i in range(1, n):
        if arr[i] < arr[i - 1]:
            return False
    return True

if __name__ == "__main__":
    arr = [1, 2, 3, 4, 5]
    n = 5
    print("True" if isSorted(arr, n) else "False")


// Time Complexity: O(N)

// Space Complexity: O(1)
