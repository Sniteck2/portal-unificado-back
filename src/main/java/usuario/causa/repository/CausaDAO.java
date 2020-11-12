package usuario.causa.repository;

import usuario.causa.repository.model.Causa;

public interface CausaDAO {

  Causa buscarCausa(Long rolCausa, String eraCausa, char tipoCausa, Long idTribunal, Long idCompetencia);

}
