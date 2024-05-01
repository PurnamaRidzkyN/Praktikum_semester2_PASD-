public class Rekening {
    String noRekening;
    String nama;
    String namaibu;
    String Phone;
    String Email;

    Rekening(String a, String b,String c, String d, String e){
        noRekening = a;
        nama = b;
        namaibu = c;
        Phone = d;
        Email = e;
    }
    void tampil(){
        System.out.println(" No Rekening= "+noRekening );
        System.out.println(" Nama = "+nama);
        System.out.println(" Nama Ibu = "+ namaibu);
        System.out.println(" Phone = "+ Phone);
        System.out.println(" Email = "+ Email);
    }
}