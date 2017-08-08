package aplikasisekolah;

public class Launcher {
    public static void main(String[] args) {
        
        TabelGuru tg = new TabelGuru();
        tg.show();
        
        if (true) return;
        
        AplikasiSekolah f  = new AplikasiSekolah();
        f.selamatDatang();
        f.terimaKasih();  
        f.initSiswa();
        f.tampilkanSiswa2();
        
        f.initSiswa2();
        f.showSiswa();
        System.out.println("Dicetak oleh: " + f.tampilkanPencetak());
        System.out.println("Dibuat oleh: " + f.developerName);
        System.out.println("Sekolah: " + f.namaSekolah);       
    }
}
