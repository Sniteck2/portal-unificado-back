package usuario.causa.repository;

import java.util.List;
import usuario.causa.repository.model.TribunalCompetencia;

public interface TribunalCompetenciaDAO {

  List<TribunalCompetencia> listarTribunalPorCompetencia(Long idCompetencia);

}
