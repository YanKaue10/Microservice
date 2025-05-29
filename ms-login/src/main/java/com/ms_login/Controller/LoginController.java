package com.ms_login.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Map;

import com.ms_login.Request.LoginRequest;
import com.ms_login.Response.LoginResponse;

@RestController
@RequestMapping("/auten")
public class LoginController {

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody LoginRequest request) {
        if ("admin".equals(request.getUsuario()) && "1234".equals(request.getSenha())) {
            return ResponseEntity.ok(new LoginResponse("admin", "Login Bem Sucedido"));

        } else if ("professor".equals(request.getUsuario()) && "abcd".equals(request.getSenha())) {
            return ResponseEntity.ok(new LoginResponse("professor", "Login Completo com Sucesso"));

        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED)
                    .body(Map.of("mensagem", "Usuário não identificado"));
        }
    }
}
