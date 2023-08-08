package UASPBO1;

//Class
public class Sepatu {

//Atribut dan Encapsulation
protected String merk;
protected int ukuran;
protected double harga;

//Method Constructor
public Sepatu(String merk, int ukuran, double harga){
    this.merk = merk;
    this.ukuran = ukuran;
    this.harga = harga;
}

//Method Accessor

    public String getMerk() {
        return merk;
    }

    public int getUkuran() {
        return ukuran;
    }

    public double getHarga() {
        return harga;
    }

//Method Mutathor

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public void setUkuran(int ukuran) {
        this.ukuran = ukuran;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }
    
    
    public void displayInfo(){
      System.out.println("Merk = "+merk);
      System.out.println("Ukuran = "+ukuran);
      System.out.println("Harga = "+harga);
    }
}
