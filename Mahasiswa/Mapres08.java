package Mahasiswa;
public class Mapres08 {
    
    private Mahasiswa08[] listMhs;
    private int idx;
    
   
    public Mapres08() {
        listMhs = new Mahasiswa08[5];
        idx = 0;
    }
    
    public void tambah(Mahasiswa08 mhs) {
        if (idx < listMhs.length) {
            listMhs[idx] = mhs;
            idx++;
            System.out.println("Mahasiswa berhasil ditambahkan!");
        } else {
            System.out.println("Kapasitas array penuh!");
        }
    }
    
    public void tampil() {
        System.out.println("\n========== Daftar Mahasiswa ==========");
        for (int i = 0; i < idx; i++) {
            System.out.println((i + 1) + ". ");
            listMhs[i].tampilkanInfo();
            System.out.println();
        }
    }
    

    public void tampilPoisisi(double x, int pos) {
        if (pos != -1) {
            System.out.println("Data dengan nilai IPK " + x + " ditemukan!");
            System.out.println("Posisi index: " + pos);
        } else {
            System.out.println("Data dengan nilai IPK " + x + " tidak ditemukan!");
        }
    }
    
  
    public void tampilDataSearch(double x, int pos) {
        System.out.println("\n========== Hasil Pencarian ==========");
        if (pos != -1) {
            System.out.println("Data ditemukan pada posisi " + pos + ":");
            listMhs[pos].tampilkanInfo();
        } else {
            System.out.println("Data dengan nilai IPK " + x + " tidak ditemukan");
        }
    }

    public int sequentialSearching(double cari) {
        int posisi = -1;
        for (int i = 0; i < idx; i++) {
            if (listMhs[i].nilaiIpk == cari) {
                posisi = i;
                break;
            }
        }
        return posisi;
    }
    

    int findBinarySearch(double cari, int left, int right) {
        int mid;
        if (right >= left) {
             mid = (left + right) / 2;
            if (cari == listMhs[mid].nilaiIpk) {
                return (mid);
            }
            else if (listMhs[mid].nilaiIpk > cari) {
                return findBinarySearch(cari, left, mid - 1);
            } else {
            return findBinarySearch(cari, mid + 1, right);
            }
        }
        return -1;
    }   
}