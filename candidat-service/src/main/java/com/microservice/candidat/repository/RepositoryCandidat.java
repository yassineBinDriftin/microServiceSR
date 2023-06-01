package com.microservice.candidat.repository;

import com.microservice.candidat.entity.Candidat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryCandidat extends CrudRepository<Candidat , Long> {
}
