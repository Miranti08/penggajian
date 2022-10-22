
public class koperasi
{
 String id, nama;
 boolean pw, sandi;
 int t,p,pk;
 double b;

 //konstruktor non parameter
 //public koperasi(){

 //}
 //konstruktor parameter
 //public koperasi(String pw, String sandi){

 //}
 //method void identitas
 void identitas(){
 System.out.println("Data Anggota Koperasi ");
 System.out.println("ID : "+id);
 System.out.println("Nama : "+nama);
 System.out.println();
 }
 //method void laporan_keu
 void laporan_keu(){
 System.out.println("Laporan Keuangan Anggota");
 System.out.println("Jumlah Tabungan : "+t);
 System.out.println("Jumlah Pinjaman : "+p);

 }
 //method nonvoid limit
 double limit()
 {
 double b = pk * t;
 return b;
 }
}