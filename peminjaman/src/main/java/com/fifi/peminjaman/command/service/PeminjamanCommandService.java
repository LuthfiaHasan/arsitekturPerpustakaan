package com.fifi.peminjaman.command.service;

import com.fifi.peminjaman.model.Peminjaman;
import com.fifi.peminjaman.repository.PeminjamanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PeminjamanCommandService {

    @Autowired
    private PeminjamanRepository peminjamanRepository;

    public Peminjaman createPeminjaman(Peminjaman peminjaman) {
        return peminjamanRepository.save(peminjaman);
    }

    public void deletePeminjaman(Long id) {
        peminjamanRepository.deleteById(id);
    }
}
