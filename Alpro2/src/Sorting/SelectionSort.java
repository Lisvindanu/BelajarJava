package Sorting;

import java.util.Scanner;

public class SelectionSort {
    public static void selectionSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[index]) {
                    index = j;
                }
            }
            int temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah elemen array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Masukkan nilai-nilai array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Nilai sebelum diurutkan:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();

        selectionSort(arr);

        System.out.println("Nilai setelah diurutkan:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}