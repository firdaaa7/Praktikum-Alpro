public class MergeSort {

    public static void ascending(int[] arr) {
        mergeSort(arr, 0, arr.length - 1, true);
    }

    public static void descending(int[] arr) {
        mergeSort(arr, 0, arr.length - 1, false);
    }

    private static void mergeSort(int[] arr, int left, int right, boolean ascending) {
        if (left >= right) {
            return;
        }

        int mid = left + (right - left) / 2;

        System.out.print("Divide: ");
        printRange(arr, left, right);
        System.out.println();

        mergeSort(arr, left, mid, ascending);
        mergeSort(arr, mid + 1, right, ascending);

        merge(arr, left, mid, right, ascending);

        System.out.print("Merge:  ");
        printRange(arr, left, right);
        System.out.println();
    }

    private static void merge(int[] arr, int left, int mid, int right, boolean ascending) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        for (int i = 0; i < n1; i++) {
            leftArray[i] = arr[left + i];
        }

        for (int j = 0; j < n2; j++) {
            rightArray[j] = arr[mid + 1 + j];
        }

        int i = 0;
        int j = 0;
        int k = left;

        while (i < n1 && j < n2) {
            boolean takeLeft = ascending
                    ? leftArray[i] <= rightArray[j]
                    : leftArray[i] >= rightArray[j];

            if (takeLeft) {
                arr[k++] = leftArray[i++];
            } else {
                arr[k++] = rightArray[j++];
            }
        }

        while (i < n1) {
            arr[k++] = leftArray[i++];
        }

        while (j < n2) {
            arr[k++] = rightArray[j++];
        }
    }

    private static void printRange(int[] arr, int left, int right) {
        System.out.print("[");
        for (int i = left; i <= right; i++) {
            System.out.print(arr[i]);
            if (i < right) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }

    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
