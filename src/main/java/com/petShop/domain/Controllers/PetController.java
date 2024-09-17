package com.petShop.domain.Controllers;

import com.petShop.domain.service.PetService;
import com.petShop.persistence.entity.Pet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RestController
@RequestMapping("/api/pets")
public class PetController {

    @Autowired
    private PetService petService;

    @GetMapping
    public List<Pet> obtenerTodasLasMascotas() {
        return petService.obtenerTodasLasMascotas();
    }
}



