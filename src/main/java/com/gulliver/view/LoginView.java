package com.gulliver.view;

import java.util.Scanner;

public class LoginView {
    private Scanner scanner;

    public LoginView() {
        scanner = new Scanner(System.in);
    }

    public String solicitarNomeUsuario() {
        System.out.print("Digite o nome de usuário: ");
        return scanner.nextLine();
    }

    public String solicitarSenha() {
        System.out.print("Digite a senha: ");
        return scanner.nextLine();
    }

    public void exibirMensagemAutenticacao(boolean sucesso) {
        if (sucesso) {
            System.out.println("Login bem-sucedido!");
        } else {
            System.out.println("Login falhou. Tente novamente.");
        }
    }

    public void fechar() {
        scanner.close();
    }
}
