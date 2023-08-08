# FikriHafizhi-UASPBO1-4ANonRegBJM
# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data mahasiswa menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa Data Sepatu, dan memberikan output berupa informasi detail dari Data Penjualan Sepatu tersebut seperti Merk, Ukuran, Harga, dan Jenis Sepatu.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Sepatu`, `SepatuRunning`, dan `DataPenjualanSepatu` adalah contoh dari class.

```bash
public class Sepatu {
    ...
}

public class SepatuRunning extends Sepatu {
    ...
}

public class DAtaPenjualanSepatu {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, `daftarsepatu[i] = new SepatuRunning(merk, ukuran, harga, jenisRunning);` adalah contoh pembuatan object.

```bash
daftarSepatu[i] = new SepatuRunning(merk, ukuran, harga, jenisRunning);
}else{
daftarSepatu[i] = new Sepatu(merk, ukuran, harga);
}
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `merk` `ukuran` `harga` dan `jenisRunning`  adalah contoh atribut.

```bash
String merk;
int ukuran;
double harga;
String jenisRunning;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `Sepatu` dan `SepatuRunning`.

```bash
public Sepatu(String merk, int ukuran, double harga){
    this.merk = merk;
    this.ukuran = ukuran;
    this.harga = harga;
}

public SepatuRunning(String merk, int ukuran, double harga, String jenisRunning){
    super(merk, ukuran, harga);
    this.jenisRunning = jenisRunning;
}
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setMerk` `setUkuran` dan `setHarga` adalah contoh method mutator.

```bash
public void setMerk(String merk) {
    this.merk = merk;
}

public void setUkuran(int ukuran) {
    this.ukuran = ukuran;
}

public void setHarga(double harga) {
    this.harga = harga;
}
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getMerk`, `getUkuran`, `getHarga`, dan `getJenisRunning` adalah contoh method accessor.

```bash
public String getMerk() {
    return merk;
}

public int getUkuran() {
    return ukuran;
}

public double getHarga() {
    return harga;
}
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi protected dan private serta hanya bisa diakses melalui method. Pada kode ini, atribut `merk` `ukuran` `harga` dan `jenisRunning` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
protected String merk;
protected int ukuran;
protected double harga;
private String jenisRunning;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `SepatuRunning` mewarisi `Sepatu` dengan sintaks `extends`.

```bash
public class SepatuRunning extends Sepatu {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `displayInfo(String)` di `Sepatu` merupakan overloading method `displayInfo` dan `displayInfo` di `SepatuRunning` merupakan override dari method `displayInfo` di `Sepatu`.

```bash
public void displayInfo(){
      System.out.println("Merk = "+merk);
      System.out.println("Ukuran = "+ukuran);
      System.out.println("Harga = "+harga);
}

@Override
public void displayInfo(){
    super.displayInfo();
    System.out.println("Sepatu ini dipakai untuk ="+ jenisRunning);
}
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `if else` dalam method `getjenisRunning`.

```bash
if (jenisRunning.equalsIgnoreCase("Ya")){
    System.out.print("Jenis Lari (LongRun / ShuttleRun)= ");
    jenisRunning = input.next();
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk meminta input dan menampilkan data.

```bash
for (int i=0; i<daftarSepatu.length; i++){
            System.out.println("Data Sepatu "+ (i+1));
            System.out.print("Merk = ");
            String merk = input.next();
            
            int ukuran = 0;
            boolean ukuranValid = false;
            while (!ukuranValid)
}
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
Scanner scanner = new Scanner(System.in);
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `Sepatu [] daftarSepatu = new Sepatu[2];` adalah contoh penggunaan array.

```bash
Sepatu [] daftarSepatu = new Sepatu[2];
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
try{
    System.out.print("Ukuran = ");
    ukuran = input.nextInt();
      if (ukuran <= 10){
            throw new IllegalArgumentException("Ukuran sepatu harus lebih dari o.");
      }
      ukuranValid = true;
  }catch (InputMismatchException e){
      System.out.println("Masukkan Ukuran Sepatu Dalam Bentuk Angka.");
      input.nextLine();
  }catch (IllegalArgumentException e){
      System.out.println(e.getMessage());
      input.nextLine();
  }
}
            
double harga = 0;
boolean hargaValid = false;
while (!hargaValid){
  try{
      System.out.print("Harga = ");
      harga = input.nextDouble();
      if(harga <= 0){
          throw new IllegalArgumentException("Harga sepatu harus lebih dari 100000");
      }
      hargaValid = true;
                    
  }catch (InputMismatchException e){
      System.out.println("Masukkan Harga Sepatu Dalam Bentuk Angka");
      input.nextLine();
  }catch (IllegalArgumentException e){
      System.out.println(e.getMessage());
      input.nextLine();
  }
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

Nama: Muhammad Edya Rosadi
NPM: 2110010001
