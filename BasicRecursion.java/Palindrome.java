import java.io.*;
import java.util.Arrays;
class Test {
  static private boolean isPalindrome(String s) {
    int left = 0, right = s.length()-1;
        while(left<right)
        {
            char l = s.charAt(left), r = s.charAt(right);
            if(!Character.isLetterOrDigit(l)) 
                left++;
            else if(!Character.isLetterOrDigit(r)) 
                right--;
            else if(Character.toLowerCase(l)!=Character.toLowerCase(r)) 
                return false;
            else {
                left++; 
                right--;
            }
        }
        return true;
  }
  public static void main(String[] args) {
    String str = "ABCDCBA";
    boolean ans = isPalindrome(str);

    if (ans == true) {
      System.out.println("Palindrome");
    } else {
      System.out.println("Not Palindrome");
    }
  }
}




def isPalindrome(s):
    left = 0
    right = len(s)-1
    while left < right:
        if not s[left].isalnum():
            left += 1
        elif not s[right].isalnum():
            right -= 1
        elif s[left].lower() != s[right].lower():
            return False
        else:
            left += 1
            right -= 1
    return True



if __name__ == "__main__":
    str = "ABCDCBA"
    ans = isPalindrome(str)


    if ans == True:
        print("Palindrome")
    else:
        print("Not Palindrome")

// Time Complexity:  O(N)

// Space Complexity: O(1)



  class Recursion {
    
    static boolean palindrome(int i, String s){
        
            // Base Condition
            // If i exceeds half of the string, means all the elements 
            // are compared, we return true.
            if(i>=s.length()/2) return true;
            
            // If start is not equal to end, not palindrome.
            if(s.charAt(i)!=s.charAt(s.length()-i-1)) return false;
            
            // If both characters are same, increment i and check start+1 and end-1.
            return palindrome(i+1,s);
            

    }
    public static void main(String[] args) {

       // Example string.
       String s = "madam";
       System.out.println(palindrome(0,s));
    }
}


// Time Complexity: O(N) { Precisely, O(N/2) as we compare the elements N/2 times and swap them}.

// Space Complexity: O(1) { The elements of the given array are swapped in place so no extra space is required}.





