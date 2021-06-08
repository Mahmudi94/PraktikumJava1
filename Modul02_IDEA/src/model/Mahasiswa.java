package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Mahasiswa {

    String npm;
    String nama;
    Date tanggalLahir;
}

    void tampilkanAtribut() {
        String polaTanggal = "dd-MM-yyyy";


        System.out.println("Nama \t\t\t : ");
        System.out.println("NPM \t\t\t : ");
        System.out.println("Tanggal Lahir \t : " + SDF.format(this.tanggalLahir));
    }

    public int Mahasiswa() throws ParseException {
        this.npm = npm;
        this.nama = nama;
        this.tanggalLahir = SDF.parse(String.valueOf(tanggalLahir));

        public int hitungUsia (); {
            Calendar tanggalLahir = Calendar.getInstance();
            tanggalLahir.setTime(this.tanggalLahir);
            Calendar hariIni = Calendar.getInstance();

            int selisihTahun = hariIni.get(Calendar.YEAR) - tanggalLahir.get(Calendar.YEAR);

            if (hariIni.get(Calendar.MONTH) < tanggalLahir.get(Calendar.MONTH)) {
                selisihTahun--;
            } else {
                if (hariIni.get(Calendar.MONTH) == tanggalLahir.get(Calendar.MONTH)
                        && hariIni.get(Calendar.DAY_OF_MONTH) < tanggalLahir.get(Calendar.DAY_OF_MONTH)) selisihTahun--;
            }
            return selisihTahun;
        }
    }

    public void menyapa() {
    System.out.println("Hai nama aku : " + this.nama);
    }
}
