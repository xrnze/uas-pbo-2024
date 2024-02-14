package uas_karyawan.pegawai;

/**
 * Karyawan
 */
public interface PegawaiInterface {
    public void presensiMasuk(int jam);
    public void presensiKeluar(int jam);
    public void hitungGaji();
}