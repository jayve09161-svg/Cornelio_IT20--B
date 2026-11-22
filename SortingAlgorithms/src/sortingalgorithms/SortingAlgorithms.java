/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sortingalgorithms;

/**
 *
 * @author ASUS EXPERTBOOK
 */
public class SortingAlgorithms {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int arr[] = {5, 3, 10, 2, 6, 8, 9, 1, 7, 4};
        System.out.println("Original Unsorted array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
        //Make a separate array
        int[] bubbleCopy = arr.clone();
        int[] selectionCopy = arr.clone();
        int[] insetionCopy = arr.clone();
        //Method Calls
        bubbleSort(bubbleCopy);
        selectionSort(selectionCopy);
        insertionsort(insetionCopy);
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println();
        System.out.println();
        System.out.println("Sorted by Bubble Sort:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
    }

    public static void selectionSort(int[] arr) {
        int b = arr.length;
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        System.out.println();
        System.out.println();
        System.out.println("sorted by Selection Sort: ");
        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + ", ");
        }

    }

    public static void insertionsort(int[] arr) {
        int s = arr.length;

        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
        System.out.println();
        System.out.println();
        System.out.println("Sorted by Insertion Sort: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
    }
}
