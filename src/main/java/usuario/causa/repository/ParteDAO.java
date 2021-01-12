package usuario.causa.repository;

import java.util.List;
import usuario.causa.repository.model.Parte;

public interface ParteDAO {

  List<Parte> buscarPartes(Long idUsuario, List<Long> competencias);

}
