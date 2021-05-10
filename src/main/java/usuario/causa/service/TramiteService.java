package usuario.causa.service;

import java.util.List;
import usuario.causa.model.TramiteVO;

public interface TramiteService {

  List<TramiteVO> listarPorIdCausa(Long idCausa);

}
