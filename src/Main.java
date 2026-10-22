import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] data = new int[100];

        for (int i = 0; i < data.length; i++) {
            data[i] = ((i * 7919 + 23571) % 1000000) + 1000;
        }

        System.out.println("=================================");
        System.out.println("       Z-APP SORTING SYSTEM");
        System.out.println("=================================");
        System.out.println("Dataset: 100 influencer");
        System.out.print("Jumlah followers awal: ");
        InsertionSort.printArray(data);

        System.out.println();
        System.out.println("Pilih Algoritma Sorting:");
        System.out.println("1. Bubble Sort");
        System.out.println("2. Selection Sort");
        System.out.println("3. Insertion Sort");
        System.out.println("4. Shell Sort");
        System.out.println("5. Merge Sort");
        System.out.println("6. Quick Sort");
        System.out.print("Pilihan: ");
        int algoritma = input.nextInt();

        if (algoritma < 1 || algoritma > 6) {
            System.out.println("Pilihan algoritma tidak valid.");
            input.close();
            return;
        }

        System.out.println();
        System.out.println("Pilih Urutan:");
        System.out.println("1. Ascending");
        System.out.println("2. Descending");
        System.out.print("Pilihan: ");
        int urutan = input.nextInt();

        if (urutan != 1 && urutan != 2) {
            System.out.println("Pilihan urutan tidak valid.");
            input.close();
            return;
        }

        int[] hasil = data.clone();

        String namaAlgoritma;
        String namaUrutan = urutan == 1 ? "Ascending" : "Descending";

        switch (algoritma) {
            case 1:
                namaAlgoritma = "BUBBLE SORT";
                break;
            case 2:
                namaAlgoritma = "SELECTION SORT";
                break;
            case 3:
                namaAlgoritma = "INSERTION SORT";
                break;
            case 4:
                namaAlgoritma = "SHELL SORT";
                break;
            case 5:
                namaAlgoritma = "MERGE SORT";
                break;
            default:
                namaAlgoritma = "QUICK SORT";
                break;
        }

        System.out.println();
        System.out.println("=== " + namaAlgoritma + " ===");
        System.out.println("Urutan: " + namaUrutan);
        System.out.println();

        System.out.println("Array awal:");
        InsertionSort.printArray(hasil);

        System.out.println();
        System.out.println("Proses sorting:");

        switch (algoritma) {
            case 1:
                if (urutan == 1) {
                    BubbleSort.ascending(hasil);
                } else {
                    BubbleSort.descending(hasil);
                }
                break;

            case 2:
                if (urutan == 1) {
                    SelectionSort.ascending(hasil);
                } else {
                    SelectionSort.descending(hasil);
                }
                break;

            case 3:
                if (urutan == 1) {
                    InsertionSort.ascending(hasil);
                } else {
                    InsertionSort.descending(hasil);
                }
                break;

            case 4:
                if (urutan == 1) {
                    ShellSort.ascending(hasil);
                } else {
                    ShellSort.descending(hasil);
                }
                break;

            case 5:
                if (urutan == 1) {
                    MergeSort.ascending(hasil);
                } else {
                    MergeSort.descending(hasil);
                }
                break;

            case 6:
                if (urutan == 1) {
                    QuickSort.ascending(hasil);
                } else {
                    QuickSort.descending(hasil);
                }
                break;
        }

        System.out.println();
        System.out.println("Hasil akhir:");
        InsertionSort.printArray(hasil);

        input.close();
    }
}
