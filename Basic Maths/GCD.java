
public class Main {
  public static void main(String args[]) {
    int num1 = 3, num2 = 6;
    int ans = 1;
    for (int i = 1; i <= Math.min(num1, num2); i++) {
      if (num1 % i == 0 && num2 % i == 0) {
        ans = i;
      }
    }
    System.out.print("The GCD of the two number is "+ans);
  }
}


if __name__ == '__main__':
    num1 = 4
    num2 = 8
    ans = 1
    for i in range(1, min(num1, num2) + 1):
        if num1 % i == 0 and num2 % i == 0:
            ans = i
    print("The GCD of the two numbers is", ans)


// Time Complexity: O(N).

// Space Complexity: O(1).


  

public class Main {
  static int gcd(int a, int b) {
    if (b == 0) {
      return a;
    }
    return gcd(b, a % b);
  }
  public static void main(String args[]) {
    int a = 4, b = 8;
    int ans = gcd(a, b);
    System.out.print("The GCD of the two numbers is "+ans);
  }
}


def gcd(a, b):
    if b == 0:
        return a
    return gcd(b, a % b)


if __name__ == "__main__":
    a = 4
    b = 8
    print("The GCD of the two numbers is", gcd(a, b))


//   Time Complexity: O(logɸmin(a,b)), where ɸ is 1.61.

// Space Complexity: O(1).
