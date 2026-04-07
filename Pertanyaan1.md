Pertanyaan 1:
1.Jelaskan perbedaan metod tampilDataSearch dan tampilPosisi pada class MahasiswaBerprestasi! 
2.Jelaskan fungsi break pada kode program di bawah ini! 
3.Apa fungsi variabel pos atau indeks hasil pencarian dalam program sequential search? 
4. Jika terdapat lebih dari satu data dengan nilai yang sama, hasil pencarian sequential search yang dibuat di atas akan menampilkan data ke berapa? Jelaskan. 
5. Berkaitan dengan pertanyaan nomor 2 di atas, apa yang terjadi jika perintah break dihapus dari kode di atas? 

Jawaban:
1. Perbedaan tampilDataSearch dan tampilPosisi
tampilPosisi → hanya menampilkan apakah data ditemukan dan di indeks berapa
tampilDataSearch → menampilkan detail lengkap mahasiswa (NIM, Nama, Kelas, IPK) berdasarkan indeks hasil pencarian
2. Fungsi break menghentikan loop segera setelah data pertama ditemukan, sehingga tidak melanjutkan pencarian ke elemen berikutnya.
3. Fungsi variabel pos menyimpan indeks/posisi array tempat data ditemukan. Nilai -1 berarti data tidak ditemukan. Indeks ini digunakan untuk mengakses data mahasiswa di listMhs[pos].
4. Jika ada lebih dari satu data dengan IPK sama program hanya menampilkan data pertama yang ditemukan (indeks terkecil), karena ada break yang menghentikan loop saat pertama kali cocok.
5. Jika break dihapus loop akan terus berjalan sampai akhir array. Jika ada IPK yang sama di beberapa posisi, variabel posisi akan terus ditimpa dengan indeks terakhir yang cocok — sehingga yang tampil adalah data terakhir yang memiliki IPK sama, bukan yang pertama.
