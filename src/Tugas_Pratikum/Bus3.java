package Tugas_Pratikum;

public class Bus3 {
    public double penumpang;
    public double maxpenumpang;
    public int counter = 0;
    public double penumpangBaru;
    
    public Bus3(double maxpenumpang){
        this.maxpenumpang = maxpenumpang;
        penumpang = 0;
    }
    
    //Method Mutator
    public void addpenumpang(double penumpang){
        double temp;
        temp = this.penumpang+penumpang;
        if (temp>maxpenumpang){
            System.out.println("penumpang melebihi kuota");
        } else {
            this.penumpang = temp;
        }
        counter++;
        penumpangBaru =+ penumpang;
    }
    
    public void getpenumpang(int password){
        if (password == 24){
            System.out.println("Password Benar");
        } else {
            System.out.println("Password Salah");
        }
    }
    
    public void cetakpenumpang(){
        System.out.println("penumpang Bus Sekarang = " + penumpang);
        System.out.println("Maksimum penumpang yang seharusnya adalah = "+maxpenumpang);
    }
     public double getAverage(){
        double r;
        r = penumpang / counter;
        return r;
    }
    
    public void cetak(){
        System.out.println("Rata-rata berat badan penumpang adalah " + getAverage());
        System.out.println("........................................");
        System.out.println("Berat penumpang baru = " + penumpangBaru);
        System.out.println("========================================");
        System.out.println("========================================");
    }
}
