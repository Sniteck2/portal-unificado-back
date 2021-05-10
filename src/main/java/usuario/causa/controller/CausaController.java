package usuario.causa.controller;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import usuario.causa.model.CausaVO;
import usuario.causa.service.CausaService;

@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST})
@RequestMapping("causa")
public class CausaController {

  private static final Log logger = LogFactory.getLog(CausaController.class);
  private final CausaService causaService;

  @Autowired
  public CausaController(CausaService causaService) {
    this.causaService = causaService;
  }

  @GetMapping(value = "/buscar-id/{id}")
  CausaVO buscarId(@PathVariable("id") Long id){
    logger.info("CONTROLLER CAUSA BUSCA ID");
    return this.causaService.buscarId(id);
  }

  @GetMapping(value = "/buscar-causa/{rolCausa}/{eraCausa}/{tipoCausa}/{idTribunal}/{idCompetencia}")
  CausaVO buscarCausa(@PathVariable("rolCausa") Long rolCausa,
      @PathVariable("eraCausa") String eraCausa, @PathVariable("tipoCausa") String tipoCausa,
      @PathVariable("idTribunal") Long idTribunal,
      @PathVariable("idCompetencia") Long idCompetencia){
    logger.info("CONTROLLER BUSCAR CAUSA");
    return this.causaService.buscarCausa(rolCausa, eraCausa, tipoCausa, idTribunal, idCompetencia);
  }

  @GetMapping(value = "/buscar-causa-fecha/{idCompetencia}/{fechaInicio}/{fechaFinal}")
  List<CausaVO> buscarCausaFecha(@PathVariable("idCompetencia") List<Long> idCompetencia,
      @PathVariable("fechaInicio") String fechaInicio,
      @PathVariable("fechaFinal") String fechaFinal){
    logger.info("CONTROLLER BUSCAR CAUSA FECHA");
    return this.causaService.buscarCausaFecha(idCompetencia, fechaInicio, fechaFinal);
  };

  @PostMapping(value = "/buscar-causas-usuario-fecha/", consumes = "application/json; charset=utf-8")
  List<CausaVO> buscarCausasPorParte(@RequestBody CausaVO causaVO){
    logger.info("CONTROLLER BUSCAR CAUSA USUARIO FECHA");
    return this.causaService.buscarCausasPorParte(causaVO);
  }

}
