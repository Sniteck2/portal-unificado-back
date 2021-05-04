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
import usuario.causa.model.TipoCausaVO;
import usuario.causa.service.CompetenciaTipoCausaService;

@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST})
@RequestMapping("competencia-tipo-causa")
public class CompetenciaTipoCausaController {

  private static final Log logger = LogFactory.getLog(CompetenciaTipoCausaController.class);
  private final CompetenciaTipoCausaService competenciaTipoCausaService;

  @Autowired
  public CompetenciaTipoCausaController(
      CompetenciaTipoCausaService competenciaTipoCausaService) {
    this.competenciaTipoCausaService = competenciaTipoCausaService;
  }

  @GetMapping("/listar-comp-tipo-causa/{idCompetencia}")
  List<TipoCausaVO> listarCompTipoCausa(@PathVariable("idCompetencia") Long idCompetencia){
    logger.info("CONTROLLER LISTAR COMPETENCIA TIPO CAUSA");
    return this.competenciaTipoCausaService.listarTipoCausaPorCompetencia(idCompetencia);
  }

}
