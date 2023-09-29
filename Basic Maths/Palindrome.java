public class Main {
   static int reverse(int X) {
      int Y = 0;
      while (X > 0) {
         //Extract the last digit
         int digit = X % 10;
         //Appending last digit
         Y = Y * 10 + digit;
         // Shrinking X by discarding the last digit
         X = X / 10;
      }
      return Y;
   }
   public static void main(String[] args) {

      int X = 121;
      int dummy = X;
      int Y = reverse(X);
      if (dummy == Y) {
         System.out.println("Palindrome Number");
      } 
      else {
         System.out.println("Not Palindrome Number");
      }

   }
} 




def reverse(X):
    Y = 0
    while X > 0:
        # Extract the last digit
        digit = X % 10
        # Appending last digit
        Y = Y * 10 + digit
        # Shrinking X by discarding the last digit
        X = X // 10
    return Y




if __name__ == "__main__":
    X = 121
    dummy = X
    Y = reverse(X)
    if dummy == Y:
        print("Palindrome Number")
    else:
        print("Not Palindrome Number")

// Time Complexity: O(logN) for reversing N digits of input integer.

// Space Complexity: O(1)
