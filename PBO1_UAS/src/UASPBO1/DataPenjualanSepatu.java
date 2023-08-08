package UASPBO1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DataPenjualanSepatu {
    public static void main(String[] args) {
        
        //Input(I) / Output(O) Sederhana
        Scanner input = new Scanner(System.in);
        
        //Array
        Sepatu [] daftarSepatu = new Sepatu[2];
        
        //Perulangan(Looping)
        for (int i=0; i<daftarSepatu.length; i++){
            System.out.println("Data Sepatu "+ (i+1));
            System.out.print("Merk = ");
            String merk = input.next();
            
            int ukuran = 0;
            boolean ukuranValid = false;
            while (!ukuranValid){
                
                //Error Handling
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
            
            System.out.print("Apakah Sepatu Ini Untuk Running? (Ya/Tidak): ");
            String jenisRunning = input.next();
            
            //Seleksi
            if (jenisRunning.equalsIgnoreCase("Ya")){
                System.out.print("Jenis Lari (LongRun / ShuttleRun)= ");
                jenisRunning = input.next();
                
                //Object
                daftarSepatu[i] = new SepatuRunning(merk, ukuran, harga, jenisRunning);
            }else{
                daftarSepatu[i] = new Sepatu(merk, ukuran, harga);
            }
        }
        
        System.out.println("Daftar Sepatu:");
        for (Sepatu sepatu : daftarSepatu){
            sepatu.displayInfo();
            System.out.println();
        }
        
        input.close();
    }
}
