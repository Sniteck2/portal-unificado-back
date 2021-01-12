package usuario.causa.service.impl;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import usuario.causa.model.CausaVO;
import usuario.causa.model.CompetenciaVO;
import usuario.causa.model.CuadernoParteVO;
import usuario.causa.model.CuadernoVO;
import usuario.causa.model.ParteVO;
import usuario.causa.model.TribunalVO;
import usuario.causa.repository.CausaDAO;
import usuario.causa.repository.model.Causa;
import usuario.causa.repository.model.CuadernoParte;
import usuario.causa.repository.model.Parte;
import usuario.causa.service.CausaService;
import usuario.causa.service.CuadernoParteService;
import usuario.causa.service.CuadernoService;
import usuario.causa.service.ParteService;

@Service
public class CausaServiceImpl implements CausaService {

  private final CausaDAO causaDAO;
  private final ParteService parteService;
  private final CuadernoService cuadernoService;
  private final CuadernoParteService cuadernoParteService;

  @Autowired
  public CausaServiceImpl(CausaDAO causaDAO, ParteService parteService,
      CuadernoService cuadernoService,
      CuadernoParteService cuadernoParteService) {
    this.causaDAO = causaDAO;
    this.parteService = parteService;
    this.cuadernoService = cuadernoService;
    this.cuadernoParteService = cuadernoParteService;
  }

  @Override
  public CausaVO buscarId(Long id) {
    CausaVO causaVO = new CausaVO();
    TribunalVO tribunalVO = new TribunalVO();
    CompetenciaVO competenciaVO = new CompetenciaVO();
    Causa causa = this.causaDAO.buscarId(id);
    if(causa != null){
      causaVO.setId(causa.getId());
      causaVO.setRolCausa(causa.getRolCausa());
      causaVO.setEraCausa(causa.getEraCausa());
      causaVO.setTipoCausa(causa.getTipoCausa());
      causaVO.setGlosaParte(causa.getGlosaParte());
      causaVO.setFechaIngresoCausa(causa.getFechaIngresoCausa());
      causaVO.setFechaIngresoSistema(causa.getFechaIngresoSistema());
      tribunalVO.setGlosa(causa.getTribunal().getGlosa());
      tribunalVO.setId(causa.getTribunal().getId());
      competenciaVO.setGlosa(causa.getCompetencia().getGlosa());
      competenciaVO.setId(causa.getCompetencia().getId());
      causaVO.setTribunalVO(tribunalVO);
      causaVO.setCompetenciaVO(competenciaVO);
      causaVO.setFechaModificacion(causa.getFechaModificacion());
    }else{
      causaVO.setId(-1L);
    }
    return causaVO;
  }

  @Override
  public CausaVO buscarCausa(Long rolCausa, String eraCausa, char tipoCausa, Long idTribunal, Long idCompetencia) {
    Causa causa = new Causa();
    CausaVO causaVO = new CausaVO();
    TribunalVO tribunalVO = new TribunalVO();
    CompetenciaVO competenciaVO = new CompetenciaVO();
    causa = this.causaDAO.buscarCausa(rolCausa, eraCausa, tipoCausa, idTribunal, idCompetencia);
    if(causa.getId() != -1L){
      causaVO.setId(causa.getId());
      causaVO.setRolCausa(causa.getRolCausa());
      causaVO.setEraCausa(causa.getEraCausa());
      causaVO.setTipoCausa(causa.getTipoCausa());
      causaVO.setGlosaParte(causa.getGlosaParte());
      causaVO.setFechaIngresoCausa(causa.getFechaIngresoCausa());
      causaVO.setFechaIngresoSistema(causa.getFechaIngresoSistema());
      tribunalVO.setGlosa(causa.getTribunal().getGlosa());
      competenciaVO.setGlosa(causa.getCompetencia().getGlosa());
      causaVO.setTribunalVO(tribunalVO);
      causaVO.setCompetenciaVO(competenciaVO);
      causaVO.setFechaModificacion(causa.getFechaModificacion());
    }else{
      causaVO.setId(-1L);
    }

    return causaVO;
  }

  @Override
  public List<CausaVO> buscarCausaFecha(List<Long> competencias, String fechaInicio, String fechaFinal) {
    List<Causa> causas = causaDAO.buscarCausaFecha(competencias, fechaInicio, fechaFinal);
    List<CausaVO> causasNuevas = new ArrayList<>();
    causas.forEach(causa ->{
      TribunalVO tribunalVO = new TribunalVO();
      CompetenciaVO competenciaVO = new CompetenciaVO();
      CausaVO causaVO = new CausaVO();
      causaVO.setId(causa.getId());
      causaVO.setRolCausa(causa.getRolCausa());
      causaVO.setEraCausa(causa.getEraCausa());
      causaVO.setTipoCausa(causa.getTipoCausa());
      causaVO.setGlosaParte(causa.getGlosaParte());
      causaVO.setFechaIngresoCausa(causa.getFechaIngresoCausa());
      causaVO.setFechaIngresoSistema(causa.getFechaIngresoSistema());
      tribunalVO.setId(causa.getTribunal().getId());
      tribunalVO.setGlosa(causa.getTribunal().getGlosa());
      competenciaVO.setId(causa.getCompetencia().getId());
      competenciaVO.setGlosa(causa.getCompetencia().getGlosa());
      causaVO.setTribunalVO(tribunalVO);
      causaVO.setCompetenciaVO(competenciaVO);
      causaVO.setFechaModificacion(causa.getFechaModificacion());
      causasNuevas.add(causaVO);
    });
    return causasNuevas;
  }

  @Override
  public List<CausaVO> buscarCausasPorParte(CausaVO causaVO) {
    List<CausaVO> nuevasCausas = new ArrayList<>();
    List<CausaVO> causaVOS = this.buscarCausaFecha(causaVO.getCompetencias(), causaVO.getFechaInicio(), causaVO.getFechaFinal());
    if(!causaVOS.isEmpty()){
      List<ParteVO> parteVOS = this.parteService.buscarPartes(causaVO.getIdUsuario(), causaVO.getCompetencias());
      if(!parteVOS.isEmpty()){
        parteVOS.forEach(partes ->{
          List<CuadernoParteVO> cuadernoParteVOS = this.cuadernoParteService.buscarCuadernoPartes(partes.getId());
          if(!cuadernoParteVOS.isEmpty()){
            cuadernoParteVOS.forEach(cuadernoParteVO -> {
              CuadernoVO cuadernoVO = this.cuadernoService.buscarId(cuadernoParteVO.getCuadernoVO().getId());
              causaVOS.forEach(causa ->{
                if(causa.getId().equals(cuadernoVO.getCausa().getId())){
                  nuevasCausas.add(causa);
                }
              });
            });
          }
        });
      }
    }
    return nuevasCausas;
  }
}
