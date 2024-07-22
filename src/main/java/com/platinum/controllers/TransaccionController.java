package com.platinum.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.platinum.models.Transaccion;
import com.platinum.services.TransaccionService;

@Controller
public class TransaccionController {
    @Autowired
    private TransaccionService transaccionService;

    @GetMapping("/transaccion")
    public String showTransaccionForm(Model model) {
        model.addAttribute("transaccion", new Transaccion());
        return "transaccion";
    }

    @PostMapping("/transaccion")
    public String submitTransaccionForm(Transaccion transaccion) {
        transaccionService.createTransaccion(transaccion);
        return "redirect:/transaccion";
    }
}