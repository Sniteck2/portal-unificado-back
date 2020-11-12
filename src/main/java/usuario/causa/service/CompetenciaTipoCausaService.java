package usuario.causa.service;

import java.util.List;
import usuario.causa.model.TipoCausaVO;

public interface CompetenciaTipoCausaService {

  List<TipoCausaVO> listarTipoCausaPorCompetencia(Long idCompetencia);

}
