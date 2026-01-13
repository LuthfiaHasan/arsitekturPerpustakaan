package com.fifi.peminjaman.vo;

public class Pengembalian {
    private Long id;
    private String tanggal_dikembalikan;
    private String terlambat;
    private String denda;

    public Pengembalian() {
    }

    public Pengembalian(Long id, String tanggal_dikembalikan, String terlambat, String denda) {
        this.id = id;
        this.tanggal_dikembalikan = tanggal_dikembalikan;
        this.terlambat = terlambat;
        this.denda = denda;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getTanggal_dikembalikan() {
        return tanggal_dikembalikan;
    }
    public void setTanggal_dikembalikan(String tanggal_dikembalikan) {
        this.tanggal_dikembalikan = tanggal_dikembalikan;
    }
    public String getTerlambat() {
        return terlambat;
    }
    public void setTerlambat(String terlambat) {
        this.terlambat = terlambat;
    }
    public String getDenda() {
        return denda;
    }
    public void setDenda(String denda) {
        this.denda = denda;
    }
    @Override
    public String toString() {
        return super.toString();
    }
}