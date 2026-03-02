package com.senai.calculadora.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculadora")
public class CalculadoraController {

    @PostMapping("/adicionar")
    public ResponseEntity<String> adicionar() {
        return ResponseEntity.ok().body("");
    }

    @PostMapping("/subtrair")
    public ResponseEntity<String> subtrair() {
        return ResponseEntity.ok().body("");
    }


    @PostMapping("/multiplicar")
    public ResponseEntity<String> multiplicar() {
        return ResponseEntity.ok().body("");
    }

    @PostMapping("/dividir")
    public ResponseEntity<String> dividir() {
        return ResponseEntity.ok().body("");
    }
}
