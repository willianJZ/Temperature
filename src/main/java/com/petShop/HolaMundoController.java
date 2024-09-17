package com.petShop;

import com.petShop.domain.service.PetService;
import com.petShop.persistence.entity.Pet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/saludar")
public class HolaMundoController {

    @GetMapping("/hola")
    public String saludar(){
        return "Hola Mundo ADSO";
    }

    @GetMapping("/adios")
    public String adios(){
        return " Nos vemos ADSO";
    }

}
