package SpringBoot.SpringBootV2.Controller;


import SpringBoot.SpringBootV2.Routes.InternalRoutes;
import SpringBoot.SpringBootV2.model.Persona;
import SpringBoot.SpringBootV2.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping(InternalRoutes.PERSONA)

public class PersonController {

    @Autowired
    private PersonaService personaService;

    @GetMapping(value = "/{id}")
    private ResponseEntity<Optional<Persona>> getPerson(@PathVariable("id") Long id){
        Optional<Persona> persona = personaService.findById(id);
        return ResponseEntity.ok(persona);
    }

    @GetMapping
    private ResponseEntity<List<Persona>> getAllPerson(){
        List<Persona> personList = personaService.list();
        return ResponseEntity.ok(personList);
    }

    private ResponseEntity<Persona> createPerson(@RequestBody Persona persona){
            Persona oPersona = personaService.create(persona);
            return ResponseEntity.ok(oPersona);
    }
}
