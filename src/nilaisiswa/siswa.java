
package nilaisiswa;

public  class  siswa  {

    //mendefinisikan atribut
    String nama;
    int nilai;
    
   //method cetak nilai
    void cetaknilai(){
        System.out.println("Nilai produktif RPL 5 "+nama+"adalah = "+nilai);
    }
    
    //method pengecekan
    public boolean lulus(){
        return nilai >=75;
    }
    public boolean tidaklulus(){
        return nilai <74;
    }
    
    
}