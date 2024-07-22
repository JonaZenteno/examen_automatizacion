package com.platinum.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.platinum.models.Usuario;
import com.platinum.services.UsuarioService;

@Controller
public class UsuarioController {
    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/usuario")
    public String showUsuarioForm(Model model) {
        model.addAttribute("usuario", new Usuario());
        return "usuario";
    }

    @PostMapping("/usuario")
    public String submitUsuarioForm(Usuario usuario) {
        usuarioService.createUsuario(usuario);
        return "redirect:/usuario";
    }
}