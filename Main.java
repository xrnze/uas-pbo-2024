package uas_karyawan;

import uas_karyawan.pegawai.PegawaiInterface;

abstract class Pegawai implements PegawaiInterface {
    public void hitungGaji() {
       System.out.println("hitung gaji");
        
    }

    public void presensiKeluar(int jam) {
        System.out.println("presensi keluar");
        
    }

    public void presensiMasuk(int jam) {
        System.out.println("presensi keluar");        
    }
   
}




public class Main {

    public static void main(String[] args) {
        Supervisor supervisor = new Supervisor();
        supervisor.setJumlahAnak(2);
        supervisor.setSudahMenikah(true);
        supervisor.presensiMasuk(7);
        supervisor.presensiKeluar(18);
        supervisor.hitungGaji();
    }
    
}
