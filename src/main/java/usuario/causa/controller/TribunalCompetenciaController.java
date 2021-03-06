package usuario.causa.controller;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import usuario.causa.model.TribunalVO;
import usuario.causa.service.TribunalCompetenciaService;

@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST})
@RequestMapping("tribunal-competencia")
public class TribunalCompetenciaController {

  private static final Log logger = LogFactory.getLog(TribunalCompetenciaController.class);
  private final TribunalCompetenciaService tribunalCompetenciaService;

  @Autowired
  public TribunalCompetenciaController(
      TribunalCompetenciaService tribunalCompetenciaService) {
    this.tribunalCompetenciaService = tribunalCompetenciaService;
  }

  @GetMapping(value = "/tribunal-por-competencia/{idCompetencia}")
  List<TribunalVO> listarTribunalPorCompetencia(@PathVariable("idCompetencia") Long idCompetencia){
    logger.info("CONTROLLER LISTAR TRIBUNAL POR COMPETENCIA");
    return this.tribunalCompetenciaService.listarTribunalPorCompetencia(idCompetencia);
  }
}
