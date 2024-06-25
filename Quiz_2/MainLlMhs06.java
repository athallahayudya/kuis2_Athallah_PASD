package Quiz_2;

import java.util.Scanner;

public class MainLlMhs06 {
    public static void main(String[] args) {

        //menginisialisasi LinkedList 
        LinkedListMhs06 mahasiswaList = new LinkedListMhs06();

        //menambah data mahasiswa
        mahasiswaList.add(new Mahasiswa06("101", "Andi", "01-01-2000", "Malang"));
        mahasiswaList.add(new Mahasiswa06("102", "Budi", "02-02-2001", "Batu"));
        mahasiswaList.add(new Mahasiswa06("103", "Cici", "03-03-2002", "Cirebon"));
        mahasiswaList.add(new Mahasiswa06("104", "Dedi", "04-04-2003","Denpasar"));

        //scanner digunakan untuk menginputkan data dari pengguna
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            //untuk memilih layanan layanan apa yang ingin diakses
            System.out.println("Menu:");
            System.out.println("1. Tambah Data Mahasiswa");
            System.out.println("2. Hapus Data Mahasiswa");
            System.out.println("3. Cari Data Mahasiswa");
            System.out.println("4. Cetak Semua Data Mahasiswa");
            System.out.println("5. Keluar");
            System.out.print("Pilih: ");
            choice = scanner.nextInt();
            scanner.nextLine();  

            switch (choice) {
                case 1:
                //Tambah data mahasiswa digunakan untuk menambahkan data mahasiswa dalam linked list
                    System.out.print("Masukkan NIM: ");
                    String nim = scanner.nextLine();
                    System.out.print("Masukkan Nama: ");
                    String nama = scanner.nextLine();
                    System.out.print("Masukkan Tanggal Lahir: ");
                    String tglLahir = scanner.nextLine();
                    System.out.print("Masukkan Alamat: ");
                    String alamat = scanner.nextLine();
                    mahasiswaList.add(new Mahasiswa06(nim, nama, tglLahir, alamat));
                    System.out.println("\nData Mahasiswa berhasil ditambahkan");
                    break;
                case 2:
                //Hapus data mahasiswa digunakan untuk menghapus data mahasiswa berdasarkan NIM nya
                    System.out.print("Masukkan NIM Mahasiswa yang akan dihapus: ");
                    nim = scanner.nextLine();
                    mahasiswaList.delete(nim);
                    break;
                case 3:
                //Cari data mahasiswa digunakan untuk mencari data mahasiswa berdasarkan NIM 
                    System.out.print("Masukkan NIM Mahasiswa yang ingin dicari: ");
                    nim = scanner.nextLine();
                    Mahasiswa06 m = mahasiswaList.get(nim);
                    if (m != null) {
                        System.out.println(m);
                    } else {
                        System.out.println("Mahasiswa tidak ditemukan.");
                    }
                    break;
                case 4:
                //Cetak data digunakan untuk menampilkan semua data yang terdapat pada linked list
                    mahasiswaList.printAll();
                    break;
                case 5:
                //digunakan untuk keluar dari program (mengakhiri program)
                    System.out.println("Terimakasih");
                    break;
                default:
                //output ini akan ter-print ketika user menginputkan angka yang tidak sesuai dengan pilihan yang ada
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
        } while (choice != 5);
        scanner.close();
        //keluar program
    }
}
