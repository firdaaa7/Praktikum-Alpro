public class QuickSort {

    public static void ascending(int[] arr) {
        quickSort(arr, 0, arr.length - 1, true);
    }

    public static void descending(int[] arr) {
        quickSort(arr, 0, arr.length - 1, false);
    }

    private static void quickSort(int[] arr, int low, int high, boolean ascending) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high, ascending);

            System.out.println(
                    "Pivot " + arr[pivotIndex]
                            + " berada di indeks " + pivotIndex
            );

            System.out.print("Hasil partition: ");
            printRange(arr, low, high);
            System.out.println();

            quickSort(arr, low, pivotIndex - 1, ascending);
            quickSort(arr, pivotIndex + 1, high, ascending);
        }
    }

    private static int partition(int[] arr, int low, int high, boolean ascending) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            boolean shouldMove = ascending
                    ? arr[j] < pivot
                    : arr[j] > pivot;

            if (shouldMove) {
                i++;
                swap(arr, i, j);
            }
        }

        swap(arr, i + 1, high);
        return i + 1;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static void printRange(int[] arr, int low, int high) {
        System.out.print("[");
        for (int i = low; i <= high; i++) {
            System.out.print(arr[i]);
            if (i < high) {
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
