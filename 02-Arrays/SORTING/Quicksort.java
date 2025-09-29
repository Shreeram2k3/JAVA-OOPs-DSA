package SORTING;

public class Quicksort {
    public static void qs(int[] arr, int low, int high) {
        if (low < high) {
            int pindex = partition(arr, low, high);
            qs(arr, low, pindex - 1);
            qs(arr, pindex + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low, j = high;

        while (i < j) {
            while (i < high && arr[i] <= pivot) {
                i++;
            }

            while (j > low && arr[j] > pivot) {
                j--;
            }

            if (i < j) {
                swap(arr, i, j); // Swapping elements
            }
        }

        swap(arr, low, j); // Swapping pivot to correct position
        return j;
    }

    // Swap method for better readability
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 4, 6, 3};
        int n = arr.length;

        System.out.println("Before sorting:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        
        qs(arr, 0, n - 1);

        System.out.println("\nAfter sorting:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}


