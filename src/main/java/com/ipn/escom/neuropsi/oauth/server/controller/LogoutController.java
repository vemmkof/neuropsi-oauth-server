package com.ipn.escom.neuropsi.oauth.server.controller;

import com.ipn.escom.neuropsi.oauth.server.controller.api.LogoutApi;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@AllArgsConstructor
public class LogoutController implements LogoutApi {
    @Override
    public ResponseEntity<Boolean> logout(Principal principal) {
        return null;
    }
}
