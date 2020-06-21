package com.ipn.escom.neuropsi.oauth.server.repository;

import com.ipn.escom.neuropsi.commons.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByUsername(String username);


}
