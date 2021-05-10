package usuario.causa.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import usuario.causa.model.ResumenETLVO;
import usuario.causa.service.ResumenCausaService;
import usuario.causa.service.ResumenCuadernoService;
import usuario.causa.service.ResumenETLService;
import usuario.causa.service.ResumenEscritoService;
import usuario.causa.service.ResumenParteService;
import usuario.causa.service.ResumenTramiteService;

@Service
public class ResumenETLServiceImpl implements ResumenETLService {

  private final ResumenCausaService resumenCausaService;
  private final ResumenCuadernoService resumenCuadernoService;
  private final ResumenEscritoService resumenEscritoService;
  private final ResumenParteService resumenParteService;
  private final ResumenTramiteService resumenTramiteService;

  @Autowired
  public ResumenETLServiceImpl(ResumenCausaService resumenCausaService,
      ResumenCuadernoService resumenCuadernoService,
      ResumenEscritoService resumenEscritoService,
      ResumenParteService resumenParteService,
      ResumenTramiteService resumenTramiteService) {
    this.resumenCausaService = resumenCausaService;
    this.resumenCuadernoService = resumenCuadernoService;
    this.resumenEscritoService = resumenEscritoService;
    this.resumenParteService = resumenParteService;
    this.resumenTramiteService = resumenTramiteService;
  }

  @Override
  public ResumenETLVO listarTodo() {
    ResumenETLVO resumenETLVO = new ResumenETLVO();
    resumenETLVO.setResumenCausaVOS(this.resumenCausaService.listarTodo());
    resumenETLVO.setResumenCuadernoVOS(this.resumenCuadernoService.listarTodo());
    resumenETLVO.setResumenEscritoVOS(this.resumenEscritoService.listarTodo());
    resumenETLVO.setResumenParteVOS(this.resumenParteService.listarTodo());
    resumenETLVO.setResumenTramiteVOS(this.resumenTramiteService.listarTodo());
    return resumenETLVO;
  }
}
