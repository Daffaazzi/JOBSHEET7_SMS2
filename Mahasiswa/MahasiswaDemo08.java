package Mahasiswa;
import java.util.Scanner;

public class MahasiswaDemo08 {
    public static void main(String[] args) {
        System.out.println("========================================");
        System.out.println("Program Demo Mahasiswa dengan Sequential Search");
        System.out.println("========================================\n");
        
        Mapres08 list = new Mapres08();

        Scanner sc = new Scanner(System.in);
        int jumlahMahasiswa = 5; 
        System.out.println("--- Input Data Mahasiswa ---");
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("Mahasiswa ke-" + (i + 1));
            System.out.print("NIM: ");
            String nim = sc.nextLine();
            System.out.print("Nama: ");
            String nama = sc.nextLine();
            System.out.print("Kelas: ");
            String kelas = sc.nextLine();
            System.out.print("Nilai IPK: ");
            String ipk = sc.nextLine();
            double ipkValue = Double.parseDouble(ipk);

            list.tambah(new Mahasiswa08(nim, nama, kelas, ipkValue));
            System.out.println();
        }
        
        list.tampil();
    
        System.out.println("\n--- Pencarian Binary Search ---");
        System.out.print("Masukkan nilai IPK yang ingin dicari: ");
        double nilaiCariBinary = sc.nextDouble();
        System.out.println("Mencari mahasiswa dengan IPK: " + nilaiCariBinary);

        System.out.println("\n--- Hasil Pencarian meggunakan binary searching ---");
        int posisiBinary = list.findBinarySearch(nilaiCariBinary, 0, jumlahMahasiswa - 1);
        list.tampilPoisisi(nilaiCariBinary, posisiBinary);
        list.tampilDataSearch(nilaiCariBinary, posisiBinary);

    }
}