package com.fifi.peminjaman.vo;

import com.fifi.peminjaman.model.Peminjaman;

public class ResponseTemplate {
    private Peminjaman peminjaman;
    private Pengembalian pengembalian;
    private Anggota anggota;
    private Buku buku;

    public ResponseTemplate() {}

    public ResponseTemplate(Peminjaman peminjaman, Pengembalian pengembalian, Anggota anggota, Buku buku) {
        this.peminjaman = peminjaman;
        this.pengembalian = pengembalian;
        this.anggota = anggota;
        this.buku = buku;
    }

    // Getter & Setter
    public Peminjaman getPeminjaman() {
        return peminjaman;
    }

    public void setPeminjaman(Peminjaman peminjaman) {
        this.peminjaman = peminjaman;
    }

    public Pengembalian getPengembalian() {
        return pengembalian;
    }

    public void setPengembalian(Pengembalian pengembalian) {
        this.pengembalian = pengembalian;
    }

    public Anggota getAnggota() {
        return anggota;
    }

    public void setAnggota(Anggota anggota) {
        this.anggota = anggota;
    }

    public Buku getBuku() {
        return buku;
    }

    public void setBuku(Buku buku) {
        this.buku = buku;
    }
}
