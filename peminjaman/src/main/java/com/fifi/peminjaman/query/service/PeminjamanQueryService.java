package com.fifi.peminjaman.query.service;

import com.fifi.peminjaman.model.Peminjaman;
import com.fifi.peminjaman.repository.PeminjamanRepository;
import com.fifi.peminjaman.vo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
// UPDATE PEMINJAMAN
// SET
//   ANGGOTA_ID = 2,
//   BUKU_ID = 2,
//   PENGEMBALIAN_ID = 2
// WHERE ID = 2;   

@Service
public class PeminjamanQueryService {

    @Autowired
    private PeminjamanRepository peminjamanRepository;

    @Autowired
    private RestTemplate restTemplate;

    public List<Peminjaman> getAllPeminjaman() {
        return peminjamanRepository.findAll();
    }

    public Peminjaman getPeminjamanById(Long id) {
        return peminjamanRepository.findById(id).orElse(null);
    }

    public ResponseTemplate getPeminjamanWithDetailsById(Long peminjamanId) {
        Peminjaman peminjaman = getPeminjamanById(peminjamanId);
        if (peminjaman == null) return null;

        ResponseTemplate vo = new ResponseTemplate();
        vo.setPeminjaman(peminjaman);

        try {
            vo.setBuku(restTemplate.getForObject("http://BUKU/api/buku/" + peminjaman.getBukuId(), Buku.class));
        } catch (Exception e) { vo.setBuku(null); }

        try {
            vo.setAnggota(restTemplate.getForObject("http://ANGGOTA/api/anggota/" + peminjaman.getAnggotaId(), Anggota.class));
        } catch (Exception e) { vo.setAnggota(null); }

        try {
            vo.setPengembalian(restTemplate.getForObject("http://PENGEMBALIAN/api/pengembalian/" + peminjaman.getPengembalianId(), Pengembalian.class));
        } catch (Exception e) { vo.setPengembalian(null); }

        return vo;
    }
}
