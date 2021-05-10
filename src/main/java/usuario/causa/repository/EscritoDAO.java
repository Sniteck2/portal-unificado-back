package usuario.causa.repository;

import java.util.List;
import usuario.causa.repository.model.Escrito;

public interface EscritoDAO {

  List<Escrito> buscarPorIdCuaderno(Long idCuaderno);

}
