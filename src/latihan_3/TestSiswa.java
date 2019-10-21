package latihan_3;

public class TestSiswa {
    public static void main(String[] args){
        
        EncapSiswa siswa = new EncapSiswa();
        siswa.setName("Fadlillah");
        siswa.setAge(17);
        siswa.setAddress("Malang");
        
        System.out.println("Name :"+siswa.getName());
        System.out.println("Age :"+siswa.getAge());
        System.out.println("Address :"+siswa.getAddress());
    }
}
