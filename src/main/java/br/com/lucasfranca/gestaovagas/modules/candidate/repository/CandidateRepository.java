package br.com.lucasfranca.gestaovagas.modules.candidate.repository;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.lucasfranca.gestaovagas.modules.candidate.entities.CandidateEntity;

public interface CandidateRepository extends JpaRepository<CandidateEntity, UUID> {

  Optional<CandidateEntity> findByUsernameOrEmail(String username, String email);

}
