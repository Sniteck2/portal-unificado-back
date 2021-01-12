package usuario.causa.service;

import java.util.List;
import usuario.causa.model.CuadernoParteVO;

public interface CuadernoParteService {

  List<CuadernoParteVO> buscarCuadernoPartes(Long idParte);

}
