package uassemester4;

import java.util.Scanner;
public class DealerMotorMain {
    public static void main(String[] args) {
        //object
        //DealerMotor dealermotorku = new DealerMotor("CAHAYA KAMILA", "2210011268", "HONDA");
        
        //System.out.println(dealermotorku.infoDealer());
        //System.out.println(dealermotorku.infoDealer("Jalan Aluh Idut"));
        //error handling
        try{
            //IO sederhana
            Scanner scanner = new Scanner(System.in);
            
            //array
            DealerMotorDetail[] dm = new DealerMotorDetail[2];
            
            //perulangan
            for(int i=0; i<dm.length; i++){
                System.out.print("Masukkan Nama Customer : ");
                String nama = scanner.nextLine();
                System.out.print("Masukkan Kode Pembelian : ");
                String kode = scanner.nextLine();
                System.out.print("Masukkan Merk : ");
                String merk = scanner.nextLine();
                //object
                dm[i] = new DealerMotorDetail(nama, kode, merk);
            }
            
            //perulangan
            for(DealerMotorDetail data: dm){
                System.out.println("++++++++++++++++++++++");
                System.out.println("Data Pembelian Motor");
                System.out.println(data.infoDealer());
            }
            
        } catch (NumberFormatException e){
            System.out.println("Kesalahan Format Nomor: "+e.getMessage());
        } catch (StringIndexOutOfBoundsException e){
            System.out.println("Kesalahan Format Pada Kode Pembelian: "+e.getMessage());
        } catch (Exception e){
            System.out.println("Kesalahan Umum: "+e.getMessage());
        }
    }
 
}
