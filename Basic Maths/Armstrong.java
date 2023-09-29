import java.util.*;
class TUF{
static boolean ArmstrongNumber(int n)
{
    int originalno = n;
    int count = 0;
    int temp = n;
    while (temp != 0)
    {
        count++;
        temp = temp / 10;
    }
    int sumofpower = 0;
    while (n != 0)
    {
        int digit = n % 10;
        sumofpower += Math.pow(digit,count);
        n /= 10;
    }
    return (sumofpower == originalno);
}
public static void main(String args[])
{
    int n1 = 153;
    if (ArmstrongNumber(n1))
    {
        System.out.println("Yes, it is an Armstrong Number\n");
    }
    else
    {
        System.out.println("No, it is not an Armstrong Number\n");
    }
    
}
}


def ArmstrongNumber(n):
    originalno = n
    count = 0
    temp = n
    while temp != 0:
        count += 1
        temp //= 10
    sumofpower = 0
    while n != 0:
        digit = n % 10
        sumofpower += pow(digit, count)
        n //= 10
    return sumofpower == originalno




if __name__ == "__main__":
    n1 = 153
    if ArmstrongNumber(n1):
        print("Yes, it is an Armstrong Number")
    else:
        print("No, it is not an Armstrong Number")


// Time Complexity: O(n) where n is the number of digits since we need to traverse every digit and add digits raised to power no. of digits to sum.

// Space Complexity: O(1) since no extra space is required
