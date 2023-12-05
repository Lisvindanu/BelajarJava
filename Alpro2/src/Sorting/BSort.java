package Sorting;

public class BSort {
    static void bubbleSort1(int[] arr){
        int n = arr.length;
        int temp;
        int i, j;

        for (i = 0; i < n-1; i++){
            for (j = 0; j < n-i-1; j++ ){
                if (arr[j] > arr[j+1]){
                    // Tukar elemen arr[j] dan arr[j+1]
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] ={10,9,8,7,6,5};

        for(int i=0; i< arr.length; i++){
            System.out.println(arr[i]);
        }

    }
}