package Mahasiswa;

public class Mapres08 {
    Mahasiswa08[] listMhs;

    Mapres08(Mahasiswa08[] listMhs) {
        this.listMhs = listMhs;
    }


    int sequentialSearching(double cari) {
        int posisi = -1;
        for (int j = 0; j < listMhs.length; j++) {
           
            if (listMhs[j] != null && Math.abs(listMhs[j].ipk - cari) < 0.0001) {
                posisi = j;
                break;
            }
        }
        return posisi;
    }

    void tampilPosisi(double x, int pos) {
        System.out.println("================================");
        if (pos != -1) {
          
            System.out.println("Data IPK " + x + " ditemukan pada indeks ke-" + pos);
        } else {
            System.out.println("Data IPK " + x + " tidak ditemukan");
        }
        System.out.println("================================");
    }

   
    void tampilDataSearch(double x, int pos) {
        if (pos != -1) {
            // Fix 4: format rapi dan konsisten
            System.out.println("NIM   : " + listMhs[pos].nim);
            System.out.println("Nama  : " + listMhs[pos].nama);
            System.out.println("Kelas : " + listMhs[pos].kelas);
            System.out.println("IPK   : " + x);
        } else {
            System.out.println("Data IPK " + x + " tidak ditemukan.");
        }
    }
}