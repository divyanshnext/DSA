import java.util.*;

public class hashmap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the number of elements in the array
        System.out.println("Enter the number of elements in the array:");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) { // Change the loop condition to i < n
            arr[i] = sc.nextInt();
        }

        // Precompute the frequencies
        HashMap<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int key = arr[i];
            int freq = mp.getOrDefault(key, 0);
            freq++;
            mp.put(key, freq);
        }

        // Prompt the user to enter the number of queries
        System.out.println("Enter the number of queries:");
        int q = sc.nextInt();

        System.out.println("Enter " + q + " query numbers:");
        while (q-- > 0) {
            int number = sc.nextInt();
            if (mp.containsKey(number)) {
                System.out.println("Frequency of " + number + " is: " + mp.get(number));
            } else {
                System.out.println("Frequency of " + number + " is: 0");
            }
        }

        sc.close(); // Close the scanner
    }
}
