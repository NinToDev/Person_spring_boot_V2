package SpringBoot.SpringBootV2.Controller;


import SpringBoot.SpringBootV2.Routes.InternalRoutes;
import SpringBoot.SpringBootV2.model.Estado;
import SpringBoot.SpringBootV2.service.EstadoService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping(InternalRoutes.ESTADO)
public class EstadoController {

    @Autowired
    private EstadoService estadoService;

    @GetMapping(value = "/{id}")
    private ResponseEntity<List<Estado>> getAllByPaisId(@PathVariable("id") Long id){
        return ResponseEntity.ok(estadoService.obtenerEstadosPorIdPais(id));
    }
}
