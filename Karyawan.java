package uas_karyawan;

import java.text.NumberFormat;
import java.util.Locale;

public class Karyawan {
     private int gajiPokok =  1500000;
    private int transport = 250000;
    private int lembur = 5000;
    private int tunjanganIstri = 200000;
    private int tunjanganAnak = 60000 ;
    private int tunjanganAnak2 = 130000;
    private String kode =  "KRY";
    private int jamMasuk;
    private int jamKeluar;
    private int jumlahAnak;
    private boolean sudahMenikah = false;
    Locale locale = new Locale("id", "Id");
    NumberFormat fmt = NumberFormat.getCurrencyInstance(locale);


    public void hitungGaji() {
        int lamaKerja = this.jamKeluar - this.jamMasuk;
        int tunjanganAnak = 0;
        int uangLembur = 0;
        int gajiPokok = this.gajiPokok;
        int tunjanganIstri = 0;

        if (this.jamMasuk > 7 || this.jamKeluar < 16) {
            int jam = 0;
            if (this.jamMasuk > 7) {
                jam = this.jamMasuk - 7;
            } else {
                jam = 16 - this.jamKeluar;
            }
            

            gajiPokok = gajiPokok - (100000 * jam);
            System.out.println("Total potongan adalah " + fmt.format(100000 * jam));
        }

        if (this.jamKeluar > 16 && this.jamMasuk == 7) {
            uangLembur = this.lembur * (lamaKerja - 9);
            System.out.println("Total uang lembur adalah " + fmt.format(uangLembur));
        }

        
        if (this.jumlahAnak > 1) {
            tunjanganAnak = this.tunjanganAnak2;
            System.out.println("Total tunjangan anak adalah " + fmt.format(tunjanganAnak));
        } else {
            tunjanganAnak = this.tunjanganAnak;
            System.out.println("Total tunjangan anak adalah " + fmt.format(tunjanganAnak));
        }

        if (sudahMenikah) {
            tunjanganIstri = this.tunjanganIstri;
            System.out.println("Total tunjangan istri adalah " + fmt.format(tunjanganIstri));
        }

        System.out.println("Total tunjangan transport adalah " + fmt.format(this.transport));
        System.out.println("Total gaji pokok adalah " + fmt.format(this.gajiPokok));


        int total = gajiPokok + this.transport + uangLembur + tunjanganIstri + tunjanganAnak;

        System.out.println("Total gaji adalah " + fmt.format(total));
    }   

    public void presensiKeluar(int jam) {
        this.jamKeluar = jam;
        
    }

    public void presensiMasuk(int jam) {
        this.jamMasuk = jam;        
    }

    public int getJumlahAnak() {
        return this.jumlahAnak;
    }

    public void setJumlahAnak(int jumlahAnak) {
        this.jumlahAnak = jumlahAnak;
    }

    public int getSudahMenikah() {
        return jumlahAnak;
    }

    public void setSudahMenikah(boolean status) {
        this.sudahMenikah = status;
    }
}
