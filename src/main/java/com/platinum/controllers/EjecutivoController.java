package com.platinum.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.platinum.models.Ejecutivo;
import com.platinum.services.EjecutivoService;

@Controller
public class EjecutivoController {
    @Autowired
    private EjecutivoService ejecutivoService;

    @GetMapping("/ejecutivo")
    public String showEjecutivoForm(Model model) {
        model.addAttribute("ejecutivo", new Ejecutivo());
        return "ejecutivo";
    }

    @PostMapping("/ejecutivo")
    public String submitEjecutivoForm(Ejecutivo ejecutivo) {
        ejecutivoService.createEjecutivo(ejecutivo);
        return "redirect:/ejecutivo";
    }
}