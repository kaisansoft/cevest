package aplikasisekolah;

import java.util.ArrayList;
import java.util.Date;

public class AplikasiSekolah {

    private String alamatSekolah = "Bekasi";
    protected String namaSekolah = "Cevest";
    int tahunBerdiri = 2011;
    static String presidenRI = "Habibie";
    public String developerName = "Erni";

    private String dicetakOleh = "Ahmad Printing";
    ArrayList<String> dataSiswa = new ArrayList<String>();
    ArrayList<Siswa> listOfSiswa = new ArrayList<Siswa>();
    ArrayList<Guru> listOfGuru = new ArrayList<>();
    
    void initGuru() {
        Guru g = new Guru();
//        g.setTangalLahir(new Date());
//        g.setAlamat("Bekasi");
        g.setNip("2323434");
        listOfGuru.add(g);
    }
    
    
    
    
    public void tampilkanSiswa2() {
        for (int kk = 0; kk < dataSiswa.size(); kk++) {
            String nama = dataSiswa.get(kk);
            System.out.println((kk + 1) + ". " + nama);
        }
    }

    public void tampilkanSiswa() {
        for (String nama : dataSiswa) {
            System.out.println(" Nama = " + nama);
        }
    }

    public void showSiswa() {
        for (int kk = 0; kk < listOfSiswa.size(); kk++) {
            Siswa siswa = listOfSiswa.get(kk);
            System.out.println((kk + 1) + ". " + siswa.getNama()
                    + ", " + siswa.getAlamat());
        }
    }

    public void initSiswa2() {
        Siswa ahmad = new Siswa();
        ahmad.setNama("Ahmad");
        ahmad.setAlamat("Bekasi");

        Siswa heru = new Siswa();
        heru.setNama("Heru");
        heru.setAlamat("Pekalongan");
        Siswa erni = new Siswa();
        erni.setNama("Erni");
        erni.setAlamat("Cirebon");

        listOfSiswa.add(ahmad);
        listOfSiswa.add(heru);
        listOfSiswa.add(erni);
    }

    public void initSiswa() {
        dataSiswa.add("Ahmad");
        dataSiswa.add("Heru");
        dataSiswa.add("Yuyus");
        dataSiswa.add("Krisna");
        dataSiswa.add("Erni");
        dataSiswa.add("Nurjanaah");

        System.out.println("Jumlah siswa = "
                + dataSiswa.size());

    }

    public String tampilkanPencetak() {
        return dicetakOleh;
    }

    void selamatDatang() {
        System.out.println("Ahlan wa sahlan");
    }

    void terimaKasih() {
        System.out.println("Terima kasih");
    }

    static void versi() {
        System.out.println("Versi 20170806");
    }

}
