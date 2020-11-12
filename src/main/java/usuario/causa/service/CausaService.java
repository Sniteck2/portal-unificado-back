package usuario.causa.service;

import usuario.causa.model.CausaVO;

public interface CausaService {

  CausaVO buscarCausa(Long rolCausa, String eraCausa, char tipoCausa, Long idTribunal, Long idCompetencia);

}
