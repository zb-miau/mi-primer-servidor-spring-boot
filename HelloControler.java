package com.example.MiPrimerServidorWeb;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class HelloControler {
    @GetMapping("/hello")
    public String hello(){
        return "Hola desde mi controlador SpringBoost";
    }

    @GetMapping("/saludo")
    public String saludar(@RequestParam String nombre){
        return "Hora " + nombre + " este es mi servidor de aplicacion :)";
    }

    @PostMapping("/mensaje")
    public String recibirMensaje(@RequestBody String mensaje){
        return "recibi tu mensaje " + mensaje;
    }

}
