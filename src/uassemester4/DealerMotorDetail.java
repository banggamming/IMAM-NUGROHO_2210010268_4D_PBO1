package uassemester4;

public class DealerMotorDetail extends DealerMotor {
    //overriding
    public DealerMotorDetail(String nama, String kode, String merk){
        super(nama,kode,merk);
    }
    
    public int getTahunProduksi(){
        return Integer.parseInt(getKode().substring(0, 2)) + 2000;
    }
    
    public String getModel(){
        String kodeModel = getKode().substring(2, 4);
        //seleksi switch
        return switch (kodeModel) {
            case "01" -> "Scoopy";
            case "02" -> "Vario";
            case "03" -> "Crf";
            case "04" -> "Revo";
            default -> "Pilihan Model Tidak Ada";
        };   
    }
    
    public String getWarna(){
        String kodeWarna = getKode().substring(4, 6);
        //seleksi switch
        return switch (kodeWarna) {
            case "05" -> "Merah";
            case "06" -> "Putih";
            case "07" -> "Hitam";
            case "08" -> "Biru";
            default -> "Pilihan Warna Tidak Ada";
        };
    }
    
    public int getNomorMesin(){
        return Integer.parseInt(getKode().substring(6)) + 1000;
    }
    
    //polymorphism overriding
    @Override
    public String infoDealer(){
        return super.infoDealer()+
                "\nTahun Produksi: "+getTahunProduksi()+
                "\nModel: "+getModel()+
                "\nWarna: "+getWarna()+
                "\nNomor Mesin: "+getNomorMesin();
    }
}
