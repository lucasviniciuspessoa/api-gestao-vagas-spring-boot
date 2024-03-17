package br.com.lucasfranca.gestaovagas.modules.candidate.entities;

import java.util.UUID;

import org.hibernate.validator.constraints.Length;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
public class CandidateEntity {

  private UUID id;
  @NotBlank()
  private String name;
  @Pattern(regexp = "\\S+", message = "O campo username não deve conter espaços")
  private String username;
  @Email(message = "Preencha um e-mail válido")
  private String email;
  @Length(min = 6, max = 50)
  private String password;
  private String description;
  private String curriculum;

}
