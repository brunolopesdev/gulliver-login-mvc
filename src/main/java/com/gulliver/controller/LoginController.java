package com.gulliver.controller;

import com.gulliver.model.Usuario;
import com.gulliver.view.LoginView;

public class LoginController {
    private Usuario usuario;
    private LoginView loginView;

    public LoginController(Usuario usuario, LoginView loginView) {
        this.usuario = usuario;
        this.loginView = loginView;
    }

    public void realizarLogin() {
        String nomeUsuario = loginView.solicitarNomeUsuario();
        String senha = loginView.solicitarSenha();

        boolean autenticado = usuario.autenticar(nomeUsuario, senha);
        loginView.exibirMensagemAutenticacao(autenticado);
    }
}
