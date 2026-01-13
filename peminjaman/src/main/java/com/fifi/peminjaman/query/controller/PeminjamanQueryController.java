package com.fifi.peminjaman.query.controller;

import com.fifi.peminjaman.model.Peminjaman;
import com.fifi.peminjaman.query.service.PeminjamanQueryService;
import com.fifi.peminjaman.vo.ResponseTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/query/peminjaman")
public class PeminjamanQueryController {

    @Autowired
    private PeminjamanQueryService peminjamanQueryService;

    @GetMapping
    public List<Peminjaman> getAllPeminjaman() {
        return peminjamanQueryService.getAllPeminjaman();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Peminjaman> getPeminjamanById(@PathVariable Long id) {
        Peminjaman peminjaman = peminjamanQueryService.getPeminjamanById(id);
        return peminjaman != null ? ResponseEntity.ok(peminjaman) : ResponseEntity.notFound().build();
    }

    @GetMapping("/{id}/details")
    public ResponseEntity<ResponseTemplate> getPeminjamanWithDetailsById(@PathVariable("id") Long id) {
        ResponseTemplate response = peminjamanQueryService.getPeminjamanWithDetailsById(id);
        if (response == null || response.getPeminjaman() == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(response);
    }
}
