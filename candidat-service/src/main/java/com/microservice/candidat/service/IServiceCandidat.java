package com.microservice.candidat.service;

import com.microservice.candidat.entity.Candidat;

import java.util.List;

public interface IServiceCandidat {

     public List<Candidat> allCandidaits();
     public  Candidat addCandidat(Candidat c);
     public Candidat getById(Long id);

}
