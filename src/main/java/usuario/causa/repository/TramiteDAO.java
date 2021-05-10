package usuario.causa.repository;

import java.util.List;
import usuario.causa.repository.model.Tramite;

public interface TramiteDAO {

  List<Tramite> listarPorIdCausa(Long idCausa);

}
