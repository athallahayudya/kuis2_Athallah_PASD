package Quiz_2;

public class LinkedListMhs06 {
    //deklarasi variabel
    Node06 head;

    //Untuk memeriksa apakah linked list dalam keadaan kosong
    public boolean isEmpty() {
        return (head == null);
    }

    //untuk menambahkan node baru di akhir linked list
    public void add(Mahasiswa06 data) {
        Node06 newNode = new Node06(data);
        if (isEmpty()) {
            head = newNode;
        } else {
            Node06 temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        } 
    }

    //untuk menghapus node dengan NIM tertentu dari linked list
    public void delete(String nim) {
        if (isEmpty()) return;

        if (head.data.getNim().equals(nim)) {
            head = head.next;
            System.out.println("Data Mahasiswa dengan NIM " + nim + " berhasil dihapus.");
            return;
        }

        Node06 temp = head;
        while (temp.next != null && !temp.next.data.getNim().equals(nim)) {
            temp = temp.next;
        }

        if (temp.next != null) {
            temp.next = temp.next.next;
            System.out.println("Data Mahasiswa dengan NIM " + nim + " berhasil dihapus.");
        } else {
            System.out.println("Data Mahasiswa dengan NIM " + nim + " tidak ditemukan.");
        }
    }

    //untuk mengambil data dari Mahasiswa06 berdasarkan NIM
    public Mahasiswa06 get(String nim) {
        Node06 temp = head;
        while (temp != null) {
            if (temp.data.getNim().equals(nim)) {
                return temp.data;
            }
            temp = temp.next;
        }
        return null;
    }

    //untuk mencetak semua data dari Mahasiswa06 
    public void printAll() {
        Node06 temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}

