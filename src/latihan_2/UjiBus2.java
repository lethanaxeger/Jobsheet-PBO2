package latihan_2;

import latihan_2.Bus2;

public class UjiBus2 {
    public static void main(String[]arg) {
        
        //membuat objek busBesar dari class Bus
        Bus2 busBesar = new Bus2(40);
        busBesar.cetak();
        
        //penambahan penumpang
        busBesar.addPenumpang(15);//menambahkan 15 penumpang
        busBesar.cetak();
        
        //penambahan penumpang
        busBesar.addPenumpang(5);//menambahkan 5 penumpamg
        busBesar.cetak();
        
        //penambahan penumpang
        busBesar.addPenumpang(26);//menambahkan 26 penumpang
        busBesar.cetak();
    }
}
