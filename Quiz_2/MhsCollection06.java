package Quiz_2;

import java.util.ArrayList;

public class MhsCollection06 {

    //untuk mendeklarasikan variabel mahasiswaList dari tipe ArrayList<Mhs06>
    public ArrayList<Mhs06> mahasiswaList;

    //konstruktor untuk menginisialisasi mahasiswaList sebagai ArrayList
    public MhsCollection06() {
        this.mahasiswaList = new ArrayList<>();
    }

    //untuk menambahkan objek Mhs06 ke dalam mahasiswaList 
    public void add(Mhs06 mahasiswa) {
        mahasiswaList.add(mahasiswa);
    }

    //Menghapus objek Mhs06 berdasarkan nim dari mahasiswaList 
    public void delete(String nim) {
        boolean hapus = mahasiswaList.removeIf(mahasiswa -> mahasiswa.getNim().equals(nim));
        if (hapus) {
            System.out.println("Data Mahasiswa dengan NIM " + nim + " berhasil dihapus");
        } else {
            System.out.println("Data Mahasiswa tidak ditemukan");
        }
    }

    //Mencari dan mengembalikan objek Mhs06 berdasarkan nim. Mengembalikan null jika tidak ditemukan.
    public Mhs06 get(String nim) {
        for (Mhs06 mahasiswa : mahasiswaList) {
            if (mahasiswa.getNim().equals(nim)) {
                return mahasiswa;
            }
        }
        return null;
    }

    //Mencetak semua objek Mhs06 dalam mahasiswaList.
    public void printAll() {
        for (Mhs06 mahasiswa : mahasiswaList) {
            System.out.println(mahasiswa);
        }
    }
}
