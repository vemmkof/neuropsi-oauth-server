package com.ipn.escom.neuropsi.oauth.server.dto;

import com.ipn.escom.neuropsi.commons.entity.User;
import lombok.Builder;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

@Builder
public class UserDetailsImpl implements UserDetails {

    private static final long serialVersionUID = -560423666058377695L;
    private final User user;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return Arrays.asList(user.getRole()).stream()
                .map(role -> new SimpleGrantedAuthority(role.toString())).collect(Collectors.toList());
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
