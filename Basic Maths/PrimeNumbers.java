
class Solution {

  public static boolean isPrime(int N) {

    for (int i = 2; i < N; i++) {
      if (N % i == 0) {
        return false;
      }
    }
    return true;

  }
  public static void main(String args[]) {
    int n = 20;
    boolean ans = (isPrime(n));
    if (n != 1 && ans == true) {
      System.out.println("Prime Number");
    } else {
      System.out.println("Non-Prime Number");
    }
  }
}



def isPrime(n):
    for i in range(2, n):
        if n % i == 0:
            return False
    return True




if __name__ == "__main__":
    n = 11
    ans = isPrime(n)
    if n != 1 and ans == True:
        print("Prime Number")
    else:
        print("Non Prime Number")


//   Time Complexity: O(n)

// Space Complexity: O(1)



  

class Solution {

  public static boolean isPrime(int N) {

    for (int i = 2; i < Math.sqrt(N); i++) {
      if (N % i == 0) {
        return false;
      }
    }
    return true;

  }
  public static void main(String args[]) {
    int n = 20;
    boolean ans = (isPrime(n));
    if (n != 1 && ans == true) {
      System.out.println("Prime Number");
    } else {
      System.out.println("Non Prime Number");
    }
  }
}


from math import sqrt

def isPrime(N):
    for i in range(2, int(sqrt(N))):
        if N % i == 0:
            return False
    return True


if __name__ == "__main__":
    n = 11
    ans = isPrime(n)
    if n != 1 and ans == True:
        print("Prime Number")
    else:
        print("Non Prime Number")


//   Time Complexity: O(√n)

// Space Complexity: O(1)
