package usuario.causa.service;

import java.util.List;
import usuario.causa.model.TribunalVO;

public interface TribunalCompetenciaService {

  List<TribunalVO> listarTribunalPorCompetencia(Long idCompetencia);

}
