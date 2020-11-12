package usuario.causa.service.impl;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import usuario.causa.model.TribunalVO;
import usuario.causa.repository.TribunalDAO;
import usuario.causa.repository.model.Tribunal;
import usuario.causa.service.TribunalService;

@Service
public class TribunalServiceImpl implements TribunalService {

  private final TribunalDAO tribunalDAO;

  @Autowired
  public TribunalServiceImpl(TribunalDAO tribunalDAO) {
    this.tribunalDAO = tribunalDAO;
  }

  @Override
  public List<TribunalVO> listarTribunales() {
    List<Tribunal> tribunals = this.tribunalDAO.listarTribunales();
    List<TribunalVO> tribunalVOS = new ArrayList<>();
    if(tribunals.size() > 0){
      tribunals.forEach(tribunal ->{
        TribunalVO tribunalVO = new TribunalVO();
        tribunalVO.setId(tribunal.getId());
        tribunalVO.setCodCorte(tribunal.getCodCorte());
        tribunalVO.setTipJuridisccion(tribunal.getTipJuridisccion());
        tribunalVO.setGlosa(tribunal.getGlosa());
        tribunalVO.setFlgActivo(tribunal.getFlgActivo());
        tribunalVOS.add(tribunalVO);
      });
    }
    return tribunalVOS;
  }
}
