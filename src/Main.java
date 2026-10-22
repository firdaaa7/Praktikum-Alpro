public class Main {
    public static void main(String[] args) {
        int[] dataMerge = {38, 27, 43, 3};

        MergeSort.mergeSort(dataMerge, 0, dataMerge.length - 1);

        System.out.print("Merge Sort (Descending): ");
        for (int value : dataMerge) {
            System.out.print(value + " ");
        }

        System.out.println();

        int[] dataQuick = {10, 7, 8, 9, 1, 5};

        QuickSort.quickSort(dataQuick, 0, dataQuick.length - 1);

        System.out.print("Quick Sort (Descending): ");
        for (int value : dataQuick) {
            System.out.print(value + " ");
        }
    }
}
