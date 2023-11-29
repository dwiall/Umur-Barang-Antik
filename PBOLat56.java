/**
 *
 * @author 
 * Nama     : Dwi Ayu Lestari
 * Prodi    : Sistem Informasi - Reg. Pagi
 * NIM      : 22166030
 */
class BarangAntik {
    String nama;
    int umur;

    void info() {
        System.out.println("Nama barang antik : " + nama);
        System.out.println("Umur barang antik ini adalah : " + umur + " tahun");
    }
}

public class PBOLat56 {
    public static void main(String[] args) {
        BarangAntik radio = new BarangAntik();
        radio.nama = "Radio AM";
        radio.umur = 234;

        radio.info();
    }
}
