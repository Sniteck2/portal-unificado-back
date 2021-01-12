package usuario.causa.service.impl;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import usuario.causa.model.CuadernoParteVO;
import usuario.causa.model.CuadernoVO;
import usuario.causa.repository.CuadernoParteDAO;
import usuario.causa.repository.model.Cuaderno;
import usuario.causa.repository.model.CuadernoParte;
import usuario.causa.service.CuadernoParteService;

@Service
public class CuadernoParteServiceImpl implements CuadernoParteService {

  private final CuadernoParteDAO cuadernoParteDAO;

  @Autowired
  public CuadernoParteServiceImpl(CuadernoParteDAO cuadernoParteDAO) {
    this.cuadernoParteDAO = cuadernoParteDAO;
  }

  @Override
  public List<CuadernoParteVO> buscarCuadernoPartes(Long idParte) {
    List<CuadernoParteVO> cuadernoParteVOS = new ArrayList<>();
    List<CuadernoParte> cuadernoPartes = this.cuadernoParteDAO.buscarCuadernoPartes(idParte);

    if(!cuadernoPartes.isEmpty()){
      cuadernoPartes.forEach(cuadernoParte -> {
        CuadernoParteVO cuadernoParteVO = new CuadernoParteVO();
        CuadernoVO cuadernoVO = new CuadernoVO();
        cuadernoVO.setId(cuadernoParte.getCuaderno().getId());
        cuadernoParteVO.setCuadernoVO(cuadernoVO);
        cuadernoParteVOS.add(cuadernoParteVO);
      });
    }

    return cuadernoParteVOS;
  }
}
