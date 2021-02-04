
package nilaisiswa;

public  class  kelulusan  {


public  static  void  main(String[]  args)  {
    
    String nama;
    int nilai;
    
    //object
    siswa siswaa = new siswa();
    
    //mengisi atribut
    siswaa.nama = "ANYA";
    siswaa.nilai = 80;
    
    //menjlankan method
    siswaa.cetaknilai();
    
    //menentukan lulus
    if(siswaa.lulus()){
        System.out.println("SELAMAT ANDA LULUS");
    }
    else if (siswaa.tidaklulus()){
        System.out.println("ANDA HARUS BELAJAR LEBIH GIAT LAGI");
    }


}
}