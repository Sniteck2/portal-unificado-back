package usuario.causa.service;

import java.util.List;
import usuario.causa.model.EscritoVO;

public interface EscritoService {

  List<EscritoVO> listarPorIdCuaderno(Long idCuaderno);

}
