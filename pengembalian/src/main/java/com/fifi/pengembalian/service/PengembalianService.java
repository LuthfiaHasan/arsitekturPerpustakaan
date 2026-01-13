package com.fifi.pengembalian.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fifi.pengembalian.model.Pengembalian;
import com.fifi.pengembalian.repository.PengembalianRepository;

@Service
public class PengembalianService {
    @Autowired
    private PengembalianRepository pengembalianRepository;

    @Autowired
    private RestTemplate restTemplate;
    
    public List<Pengembalian> getAllPengembalians() {
        return pengembalianRepository.findAll();
    }
    public Pengembalian getPengembalianById(Long id) {
        return pengembalianRepository.findById(id).orElse(null);
    }
    public Pengembalian createPengembalian(Pengembalian pengembalian) {
        return pengembalianRepository.save(pengembalian);
    }
    public void deletePengembalian(Long id) {
        pengembalianRepository.deleteById(id);
    }
}
