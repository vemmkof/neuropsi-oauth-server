package com.ipn.escom.neuropsi.oauth.server.repository;

import com.ipn.escom.neuropsi.commons.entity.OauthRefreshToken;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OauthRefreshTokenRepository extends JpaRepository<OauthRefreshToken, String> {

}
