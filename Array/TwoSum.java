import java.util.*;

public class tUf {
    public static String twoSum(int n, int []arr, int target) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == target) return "YES";
            }
        }
        return "NO";
    }

    public static void main(String args[]) {
        int n = 5;
        int[] arr = {2, 6, 5, 8, 11};
        int target = 14;
        String ans = twoSum(n, arr, target);
        System.out.println("This is the answer for variant 1: " + ans);
    }

}



// Time Complexity: O(N2), where N = size of the array.
// Reason: There are two loops(i.e. nested) each running for approximately N times.

// Space Complexity: O(1) as we are not using any extra space.


import java.util.*;

public class Main {
    public static int[] twoSum(int n, int []arr, int target) {
        int[] ans = new int[2];
        ans[0] = ans[1] = -1;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == target) {
                    ans[0] = i;
                    ans[1] = j;
                    return ans;
                }
            }
        }
        return ans;
    }

    public static void main(String args[]) {
        int n = 5;
        int[] arr = {2, 6, 5, 8, 11};
        int target = 14;
        int[] ans = twoSum(n, arr, target);
        System.out.println("This is the answer for variant 2: [" + ans[0] + ", "
                           + ans[1] + "]");
    }

}


// Time Complexity: O(N2), where N = size of the array.
// Reason: There are two loops(i.e. nested) each running for approximately N times.

// Space Complexity: O(1) as we are not using any extra space.


import java.util.*;

public class tUf {
    public static String twoSum(int n, int []arr, int target) {
        HashMap<Integer, Integer> mpp = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int num = arr[i];
            int moreNeeded = target - num;
            if (mpp.containsKey(moreNeeded)) {
                return "YES";
            }

            mpp.put(arr[i], i);
        }
        return "NO";
    }

    public static void main(String args[]) {
        int n = 5;
        int[] arr = {2, 6, 5, 8, 11};
        int target = 14;
        String ans = twoSum(n, arr, target);
        System.out.println("This is the answer for variant 1: " + ans);
    }

}


// Time Complexity: O(N), where N = size of the array.
// Reason: The loop runs N times in the worst case and searching in a hashmap takes O(1) generally. So the time complexity is O(N).

// Note: In the worst case(which rarely happens), the unordered_map takes O(N) to find an element. In that case, the time complexity will be O(N2). If we use map instead of unordered_map, the time complexity will be O(N* logN) as the map data structure takes logN time to find an element.

// Space Complexity: O(N) as we use the map data structure.

// Note: We have optimized this problem enough. But if in the interview, we are not allowed to use the map data structure, then we should move on to the following approach i.e. two pointer approach. This approach will have the same time complexity as the better approach.



import java.util.*;

public class tUf {
    public static int[] twoSum(int n, int []arr, int target) {
        int[] ans = new int[2];
        ans[0] = ans[1] = -1;
        HashMap<Integer, Integer> mpp = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int num = arr[i];
            int moreNeeded = target - num;
            if (mpp.containsKey(moreNeeded)) {
                ans[0] = mpp.get(moreNeeded);
                ans[1] = i;
                return ans;
            }

            mpp.put(arr[i], i);
        }
        return ans;
    }

    public static void main(String args[]) {
        int n = 5;
        int[] arr = {2, 6, 5, 8, 11};
        int target = 14;
        int[] ans = twoSum(n, arr, target);
        System.out.println("This is the answer for variant 2: [" + ans[0] + ", "
                           + ans[1] + "]");

    }

}



// Time Complexity: O(N), where N = size of the array.
// Reason: The loop runs N times in the worst case and searching in a hashmap takes O(1) generally. So the time complexity is O(N).

// Note: In the worst case(which rarely happens), the unordered_map takes O(N) to find an element. In that case, the time complexity will be O(N2). If we use map instead of unordered_map, the time complexity will be O(N* logN) as the map data structure takes logN time to find an element.

// Space Complexity: O(N) as we use the map data structure.

// Note: We have optimized this problem enough. But if in the interview, we are not allowed to use the map data structure, then we should move on to the following approach i.e. two pointer approach. This approach will have the same time complexity as the better approach.



  
import java.util.*;

public class Main {
    public static String twoSum(int n, int []arr, int target) {
        Arrays.sort(arr);
        int left = 0, right = n - 1;
        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target) {
                return "YES";
            } else if (sum < target) left++;
            else right--;
        }
        return "NO";
    }

    public static void main(String args[]) {
        int n = 5;
        int[] arr = {2, 6, 5, 8, 11};
        int target = 14;
        String ans = twoSum(n, arr, target);
        System.out.println("This is the answer for variant 1: " + ans);

    }

} 


// Time Complexity: O(N) + O(N*logN), where N = size of the array.
// Reason: The loop will run at most N times. And sorting the array will take N*logN time complexity.

// Space Complexity: O(1) as we are not using any extra space.

// Note: Here we are distorting the given array. So, if we need to consider this change, the space complexity will be O(N).
