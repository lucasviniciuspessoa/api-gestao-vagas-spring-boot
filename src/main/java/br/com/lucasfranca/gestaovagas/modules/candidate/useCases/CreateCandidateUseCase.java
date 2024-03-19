package br.com.lucasfranca.gestaovagas.modules.candidate.useCases;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.lucasfranca.gestaovagas.exceptions.UserFoundException;
import br.com.lucasfranca.gestaovagas.modules.candidate.entities.CandidateEntity;
import br.com.lucasfranca.gestaovagas.modules.candidate.repository.CandidateRepository;

@Service
public class CreateCandidateUseCase {

  @Autowired
  private CandidateRepository candidateRepository;

  public CandidateEntity execute(CandidateEntity candidateEntity) {
    this.candidateRepository.findByUsernameOrEmail(candidateEntity.getUsername(),
        candidateEntity.getEmail()).ifPresent((user) -> {
          throw new UserFoundException();
        });
    return this.candidateRepository.save(candidateEntity);
  }

}
