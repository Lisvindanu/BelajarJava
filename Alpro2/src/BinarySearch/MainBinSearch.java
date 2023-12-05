package BinarySearch;

import java.util.Scanner;

public class MainBinSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter sorted elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("Enter the target element to search for: ");
        int target = scanner.nextInt();

        BinSearch bs = new BinSearch();
        int result = bs.search(arr, target);

        if (result != -1) {
            System.out.println("Element " + target + " found at index " + result);
        } else {
            System.out.println("Element " + target + " not found in the array");
        }

        scanner.close();
    }
}

