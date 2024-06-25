package Quiz_2;

public class Mahasiswa06 {
    //deklarasi variabel
        String nim;
        String nama;
        String tglLahir;
        String alamat;
    
        //konstruktor default
        public Mahasiswa06() {

        }

        //konstruktor berparameter
        public Mahasiswa06(String nim, String nama, String tglLahir, String alamat) {
            this.nim = nim;
            this.nama = nama;
            this.tglLahir = tglLahir;
            this.alamat = alamat;
        }
    
        /*method get digunakan untuk mengambil nilai properti pada objek
         * contohnya getNim berarti digunakan untuk mengambil nilai dari NIm
        */
        public String getNim() {
            return nim;
        }

        public String getNama() {
            return nama;
        }
        public String getTglLahir() {
            return tglLahir;
        }
        public String getalamat(){
            return alamat;
        }

         /*method set digunakan untuk mengatur nilai properti pada objek
         * contohnya setNim berarti digunakan untuk mengatur nilai dari NIm
        */
        public void setNim(String nim) {
            this.nim = nim;
        }
    
        public void setNama(String nama) {
            this.nama = nama;
        }
    
        public void setTglLahir(String tglLahir) {
            this.tglLahir = tglLahir;
        }

        public void setalamat(String alamat){
            this.alamat =alamat;
        }
    
        @Override
        public String toString() {
            return "Mahasiswa{NIM = " + nim  +", Nama = " + nama + 
            ", Tanggal Lahir = " + tglLahir + ", Alamat = "+ alamat +"}";
        }
    
}
