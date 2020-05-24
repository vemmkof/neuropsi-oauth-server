package com.ipn.escom.neuropsi.oauth.server.entity;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Past;
import javax.validation.constraints.Positive;

import com.ipn.escom.neuropsi.oauth.server.entity.values.Gender;
import com.ipn.escom.neuropsi.oauth.server.entity.values.Role;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class User implements Serializable {

  private static final long serialVersionUID = 5084202603438255147L;

  @Id
  @Column(nullable = false)
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Positive
  private Long idUser;

  @Email
  @NotBlank
  @Column(nullable = false)
  private String username;

  @NotEmpty
  @Min(value = 8)
  @JsonProperty(access = Access.WRITE_ONLY)
  @Column(nullable = false)
  private String password;

  @NotEmpty
  @Column(nullable = false)
  private String name;

  @NotEmpty
  @Column(nullable = false)
  private String lastName;

  @Column(nullable = true)
  private String secondLastName;

  @Past
  @Column(nullable = false)
  private Date dateOfBirth;

  @NotEmpty
  @Column(nullable = false)
  private String phone;

  @NotEmpty
  @Enumerated(EnumType.STRING)
  @Column(nullable = false)
  private Gender gender;

  @NotEmpty
  @Enumerated(EnumType.STRING)
  @Column(nullable = false)
  private Role role;

  @Builder.Default
  @Column(nullable = false, columnDefinition = "BOOLEAN DEFAULT false")
  private boolean expiredAccount = false;

  @Builder.Default
  @Column(nullable = false, columnDefinition = "BOOLEAN DEFAULT false")
  private boolean lockedAccount = false;

  @Builder.Default
  @Column(nullable = false, columnDefinition = "BOOLEAN DEFAULT false")
  private boolean expiredCredentials = false;

  @Builder.Default
  @Column(nullable = false, columnDefinition = "BOOLEAN DEFAULT false")
  private boolean enabled = false;

  @CreationTimestamp
  @Column(nullable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
  private Timestamp created;

  @UpdateTimestamp
  private Timestamp updated;

}

