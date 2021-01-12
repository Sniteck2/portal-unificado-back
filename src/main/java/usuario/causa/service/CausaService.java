package usuario.causa.service;

import java.util.List;
import usuario.causa.model.CausaVO;

public interface CausaService {

  CausaVO buscarId(Long id);

  CausaVO buscarCausa(Long rolCausa, String eraCausa, char tipoCausa, Long idTribunal, Long idCompetencia);

  List<CausaVO> buscarCausaFecha(List<Long> competencias, String fechaInicio, String fechaFinal);

  List<CausaVO> buscarCausasPorParte(CausaVO causaVO);

}
