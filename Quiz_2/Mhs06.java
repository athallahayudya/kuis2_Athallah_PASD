package Quiz_2;

public class Mhs06 {
    String nim;
    String nama;
    String tglLahir;
    String alamat;

    public Mhs06() {
    }

    public Mhs06(String nim, String nama, String tglLahir, String alamat) {
        this.nim = nim;
        this.nama = nama;
        this.tglLahir = tglLahir;
        this.alamat = alamat;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getTglLahir() {
        return tglLahir;
    }

    public void setTglLahir(String tglLahir) {
        this.tglLahir = tglLahir;
    }

    public String getalamat() {
        return alamat;
    }

    public void setalamat(String alamat) {
        this.alamat = alamat;
    }

    @Override
    public String toString() {
        return "Mahasiswa{NIM = " + nim + ", Nama = " + nama +
                ", Tanggal Lahir = " + tglLahir + ", Alamat = " + alamat + "}";
    }

}
