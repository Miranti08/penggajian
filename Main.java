
public class Main
{
 public static void main (String[] args){
 //intansiasi objek
 koperasi a = new koperasi();
 //data
 a.id="A001";
 a.nama="Miranti Ibrahim";
 a.pk = 1;
 a.t= 2000000;
 a.p= 0;

 //manggil method void identitas
 a.identitas();
 //manggil method void laporan
 a.laporan_keu();
 //manggil menthod novoid limit
 System.out.println("Limit Pinjaman : "+a.limit());
 }
}