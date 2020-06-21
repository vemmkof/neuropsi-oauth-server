package com.ipn.escom.neuropsi.oauth.server.service;

import com.ipn.escom.neuropsi.commons.entity.User;
import com.ipn.escom.neuropsi.oauth.server.dto.UserDetailsImpl;
import com.ipn.escom.neuropsi.oauth.server.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserDetailsServiceImpl implements UserDetailsService {

    private final UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository
                .findByUsername(username)
                .orElseThrow(() -> new UsernameNotFoundException("User was not found"));
        return UserDetailsImpl.builder().user(user).build();
    }
}
