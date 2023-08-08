package UASPBO1;

//Inheritance
public class SepatuRunning extends Sepatu {
  private String jenisRunning;
  
//Method Constructor
  public SepatuRunning(String merk, int ukuran, double harga, String jenisRunning){
      super(merk, ukuran, harga);
      this.jenisRunning = jenisRunning;
  }
  
  public String getJenisRunning(){
      return jenisRunning;
  }
  
//Polymorphism (Overriding)
  @Override
  public void displayInfo(){
      super.displayInfo();
      System.out.println("Sepatu ini dipakai untuk ="+ jenisRunning);
  }
}
