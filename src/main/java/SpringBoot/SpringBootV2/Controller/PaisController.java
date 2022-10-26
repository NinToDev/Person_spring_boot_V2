package SpringBoot.SpringBootV2.Controller;

import SpringBoot.SpringBootV2.Routes.InternalRoutes;
import SpringBoot.SpringBootV2.model.Pais;
import SpringBoot.SpringBootV2.service.PaisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping(InternalRoutes.PAIS)
public class PaisController {

    @Autowired
    private PaisService paisService;

    @GetMapping
    private ResponseEntity<List<Pais>> getAll(){
        List<Pais> oPais = paisService.obtenerPaises();
        return ResponseEntity.ok(oPais);
    }
}
