package Tugas_Pratikum;

public class UjiBus3 {
    public static void main(String[] abc){
        Bus3 Bus = new Bus3(30);
        Bus.getpenumpang(17);
        Bus.getpenumpang(24);
        Bus.cetakpenumpang();
        // penambahan penumpang
        Bus.addpenumpang(10); //tambah 2 penumpang
        Bus.cetakpenumpang();
        // penambahan penumpang
        Bus.addpenumpang(10); // tambah 1 penumpang
        Bus.cetakpenumpang();
        // penambahan penumpang
        Bus.addpenumpang(10); // tambah 2 penumpang
        Bus.cetakpenumpang();
        // penambahan penumpang
        Bus.addpenumpang(5); // tambah 2 penumpang
        Bus.cetakpenumpang();
        // Berat badan penumpang
        Bus.cetak();
    }
}
