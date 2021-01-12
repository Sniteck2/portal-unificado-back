package usuario.causa.repository;

import java.util.List;
import usuario.causa.repository.model.Causa;

public interface CausaDAO {

  Causa buscarId(Long id);

  Causa buscarCausa(Long rolCausa, String eraCausa, char tipoCausa, Long idTribunal, Long idCompetencia);

  List<Causa> buscarCausaFecha(List<Long> idCompetencia, String fechaInicio, String fechaFinal);

}
