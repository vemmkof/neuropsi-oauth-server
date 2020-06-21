package com.ipn.escom.neuropsi.oauth.server.repository;

import com.ipn.escom.neuropsi.commons.entity.OauthAccessToken;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface OauthAccessTokenRepository extends JpaRepository<OauthAccessToken, String> {

    Optional<OauthAccessToken> findByUserName(String userName);

}
