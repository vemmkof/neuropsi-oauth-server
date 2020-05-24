package com.ipn.escom.neuropsi.oauth.server.dto;

import com.ipn.escom.neuropsi.oauth.server.entity.User;
import lombok.Builder;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;

@Builder
public class UserDetailsImpl implements UserDetails {

    private User user;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getPassword() {
        return user.getPassword();
    }

    @Override
    public String getUsername() {
        return user.getUsername();
    }

    @Override
    public boolean isAccountNonExpired() {
        return !user.isExpiredAccount();
    }

    @Override
    public boolean isAccountNonLocked() {
        return !user.isLockedAccount();
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return !user.isExpiredCredentials();
    }

    @Override
    public boolean isEnabled() {
        return user.isEnabled();
    }
}
