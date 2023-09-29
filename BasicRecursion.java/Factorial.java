public class Main {
   static int factorial(int X) {
      int ans = 1;
      for (int i = 1; i <= X; i++) {
         ans = ans * i;
      }
      return ans;
   }
   public static void main(String[] args) {

      int X = 5;
      int result = factorial(X);
      System.out.println("The factorial of " + X + " is " + result);
   }
}   

// Time Complexity: O(n)

// Space Complexity: O(1)

// Recursive

class Recursion {
    
    static int factorial(int n){
        
            // Base Condition.
            if(n == 0){
                
                return 1;
            }
            
            // Problem broken down into 2 parts and then combined.
            return n * factorial(n-1);
            

    }
    public static void main(String[] args) {

       // Here, let’s take the value of n to be 3.
       int n = 3;
       System.out.println(factorial(n));
    }
}


// Time Complexity: O(N) { Since the function is being called n times, and for each function, we have only one printable line that takes O(1) time, so the cumulative time complexity would be O(N) }

// Space Complexity: O(N) { In the worst case, the recursion stack space would be full with all the function calls waiting to get completed and that would make it an O(N) recursion stack space }.

