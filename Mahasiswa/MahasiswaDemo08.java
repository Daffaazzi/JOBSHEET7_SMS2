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
    }
}