package usuario.causa.service;

import java.util.List;
import usuario.causa.model.ParteVO;

public interface ParteService {

  List<ParteVO> buscarPartes(Long idUsuario, List<Long> competencias);

}
