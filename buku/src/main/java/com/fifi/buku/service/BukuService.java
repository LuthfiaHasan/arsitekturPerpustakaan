package com.fifi.buku.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fifi.buku.model.Buku;
import com.fifi.buku.repository.BukuRepository;

@Service

public class BukuService {
    @Autowired
    private BukuRepository bukuRepository;

    @Autowired
    private RestTemplate restTemplate;

    public List<Buku> getAllBuku() {
        return bukuRepository.findAll();
    }

    public Buku getBukuById(Long id) {
        return bukuRepository.findById(id).orElse(null);
    }

    public Buku createBuku(Buku buku) {
        return bukuRepository.save(buku);
    }
    public Buku updateBuku(Long id, Buku bukuBaru) {
    Buku buku = bukuRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Buku tidak ditemukan"));

    buku.setJudul(bukuBaru.getJudul());
    buku.setPengrang(bukuBaru.getPengrang());
    buku.setPenerbit(bukuBaru.getPenerbit());
    buku.setTahun_terbit(bukuBaru.getTahun_terbit());

    return bukuRepository.save(buku);
}


    public void deleteBuku(Long id) {
        bukuRepository.deleteById(id);
    }
}