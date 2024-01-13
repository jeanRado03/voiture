package com.vente.voiture.controller;


import com.vente.voiture.model.Utilisateur;
import com.vente.voiture.repository.UtilisateurRepository;
import com.vente.voiture.security.AuthenticationRequest;
import com.vente.voiture.security.AuthenticationResponse;
import com.vente.voiture.security.AuthenticationService;
import com.vente.voiture.security.RegisterRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/user")
@CrossOrigin(origins = "*", allowedHeaders = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE })
public class UtilisateurController {
    @Autowired
    private UtilisateurRepository utilisateurRepository;
    private final AuthenticationService authenticationService;

    @PostMapping("/register")
    public ResponseEntity<AuthenticationResponse> register(@RequestBody RegisterRequest request) {
        return ResponseEntity.ok(authenticationService.register(request));
    }

    @PostMapping("/authenticate")
    public ResponseEntity<?> authenticate(@RequestBody AuthenticationRequest request) {
        AuthenticationResponse response = authenticationService.authenticate(request);
        if (response.getToken() != null && !response.getToken().isEmpty()) {
            return ResponseEntity.ok(response);
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Token vide ou non valide");
        }
        //return ResponseEntity.ok(authenticationService.authenticate(request));
    }

    @PostMapping("/saveUser")
    public void saveUser(@RequestBody Utilisateur utilisateur) {
        int sequence = utilisateurRepository.getNextval();
        utilisateur.setId_user(utilisateurRepository.getSequence(5,"USR",sequence));
        utilisateurRepository.save(utilisateur);
    }

    @GetMapping("/users")
    public List<Utilisateur> getAllUser() {
        return utilisateurRepository.findAll();
    }
}
