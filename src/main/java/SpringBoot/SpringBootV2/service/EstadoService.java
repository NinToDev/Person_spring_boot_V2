package SpringBoot.SpringBootV2.service;

import SpringBoot.SpringBootV2.Interface.IEstadoService;
import SpringBoot.SpringBootV2.model.Estado;
import SpringBoot.SpringBootV2.repository.EstadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EstadoService implements IEstadoService {
    @Autowired
    private EstadoRepository estadoRepository;

    @Override
    public List<Estado> obtenerEstadosPorIdPais(Long id) {
        List<Estado> todosEstados = estadoRepository.findAll();
        List<Estado> estados = new ArrayList<Estado>();
        for (Estado i : todosEstados) {
            if (i.getPais_id() == id) {
                estados.add(i);
            }
        }
        return estados;
    }
}
