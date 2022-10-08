import java.util.Arrays;

public class BubbleAndSelectionSort {

    public static void main(String[] args) {
        int arr[] = { 4, 8, 2, 1, 19, 0, -1, 5 };
       // bubbleSort(0, arr.length - 1, arr);
       selectionSort(0, arr.length-1, arr, 0);
        System.out.println(Arrays.toString(arr));

    }

    public static void swap(int arr[], int i, int j) {
        arr[i] = arr[i] ^ arr[j];
        arr[j] = arr[j] ^ arr[i];
        arr[i] = arr[j] ^ arr[i];
    }

    public static void bubbleSort(int s, int e, int arr[]) {
        if (s > e) {
            return;
        }
        if (s == e) {
            bubbleSort(0, e - 1, arr);
        } else {
            if (arr[s] > arr[s + 1]) {

                swap(arr, s, s + 1);
            }
            bubbleSort(s + 1, e, arr);
        }
    }

    public static void selectionSort(int s, int e, int arr[], int max) {
        if (e == 0) {
            return;
        }
        if (s < e) {
            if (arr[s] > arr[max]) {
                max = s;
            }
            selectionSort(s + 1, e, arr, max);

        }
        else{
            swap(arr, e, max);
            selectionSort(0, e-1, arr, max);
        }
    }
}
