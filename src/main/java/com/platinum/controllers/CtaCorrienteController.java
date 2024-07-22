package com.platinum.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.platinum.models.CtaCorriente;
import com.platinum.services.CtaCorrienteService;

@Controller
public class CtaCorrienteController {
    @Autowired
    private CtaCorrienteService ctaCorrienteService;

    @GetMapping("/cta_corriente")
    public String showCtaCorrienteForm(Model model) {
        model.addAttribute("ctaCorriente", new CtaCorriente());
        return "cta_corriente";
    }

    @PostMapping("/cta_corriente")
    public String submitCtaCorrienteForm(CtaCorriente ctaCorriente) {
        ctaCorrienteService.createCtaCorriente(ctaCorriente);
        return "redirect:/cta_corriente";
    }
}