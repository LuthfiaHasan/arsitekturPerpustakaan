package com.fifi.peminjaman.command.controller;

import com.fifi.peminjaman.model.Peminjaman;
import com.fifi.peminjaman.command.service.PeminjamanCommandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/command/peminjaman")
public class PeminjamanCommandController {

    @Autowired
    private PeminjamanCommandService peminjamanCommandService;

    @PostMapping
    public Peminjaman createPeminjaman(@RequestBody Peminjaman peminjaman) {
        return peminjamanCommandService.createPeminjaman(peminjaman);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePeminjaman(@PathVariable Long id) {
        peminjamanCommandService.deletePeminjaman(id);
        return ResponseEntity.ok().build();
    }
}
