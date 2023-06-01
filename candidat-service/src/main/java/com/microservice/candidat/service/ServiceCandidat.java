package com.microservice.candidat.service;

import com.microservice.candidat.entity.Candidat;
import com.microservice.candidat.repository.RepositoryCandidat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ServiceCandidat  implements IServiceCandidat{


    @Autowired
    RepositoryCandidat candidatRepository  ;

    @Override
    public List<Candidat> allCandidaits() {
        return (List<Candidat>) candidatRepository.findAll();
    }

    @Override
    public Candidat addCandidat(Candidat c) {
        return candidatRepository.save(c);
    }

    @Override
    public Candidat getById(Long id) {
        return null;
    }
}
