public class PencarianMhs {
    int jumMhs;
    Mahasiswa listMHs[];
    int idx;
    PencarianMhs(int jumMhs) {
        this.jumMhs = jumMhs;
        this.listMHs = new Mahasiswa[jumMhs];
    }
    void tambah(Mahasiswa m) {
        if (idx < listMHs.length) {
            listMHs[idx] = m;
            idx++;
        }
      
    }

    void tampil() {
        for (Mahasiswa m : listMHs) {
            m.tampil();
            System.out.println("----------------------");

        }
    }
    void insertionSortByname() {
        for (int i = 1; i < listMHs.length; i++) {
            Mahasiswa temp = listMHs[i];
            int j = i - 1;
            while (j >= 0 && listMHs[j].nama.compareTo(temp.nama) > 0) {
                listMHs[j + 1] = listMHs[j];
                j--;
            }
            listMHs[j + 1] = temp;
        }
        System.out.println(listMHs[0].nim);
    }

    public int FindSeqSearch(int cari) {
        int posisi = -1;
        for (int j = 0; j < listMHs.length; j++) {
            if (listMHs[j].nim == cari) {
                posisi = j;
                break;
            }
        }
        return posisi;
    }

    public void TampilData( int pos) {
        if (pos != -1) {
            System.out.println("Nim\t : " + listMHs[pos].nim);
            System.out.println("Nama\t : " + listMHs[pos].nama);
            System.out.println("Umur\t : " + listMHs[pos].ipk);
        } else {
            System.out.println("data " + "tidak ditemukan");
        }
    }
    
    
    public int findBinarySearch(String cariNama) {
        int left = 0;
        int right = listMHs.length - 1;
        int result = -1;
        boolean foundMultiple = false;
    
        while (left <= right) {
            int mid = left + (right - left) / 2;
    
            // Jika nama ditemukan
            if (listMHs[mid].nama.equals(cariNama)) {
                if (result == -1) {
                    result = mid;
                } else {
                    result = -1;  // Lebih dari satu hasil ditemukan
                    foundMultiple = true;
                    break;
                }
            }
    
            if (cariNama.compareTo(listMHs[mid].nama) < 0) {
                right = mid - 1; // Cari di sebelah kiri
            } else {
                left = mid + 1; // Cari di sebelah kanan
            }
        }
    
        if (foundMultiple) {
            System.out.println("Peringatan: Nama lebih dari satu. Lebih baik mencari dengan NIM.");
        }
        
        return result;
    }
    
    
    
}
