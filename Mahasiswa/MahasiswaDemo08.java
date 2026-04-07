package Mahasiswa;
import java.util.Scanner;
public class MahasiswaDemo08 {
    public static void main(String[] args) {
        int jumMhs=5;
        Mahasiswa08[] data = new Mahasiswa08[jumMhs];
        Mapres08 list = new Mapres08(data);
        Scanner sc = new Scanner(System.in);

        for(int i=0; i<jumMhs; i++){
            System.out.println("Masukkan Data Mahasiswa ke-" + (i + 1));
            System.out.print("NIM   : ");
            String nim = sc.nextLine();
            System.out.print("Nama  : ");
            String nama = sc.nextLine();
            System.out.print("Kelas : ");
            String kelas = sc.nextLine();
            System.out.print("IPK   : ");
            double ipk = sc.nextDouble();
            sc.nextLine(); 
            System.out.println("--------------------------");
            data[i] = new Mahasiswa08(nim, nama, kelas, ipk);
        }

        for(int i=0; i<jumMhs; i++){
            data[i].tampil();
        }
        //melakukan pencarian data sequential
        System.out.println("--------------------------");
        System.out.println("Pencarian Data");
        System.out.println("--------------------------");
        System.out.println("IPK: ");
        double cari = sc.nextDouble();

        System.out.println("Menggunakan Sequential Search");
        int posisi = list.sequentialSearching(cari);
        int pss= (int) posisi;
        list.tampilPosisi(cari, pss);
        list.tampilDataSearch(cari, pss);

        System.out.println("---------------------------");
        System.out.println("Pencarian Data");
        System.out.println("---------------------------");  
        System.out.println("masukkan ipk mahasiswa yang dicari: ");
        System.out.println("IPK: ");
        double cari2 = sc.nextDouble();
        System.out.println("---------------------------");
        System.out.println("Menggunakan Binary Search");
        System.out.println("---------------------------");
        double posisi2 = list.findbinarySearch(cari2, 0, jumMhs-1);
        int pss2 = (int) posisi2;
        list.tampilPosisi(cari2, pss2);
        list.tampilDataSearch(cari2, pss2);
    }
}