# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data pembelian sepeda motor menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa nama customer, kode pembelian dan merk , dan memberikan output berupa informasi detail dari kode tersebut seperti tahun produksi, model, warna, dan nomor mesin.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `DealerMotor`, `DealerMotorDetail`, dan `DealerMotorMain` adalah contoh dari class.

```bash
public class DealerMotor {
    ...
}

public class DealerMotorDetail extends DealerMotor {
    ...
}

public class DealerMotorMain {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, `dm[i] = new DealerMotorDetail(nama, kode, merk);` adalah contoh pembuatan object.

```bash
dm[i] = new DealerMotorDetail(nama, kode, merk);
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `nama`, `kode` dan `merk` adalah contoh atribut.

```bash
String nama;
String kode;
String merk;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `DealerMotor` dan `DealerMotorDetail`.

```bash
public DealerMotor(String nama, String kode, String merk) {
    this.nama = nama;
    this.npm = kode;
    this.merk = merk;
}

public DealerMotorDetail(String nama, String kode, String merk) {
    super(nama, kode, merk);
}
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setNama`, `setKode`, dan `setMerk adalah contoh method mutator.

```bash
public void setNama(String nama) {
    this.nama = nama;
}

public void setKode(String kode) {
    this.kode = kode;
}

public void setMerk(String merk) {
    this.merk = merk;
}
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getNama`, `getKode`, `getTahunProduksi`, `getModel`, `getWarna`, dan `getNomorMesin` adalah contoh method accessor.

```bash
public String getNama() {
    return nama;
}

public String getKode() {
    return kode;
}
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `nama`, `kode`, dan `merk` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
private String nama;
private String kode;
private String merk;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `DealerMotorDetail` mewarisi `DealerMotor` dengan sintaks `extends`.

```bash
public class DealerMotorDetail extends DealerMotor {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `infoDealer(String)` di `DealerMotor` merupakan overloading method `infoDealer` dan `infoDealer` di `DealerMotorDetail` merupakan override dari method `infoDealer` di `DealerMotor`.

```bash
public String infoDealer(String alamat) {
    return infoDealer() + "\nAlamat Customer: " + alamat;
}

@Override
public String infoDealer() {
    ...
}
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `switch` dalam method `getModel` dan `getWarna`.

```bash
public String getModel() {
     String kodeModel = getKode().substring(2, 4);
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
        return switch (kodeWarna) {
            case "05" -> "Merah";
            case "06" -> "Putih";
            case "07" -> "Hitam";
            case "08" -> "Biru";
            default -> "Pilihan Warna Tidak Ada";
        };
    }
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk meminta input dan menampilkan data.

```bash
for (int i = 0; i < dm.length; i++) {
    ...
}
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
Scanner scanner = new Scanner(System.in);
System.out.print("Masukkan Nama Customer : ");
String nama = scanner.nextLine();
System.out.print("Masukkan Kode Pembelian : ");
String kode = scanner.nextLine();
System.out.print("Masukkan Merk : ");
String merk = scanner.nextLine();

System.out.println("Data Pembelian Motor");
System.out.println(data.infoDealer());
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `DealerMotorDetail[] dm = new DealerMotorDetail[2];` adalah contoh penggunaan array.

```bash
DealerMotorDetail[] dm = new DealerMotorDetail[2];
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
try {
    // code that might throw an exception
}  catch (NumberFormatException e){
    System.out.println("Kesalahan Format Nomor: "+e.getMessage());
} catch (StringIndexOutOfBoundsException e){
    System.out.println("Kesalahan Format Pada Kode Pembelian: "+e.getMessage());
} catch (Exception e) {
    System.out.println("Kesalahan Umum: " + e.getMessage());
}
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Imam Nugroho
NPM: 2210010268
