package com.microservice.candidat.service;

import com.microservice.candidat.entity.Candidature;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service

public interface CandidatureService {
    public List<Candidature> getAllCandidatures();

    public Optional<Candidature> getCandidatureById(UUID id);

    public Candidature createCandidature(Candidature candidature);

    public Candidature updateCandidature(Candidature candidatureDto, UUID id) throws Exception;

    public void deleteCandidature(UUID id);
}
