package com.ipn.escom.neuropsi.oauth.server.repository;

import java.util.Optional;

import com.ipn.escom.neuropsi.oauth.server.entity.OauthAccessToken;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OauthAccessTokenRepository extends JpaRepository<OauthAccessToken, String> {

  Optional<OauthAccessToken> findByUserName(String userName);

}
