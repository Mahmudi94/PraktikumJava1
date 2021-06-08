package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Mahasiswa {
    String npm;
    String nama;
    Date tanggalLahir;
    final String POLA_TANGGAL = "dd-MM-yyyy";
    final SimpleDateFormat SDF = new SimpleDateFormat(POLA_TANGGAL);

    public void tampilkanAtribut() {
        System.out.println("Nama \t\t\t : " + this.nama);
        System.out.println("NPM \t\t\t : " + this.npm);
        System.out.println("Tanggal Lahir \t : " + SDF.format(this.tanggalLahir));
    }

    public String getNpm() {
        return npm;
    }

    public void setNpm(String npm) {
        this.npm = npm;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Date getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(Date tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    public String getPOLA_TANGGAL() {
        return POLA_TANGGAL;
    }

    public SimpleDateFormat getSDF() {
        return SDF;
    }

    public Mahasiswa(String npm, String nama, String tanggalLahir) {
        this.npm = npm;
        this.nama = nama;
        try {
            this.tanggalLahir = SDF.parse(tanggalLahir);
        } catch (ParseException e) {
            System.err.println("Kesalahan pada tanggal lahir");
        }
    }
}
