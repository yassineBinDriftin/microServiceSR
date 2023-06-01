package com.microservice.candidat.repository;

import com.microservice.candidat.entity.Candidature;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository

public interface CandidatureRepository extends JpaRepository<Candidature, UUID> {
}
