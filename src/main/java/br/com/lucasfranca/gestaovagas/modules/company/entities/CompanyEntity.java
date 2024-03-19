package br.com.lucasfranca.gestaovagas.modules.company.entities;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.validator.constraints.Length;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Entity(name = "company")
@Data
public class CompanyEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  private UUID id;
  @NotBlank()
  @Pattern(regexp = "\\S+", message = "O campo username não deve conter espaços")
  private String username;

  @Email(message = "Preencha um e-mail válido")
  private String email;

  @Length(min = 6, max = 50)

  private String password;
  private String website;
  private String name;
  private String description;

  @CreationTimestamp
  private LocalDateTime created_at;

}
