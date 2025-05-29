package com.ms_login.Response;

public class LoginResponse {
    private String perfil;
    private String mensagem;

    public LoginResponse(String perfil, String mensagem) {
        this.perfil = perfil;
        this.mensagem = mensagem;
    }

    public String getPerfil() {
        return perfil;
    }

    public String getMensagem() {
        return mensagem;
    }
}
