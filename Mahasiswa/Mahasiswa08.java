package Mahasiswa;
public class Mahasiswa08 {
    
    public String nama;
    public String nim;
    public double nilaiIpk;
    public String kelas;
    
    public Mahasiswa08() {
    }
    
    public Mahasiswa08(String nm, String name, String kls, double ip) {
        this.nim = nm;
        this.nama = name;
        this.kelas = kls;
        this.nilaiIpk = ip;
    }
    
    public void tampilkanInfo() {
        System.out.println("=== Informasi Mahasiswa ===");
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Nilai IPK: " + nilaiIpk);
        System.out.println("Kelas: " + kelas);
    }
}