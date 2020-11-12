package usuario.causa.repository;

import java.util.List;
import usuario.causa.repository.model.CompetenciaTipoCausa;
import usuario.causa.repository.model.TipoCausa;

public interface CompetenciaTipoCausaDAO {

  List<CompetenciaTipoCausa> listarTipoCausaPorCompetencia(Long idCompetencia);

}
