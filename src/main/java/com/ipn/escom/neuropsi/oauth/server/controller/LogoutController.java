package com.ipn.escom.neuropsi.oauth.server.controller;

import com.ipn.escom.neuropsi.oauth.server.controller.api.LogoutApi;
import com.ipn.escom.neuropsi.oauth.server.entity.OauthAccessToken;
import com.ipn.escom.neuropsi.oauth.server.repository.OauthAccessTokenRepository;
import com.ipn.escom.neuropsi.oauth.server.repository.OauthRefreshTokenRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@AllArgsConstructor
public class LogoutController implements LogoutApi {

    private final OauthAccessTokenRepository oauthAccessTokenRepository;
    private final OauthRefreshTokenRepository oauthRefreshTokenRepository;

    @Override
    public ResponseEntity<Boolean> logout(Principal principal) {
        OauthAccessToken oauthAccessToken = oauthAccessTokenRepository.findByUserName(principal.getName()).orElse(null);
        if (oauthAccessToken == null) return ResponseEntity.ok(false);
        String refreshToken = oauthAccessToken.getRefreshToken();
        oauthRefreshTokenRepository.deleteById(refreshToken);
        oauthAccessTokenRepository.deleteById(oauthAccessToken.getAuthenticationId());
        return ResponseEntity.ok(true);
    }
}
