package model;

import java.text.CompactNumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MahasiswaBeraksi {

    public static void main(String[] args) throws ParseException {

        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.tampilkanAtribut();
        mahasiswa.menyapa();
        System.out.println("Usiaku : " + mahasiswa.hitungUsia() + " tahun");

        CompactNumberFormat simpleDateFormat;
        simpleDateFormat = null;
        mahasiswa.npm = "19639999";
        mahasiswa.nama = "Sembilu";
        mahasiswa.tanggalLahir = simpleDateFormat.parse("09-09-1009");

        Mahasiswa mahasiswa2 = new Mahasiswa();
        mahasiswa2.npm = "19638888";
        mahasiswa2.nama = "Delapu";
        mahasiswa2.tanggalLahir = simpleDateFormat.parse("08-08-2008");

        System.out.println("Nama \t\t\t : " );
        System.out.println("NPM \t\t\t : " );
        System.out.println("Tanggal Lahir \t : " + simpleDateFormat.format(mahasiswa2.tanggalLahir));
    }
}
