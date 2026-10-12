public class SortingCodeLab {
    // =========================================
    // BUBBLE SORT DESCENDING
    // =========================================
    static void bubbleSortDescending(int arr[]) {
        int n = arr.length;
        boolean swapped;

        for (int i = 0; i < ____; i++) {
            swapped = false;

            // Compare adjacent elements
            for (int j = 0; j < ____; j++) {

                // Swap if left element is smaller
                if (arr[j] ____ arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapped = true;
                }
            }

            // Stop early if already sorted
            if (!____) {
                break;
            }
        }
    }

    // =========================================
    // SELECTION SORT DESCENDING
    // =========================================
    static void selectionSortDescending(int arr[]) {
        int n = arr.length;

        for (int i = 0; i < ____; i++) {

            // Assume current index is maximum
            int maxIndex = ____;

            // Find the largest element
            for (int j = ____; j < n; j++) {

                if (arr[j] ____ arr[maxIndex]) {
                    maxIndex = j;
                }
            }

            // Swap elements
            int temp = arr[maxIndex];
            arr[maxIndex] = arr[i];
            arr[i] = temp;
        }
    }
// tambahan \\
    // =========================================
    // PRINT ARRAY
    // =========================================
    static void printArray(int arr[]) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // =========================================
    // MAIN PROGRAM
    // =========================================
    public class Main{
        public static void main(String[] args) {

            int[] bubbleData = {5, 1, 4, 2, 8, 3, 7, 6, 9, 0};
            int[] selectionData = {5, 1, 4, 2, 8, 3, 7, 6, 9, 0};

            // Original Array
            System.out.println("Original Array:");
            printArray(bubbleData);

            // Bubble Sort Descending
            bubbleSortDescending(bubbleData);
            System.out.println("\nBubble Sort Descending:");
            printArray(bubbleData);

            // Selection Sort Descending
            selectionSortDescending(selectionData);
            System.out.println("\nSelection Sort Descending:");
            printArray(selectionData);
        }
    }

}

