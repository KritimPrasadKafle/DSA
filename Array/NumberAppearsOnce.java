


import java.util.*;

public class tUf {
    public static int getSingleElement(int []arr) {
        // Size of the array:
        int n = arr.length;

        //Run a loop for selecting elements:
        for (int i = 0; i < n; i++) {
            int num = arr[i]; // selected element
            int cnt = 0;

            //find the occurrence using linear search:
            for (int j = 0; j < n; j++) {
                if (arr[j] == num)
                    cnt++;
            }

            // if the occurrence is 1 return ans:
            if (cnt == 1) return num;
        }

        //This line will never execute
        //if the array contains a single element.
        return -1;
    }

    public static void main(String args[]) {
        int[] arr = {4, 1, 2, 1, 2};
        int ans = getSingleElement(arr);
        System.out.println("The single element is: " + ans);

    }
}





def getSingleElement(arr):
    # Size of the array:
    n = len(arr)

    # Run a loop for selecting elements:
    for i in range(n):
        num = arr[i]  # selected element
        cnt = 0

        # Find the occurrence using linear search:
        for j in range(n):
            if arr[j] == num:
                cnt += 1

        # If the occurrence is 1, return the number:
        if cnt == 1:
            return num

    # This line will never execute
    # if the array contains a single element.
    return -1


def main():
    arr = [4, 1, 2, 1, 2]
    ans = getSingleElement(arr)
    print("The single element is:", ans)


if __name__ == '__main__':
    main()



//   Time Complexity: O(N2), where N = size of the given array.
// Reason: For every element, we are performing a linear search to count its occurrence. The linear search takes O(N) time complexity. And there are N elements in the array. So, the total time complexity will be O(N2).

// Space Complexity: O(1) as we are not using any extra space.



  


import java.util.*;

public class tUf {
    public static int getSingleElement(int []arr) {
        //size of the array:
        int n = arr.length;

        // Find the maximum element:
        int maxi = arr[0];
        for (int i = 0; i < n; i++) {
            maxi = Math.max(maxi, arr[i]);
        }

        // Declare hash array of size maxi+1
        // And hash the given array:
        int[] hash = new int[maxi + 1];
        for (int i = 0; i < n; i++) {
            hash[arr[i]]++;
        }

        //Find the single element and return the answer:
        for (int i = 0; i < n; i++) {
            if (hash[arr[i]] == 1)
                return arr[i];
        }

        //This line will never execute
        //if the array contains a single element.
        return -1;
    }

    public static void main(String args[]) {
        int[] arr = {4, 1, 2, 1, 2};
        int ans = getSingleElement(arr);
        System.out.println("The single element is: " + ans);

    }
}





def getSingleElement(arr):
    # Size of the array:
    n = len(arr)

    # Find the maximum element:
    maxi = max(arr)

    # Declare hash array of size maxi+1
    # And hash the given array:
    hash = [0] * (maxi + 1)
    for num in arr:
        hash[num] += 1

    # Find the single element and return the answer:
    for num in arr:
        if hash[num] == 1:
            return num

    # This line will never execute
    # if the array contains a single element.
    return -1


def main():
    arr = [4, 1, 2, 1, 2]
    ans = getSingleElement(arr)
    print("The single element is:", ans)


if __name__ == '__main__':
    main()


// Time Complexity: O(N)+O(N)+O(N), where N = size of the array
// Reason: One O(N) is for finding the maximum, the second one is to hash the elements and the third one is to search the single element in the array.

// Space Complexity: O(maxElement+1) where maxElement = the maximum element of the array.



  


import java.util.*;

public class tUf {
    public static int getSingleElement(int []arr) {
        //size of the array:
        int n = arr.length;

        // Declare the hashmap.
        // And hash the given array:
        HashMap<Integer, Integer> mpp = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int value = mpp.getOrDefault(arr[i], 0);
            mpp.put(arr[i], value + 1);
        }

        //Find the single element and return the answer:
        for (Map.Entry<Integer, Integer> it : mpp.entrySet()) {
            if (it.getValue() == 1) {
                return it.getKey();
            }
        }

        //This line will never execute
        //if the array contains a single element.
        return -1;
    }

    public static void main(String args[]) {
        int[] arr = {4, 1, 2, 1, 2};
        int ans = getSingleElement(arr);
        System.out.println("The single element is: " + ans);

    }
}






def get_single_element(arr):
    # Size of the array:
    n = len(arr)

    # Declare the hashmap.
    # And hash the given array:
    hashmap = {}
    for num in arr:
        hashmap[num] = hashmap.get(num, 0) + 1

    # Find the single element and return the answer:
    for num, count in hashmap.items():
        if count == 1:
            return num

    # This line will never execute
    # if the array contains a single element.
    return -1


def main():
    arr = [4, 1, 2, 1, 2]
    ans = get_single_element(arr)
    print("The single element is:", ans)


if __name__ == "__main__":
//     main()


// Time Complexity: O(N*logM) + O(M), where M = size of the map i.e. M = (N/2)+1. N = size of the array.
// Reason: We are inserting N elements in the map data structure and insertion takes logM time(where M = size of the map). So this results in the first term O(N*logM). The second term is to iterate the map and search the single element. In Java, HashMap generally takes O(1) time complexity for insertion and search. In that case, the time complexity will be O(N) + O(M).

// Note: The time complexity will be changed depending on which map data structure we are using. If we use unordered_map in C++, the time complexity will be O(N) for the best and average case instead of O(N*logM). But in the worst case(which rarely happens), it will be nearly O(N2).

// Space Complexity: O(M) as we are using a map data structure. Here M = size of the map i.e. M = (N/2)+1.






import java.util.*;

public class tUf {
    public static int getSingleElement(int []arr) {
        //size of the array:
        int n = arr.length;

        // XOR all the elements:
        int xorr = 0;
        for (int i = 0; i < n; i++) {
            xorr = xorr ^ arr[i];
        }
        return xorr;
    }

    public static void main(String args[]) {
        int[] arr = {4, 1, 2, 1, 2};
        int ans = getSingleElement(arr);
        System.out.println("The single element is: " + ans);

    }
}






def getSingleElement(arr):
    # XOR all the elements:
    xorr = 0
    for num in arr:
        xorr ^= num
    return xorr

def main():
    arr = [4, 1, 2, 1, 2]
    ans = getSingleElement(arr)
    print("The single element is:", ans)

if __name__ == "__main__":
    main()


// Time Complexity: O(N), where N = size of the array.
// Reason: We are iterating the array only once.

// Space Complexity: O(1) as we are not using any extra space.
