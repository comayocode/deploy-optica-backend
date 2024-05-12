package com.opticamejia.app.controllers;

import com.opticamejia.app.models.UserModel;
import com.opticamejia.app.repositories.UserRepository;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    // --- Obtener nombre de usuario logeado ---
    @GetMapping()
    public Collection<? extends GrantedAuthority> getName(@AuthenticationPrincipal UserModel user) {
        return null;
    }
}
