package com.microservice.candidat.controller;

import com.microservice.candidat.entity.Candidat;
import com.microservice.candidat.service.IServiceCandidat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "GestionCandidat")
public class ControllerCandidat {
    @Autowired
    IServiceCandidat serviceCandidat ;
    @PostMapping("/addCandidat")
    public Candidat addCandidat(@RequestBody Candidat c ) {
        return serviceCandidat.addCandidat(c) ;
    }
    @GetMapping("/getAll")
    public List<Candidat> getAllCandidats(){
        return serviceCandidat.allCandidaits() ;
    }
}
