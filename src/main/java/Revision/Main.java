package Revision;
import java.util.*;

public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // Input array size
            System.out.print("Enter size of array: ");
            int n = sc.nextInt();
            int[] arr = new int[n];

            // Input elements
            System.out.println("Enter elements:");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            // HashMap to store frequency
            HashMap<Integer, Integer> freqMap = new HashMap<>();

            // Count frequencies
            for (int num : arr) {
                freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
            }

            System.out.println(freqMap);

            // Find element with maximum frequency
            int maxElement = -1;
            int maxCount = 0;

            for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
//                System.out.println(entry.getKey() + " " + entry.getValue());
                if (entry.getValue() > maxCount) {
                    maxCount = entry.getValue();
                    maxElement = entry.getKey();
                }
            }
//
            // Print result
            System.out.println("Element with highest frequency: " + maxElement);
            System.out.println("It occurs " + maxCount + " times");
        }
    }
