package SpringBoot.SpringBootV2.Interface;

import SpringBoot.SpringBootV2.model.Estado;

import java.util.List;

public interface IEstadoService {
    public List<Estado> obtenerEstadosPorIdPais(Long id);
}
