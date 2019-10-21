package Tugas_Pratikum2;

public class bola {
    public double jari;
    public double diameter;
    public double hasil;
    public double temp;
    public double volume;
    public double luaspermukaan;
    
    public bola(double jari){
       this.jari = jari;
       hasil = 0;
    }
    
    public void showDiameter(){
        double diameter;
        this.diameter = jari * 2;
    }
    
    public void cetakLuasPermukaan(){
     this.luaspermukaan =  4 * 22/7 * jari * jari;
    }
    public void cetakVolume(){
     this.volume = 4/3 * 22/7 * jari * jari * jari;
    }
    
    public void cetak(){
        System.out.println("Jari-jari bola = " + jari);
        System.out.println("Diameter bola = " + diameter);
        System.out.println("Luas Permukaan bola = " + luaspermukaan);
        System.out.println("Volume bola = " + volume);
    }
}