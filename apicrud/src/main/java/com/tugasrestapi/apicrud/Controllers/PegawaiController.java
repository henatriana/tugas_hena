package com.tugasrestapi.apicrud.Controllers;

import com.tugasrestapi.apicrud.Entities.PegawaiEntity;
import com.tugasrestapi.apicrud.Repositories.PegawaiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/pegawai")
public class PegawaiController {

    @Autowired
    PegawaiRepository pegawaiRepository;

    // Create
    @PostMapping(value = "addPegawai")
    public PegawaiEntity addPegawai(@RequestBody PegawaiEntity param) {

        pegawaiRepository.save(param);
        return param;
    }

    // Retrieve
    @GetMapping(value = "getAllPegawai")
    public List<PegawaiEntity> getAllPegawai() {

        return pegawaiRepository.findAll();
    }

    @GetMapping(value = "getById")
    public PegawaiEntity getById(@RequestParam int id) {

        return pegawaiRepository.findById(id).get();
    }

    // Update
    @PostMapping(value = "updatePegawai")
    public PegawaiEntity updatePegawai(@RequestBody PegawaiEntity param) {

        return pegawaiRepository.save(param);
    }

    // Delete
    @GetMapping(value = "deletePegawai")
    public List<PegawaiEntity> deletePegawai(@RequestParam int id) {

        pegawaiRepository.deleteById(id);

        List<PegawaiEntity> listPegawai = pegawaiRepository.findAll();
        return listPegawai;
    }

}
