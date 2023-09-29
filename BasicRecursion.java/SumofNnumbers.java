import java.util.*;

public class tuf {

  public static void main(String[] args) {

    solve(5);
    solve(6);
  }
  public static void solve(int n) {
    int sum = 0;
    for (int i = 1; i <= n; i++) {
      sum += i;
    }
    System.out.println("The sum of the first " + n + " numbers is: " + sum);
  }
}

// Time Complexity: O(N)

// Space Complexity: O(1)


import java.util.*;

public class tuf {

  public static void main(String[] args) {

    solve(5);
    solve(6);
  }
  public static void solve(int N) {
    int sum = N * (N + 1) / 2;
    System.out.println("The sum of the first " + N + " numbers is: " + sum);
  }
}

// Time Complexity: O(1)

// Space Complexity: O(1)

// Parameterized way

class Recursion {
    
    static void func(int i, int sum){
        
            // Base Condition.
            if(i<1){
                
                System.out.println(sum);
                return;
            }
            
            // Function call to increment sum by i till i decrements to 1.
            func(i-1,sum+i);
            

    }
    public static void main(String[] args) {

       // Here, let’s take the value of n to be 3.
       int n = 3;
       func(n,0);
    }
}

// Time Complexity: O(N) { Since the function is being called n times, and for each function, we have only one printable line that takes O(1) time, so the cumulative time complexity would be O(N) }

// Space Complexity: O(N) { In the worst case, the recursion stack space would be full with all the function calls waiting to get completed and that would make it an O(N) recursion stack space }.

// Functional way

class Recursion {
    
    static int func(int n){
        
            // Base Condition.
            if(n == 0){
                
                return 0;
            }
            
            // Problem broken down into 2 parts and then combined.
            return n + func(n-1);
            

    }
    public static void main(String[] args) {

       // Here, let’s take the value of n to be 3.
       int n = 3;
       System.out.println(func(n));
    }
}

// Time Complexity: O(N) { Since the function is being called n times, and for each function, we have only one printable line that takes O(1) time, so the cumulative time complexity would be O(N) }

// Space Complexity: O(N) { In the worst case, the recursion stack space would be full with all the function calls waiting to get completed and that would make it an O(N) recursion stack space }.
