package Quiz_2;
import java.util.Scanner;
public class MhsCollectionMain06 {
    public static void main(String[] args) {
        MhsCollection06 mahasiswaManager = new MhsCollection06();

        mahasiswaManager.add(new Mhs06("101", "Andi", "01-01-2000","Batu"));
        mahasiswaManager.add(new Mhs06("102", "Budi", "02-02-2001","Malang"));
        mahasiswaManager.add(new Mhs06("103", "Cici", "03-03-2002", "Kediri"));
        mahasiswaManager.add(new Mhs06("104", "Dedi", "04-04-2003","Probolinggo"));

        Scanner scanner = new Scanner(System.in);
        int pilih;
        do {

            System.out.println("Menu:");
            System.out.println("1. Tambah Data Mahasiswa");
            System.out.println("2. Hapus Data Mahasiswa");
            System.out.println("3. Cari Data Mahasiswa");
            System.out.println("4. Cetak Semua Data Mahasiswa");
            System.out.println("5. Keluar");
            System.out.print("Pilih: ");
            pilih = scanner.nextInt();
            scanner.nextLine();  

            switch (pilih) {
                case 1:
                    System.out.print("Masukkan NIM: ");
                    String nim = scanner.nextLine();
                    System.out.print("Masukkan Nama: ");
                    String nama = scanner.nextLine();
                    System.out.print("Masukkan Tanggal Lahir: ");
                    String tglLahir = scanner.nextLine();
                    System.out.print("Masukkan Alamat: ");
                    String alamat = scanner.nextLine();
                    mahasiswaManager.add(new Mhs06(nim, nama, tglLahir, alamat));
                    System.out.println("\nData Mahasiswa berhasil ditambahkan");
                    break;
                case 2:
                    System.out.print("Masukkan NIM Mahasiswa yang akan dihapus: ");
                    nim = scanner.nextLine();
                    mahasiswaManager.delete(nim);
                    break;
                case 3:
                    System.out.print("Masukkan NIM Mahasiswa yang ingin diakses: ");
                    nim = scanner.nextLine();
                    Mhs06 m = mahasiswaManager.get(nim);
                    if (m != null) {
                        System.out.println(m);
                    } else {
                        System.out.println("Mahasiswa tidak ditemukan.");
                    }
                    break;
                case 4:
                    mahasiswaManager.printAll();
                    break;
                case 5:
                    System.out.println("Terimakasih");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
        } while (pilih != 5);

        scanner.close();
    }
}

