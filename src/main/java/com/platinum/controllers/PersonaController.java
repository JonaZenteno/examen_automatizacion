package com.platinum.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.platinum.models.Persona;
import com.platinum.services.PersonaService;

@Controller
public class PersonaController {
    @Autowired
    private PersonaService personaService;

    @GetMapping("/persona")
    public String showPersonaForm(Model model) {
        model.addAttribute("persona", new Persona());
        return "persona";
    }

    @PostMapping("/persona")
    public String submitPersonaForm(Persona persona) {
        personaService.createPersona(persona);
        return "redirect:/persona";
    }
}