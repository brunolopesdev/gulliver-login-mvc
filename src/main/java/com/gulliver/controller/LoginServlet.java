package com.gulliver.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gulliver.model.Usuario;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nomeUsuario = request.getParameter("nomeUsuario");
        String senha = request.getParameter("senha");

        Usuario usuario = new Usuario("usuario", "senha123");

        boolean autenticado = usuario.autenticar(nomeUsuario, senha);

        if (autenticado) {
            response.sendRedirect("sucesso.jsp");
        } else {
            response.sendRedirect("erro.jsp");
        }
    }
}






