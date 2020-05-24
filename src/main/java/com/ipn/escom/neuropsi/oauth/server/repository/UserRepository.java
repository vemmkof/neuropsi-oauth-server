package com.ipn.escom.neuropsi.oauth.server.repository;

import java.util.Optional;

import com.ipn.escom.neuropsi.oauth.server.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

  Optional<User> findByUsername(String username);


}
