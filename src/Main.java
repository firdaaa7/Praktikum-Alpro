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
        System.out.print("Pilihan: ");
        int algoritma = input.nextInt();

        System.out.println();
        System.out.println("Pilih Urutan:");
        System.out.println("1. Ascending");
        System.out.println("2. Descending");
        System.out.print("Pilihan: ");
        int urutan = input.nextInt();

        if (algoritma < 1 || algoritma > 4) {
            System.out.println("Pilihan algoritma tidak valid.");
            input.close();
            return;
        }

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
            default:
                namaAlgoritma = "SHELL SORT";
                break;
        }

        System.out.println();
        System.out.println("=== " + namaAlgoritma + " ===");
        System.out.println("Urutan: " + namaUrutan);
        System.out.println();

        if (algoritma == 1) {
            if (urutan == 1) {
                BubbleSort.ascending(hasil);
            } else {
                BubbleSort.descending(hasil);
            }
        } else if (algoritma == 2) {
            if (urutan == 1) {
                SelectionSort.ascending(hasil);
            } else {
                SelectionSort.descending(hasil);
            }
        } else if (algoritma == 3) {
            if (urutan == 1) {
                InsertionSort.ascending(hasil);
            } else {
                InsertionSort.descending(hasil);
            }
        } else {
            if (urutan == 1) {
                ShellSort.ascending(hasil);
            } else {
                ShellSort.descending(hasil);
            }
        }

        System.out.println();
        System.out.print("Hasil akhir: ");
        InsertionSort.printArray(hasil);

        input.close();
    }
}
