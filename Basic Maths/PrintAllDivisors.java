import java.util.*;

public class Solution{
		
	public static void main(String[] args){
		
		printDivisorsBruteForce(36);
		
	}

	static void printDivisorsBruteForce(int n){
		System.out.println("The Divisors of "+n+" are:");
		for(int i = 1; i <= n; i++)
			if(n % i == 0)
				System.out.print(i + " ");
			
		System.out.println();
	}
	
}



def printDivisorsBruteForce(n):
    print("The Divisors of ",n," are:")
    for i in range(1,n+1):
        if n % i == 0:
            print(i,end=" ")
    print()
if __name__ == "__main__":
    printDivisorsBruteForce(36)


// Time Complexity: O(n), because the loop has to run from 1 to n always.

// Space Complexity: O(1), we are not using any extra space.



  

import java.util.*;

public class Solution{
		
	public static void main(String[] args){
		
		printDivisorsOptimal(36);
		
	}

	public static void printDivisorsOptimal(int n){
		
		System.out.println("The divisors of "+n+" are:");
		for(int i = 1; i <= (int)Math.sqrt(n); i++)
			if(n % i == 0){
				System.out.print(i + " ");
				if(i != n/i) System.out.print(n/i + " ");
			}
			
		System.out.println();
	}
	
}


def printDivisorsOptimal(n):
    print("The Divisors of",n,"are:")
    for i in range(1, int(n**0.5)+1):
        if n % i == 0:
            print(i, end=" ")
            if i != n/i:
                print(int(n/i), end=" ")
    print()
if __name__ == "__main__":
    printDivisorsOptimal(36)


//   Time Complexity: O(sqrt(n)), because every time the loop runs only sqrt(n) times.

// Space Complexity: O(1), we are not using any extra space.
