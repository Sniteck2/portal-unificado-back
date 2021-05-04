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
import usuario.causa.model.ParteVO;
import usuario.causa.service.ParteService;

@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST})
@RequestMapping("parte")
public class ParteController {

  private static final Log logger = LogFactory.getLog(ParteController.class);
  private final ParteService parteService;

  @Autowired
  public ParteController(ParteService parteService) {
    this.parteService = parteService;
  }

  @GetMapping(value = "/buscar-partes/{idUsuario}/{idCompetencia}")
  List<ParteVO> buscarPartes(@PathVariable("idUsuario") Long idUsuario, @PathVariable("idCompetencia") List<Long> idCompetencia){
    logger.info("CONTROLLER BUSCAR PARTES");
    return this.parteService.buscarPartes(idUsuario, idCompetencia);
  }

}
