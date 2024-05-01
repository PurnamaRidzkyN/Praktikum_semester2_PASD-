package jobsheet6;

public class DaftarMahasiswaBerprestasi {
    Mahasiswa listMhs[] = new Mahasiswa[5];
    int idx;

    void tambah(Mahasiswa m){
        if( idx<listMhs.length){
            listMhs[idx]= m;
            idx++;
        }else{
            System.out.println("Data sudah penuh!!");
        }
    }
    void tampil(){
        for (Mahasiswa m : listMhs){
            m.tampil();
            System.out.println("------------------------");
        }
    }
    void bubbleSort(){
        for (int i=0; i<listMhs.length-1; i++){
            for(int j = 1; j<listMhs.length-i; j++){
                if (listMhs[j].ipk > listMhs[j-1].ipk){
                    Mahasiswa Tmp = listMhs[j];
                    listMhs[j] = listMhs[j-1];
                    listMhs[j-1] =Tmp;
                }
            }
        }
    }
    void insertionSort(){
        for ( int i = 1;i < listMhs.length; i++){
            Mahasiswa temp = listMhs[i];
            int j=i;
            while (j<0 && listMhs[j-1].ipk <temp.ipk) {
                listMhs[j]= listMhs[j-1];
                j--;                
            }
            listMhs[j]=temp;
        }
    }
}
