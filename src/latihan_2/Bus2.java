package latihan_2;

public class Bus2 {
    private int penumpang;
    private int maxPenumpang;
    
    //Konstruktor kelas Bus
    public Bus2(int maxPenumpang){
        this.maxPenumpang = maxPenumpang;
        penumpang = 0;
    }
    
    //method mutator untuk mnambahkan penumpang
    public void addPenumpang(int penumpang){
        int temp;
        temp = this.penumpang+penumpang;
        if(temp >= maxPenumpang){
            System.out.println("Penumang melebihi kuota");
        } else {
            this.penumpang = temp;
        }
    }
    public void cetak(){
        System.out.println("Penumpang Bus sekarang adalah " + penumpang);
        System.out.println("Penumpang maksimum seharusnya adalah " + maxPenumpang);
    }
}
