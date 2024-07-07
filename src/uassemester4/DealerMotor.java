package uassemester4;

public class DealerMotor {
   //meanambahkan atribut dan encapsulation(private)
    private String nama;
    private String kode;
    private String merk;
    
    //constructor
    public DealerMotor(String nama, String kode, String merk) {
        this.nama = nama;
        this.kode = kode;
        this.merk = merk;
    }

    //accessor
    public String getNama() {
        return nama;
    }

    public String getKode() {
        return kode;
    }
    
    public String getMerk(){
        return merk;
    }

    //mutator
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }
    
    public void setMerk(String merk){
        this.merk = merk;
    }
    
    public String infoDealer(){
        return "Nama Customer: "+getNama()+
               "\nKode Pembelian: "+getKode()+
               "\nMerk: "+getMerk();
    }
    //polymorphism overloading
    public String infoDealer(String alamat){
        return infoDealer() + "\nAlamat Customer: "+alamat;
    }
}
