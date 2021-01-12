package usuario.causa.repository;

import java.util.List;
import usuario.causa.repository.model.CuadernoParte;

public interface CuadernoParteDAO {

  List<CuadernoParte> buscarCuadernoPartes(Long idParte);

}
