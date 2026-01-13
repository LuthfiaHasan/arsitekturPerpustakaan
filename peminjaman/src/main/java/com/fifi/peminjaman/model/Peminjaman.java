package com.fifi.peminjaman.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import lombok.Data;
import jakarta.persistence.Id;

@Data
@Entity
@Table(name = "peminjaman")
public class Peminjaman {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // ✅ id auto increment
    private long id;
    private long BukuId;
    private long AnggotaId;
    private long PengembalianId;
    private String tgl_pinjam;
    private String tgl_kembali;
}
