package com.fifi.peminjaman.vo;

public class Anggota {
    private Long id;
    private String nama;
    private String alamat;
    private String nim;
    private String jenis_kelamin;

    public Anggota() {
    }
    public Anggota(Long id, String nama, String alamat, String nim, String jenis_kelamin) {
        this.id = id;
        this.nama = nama;
        this.alamat = alamat;
        this.nim = nim;
        this.jenis_kelamin = jenis_kelamin;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getAlamat() {
        return alamat;
    }
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    public String getNim() {
        return nim;
    }
    public void setNim(String nim) {
        this.nim = nim;
    }
    public String getJenis_kelamin() {
        return jenis_kelamin;
    }
    public void setJenis_kelamin(String jenis_kelamin) {
        this.jenis_kelamin = jenis_kelamin;
    }
    @Override
    public String toString() {
        return super.toString();
    }
}