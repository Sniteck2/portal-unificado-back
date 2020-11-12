package usuario.causa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import usuario.causa.model.CausaVO;
import usuario.causa.service.CausaService;

@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST})
@RequestMapping("causa")
public class CausaController {

  private final CausaService causaService;

  @Autowired
  public CausaController(CausaService causaService) {
    this.causaService = causaService;
  }

  @GetMapping(value = "/buscar-causa/{rolCausa}/{eraCausa}/{tipoCausa}/{idTribunal}/{idCompetencia}")
  CausaVO buscarCausa(@PathVariable("rolCausa") Long rolCausa,
      @PathVariable("eraCausa") String eraCausa, @PathVariable("tipoCausa") char tipoCausa,
      @PathVariable("idTribunal") Long idTribunal,
      @PathVariable("idCompetencia") Long idCompetencia){
    return this.causaService.buscarCausa(rolCausa, eraCausa, tipoCausa, idTribunal, idCompetencia);
  }
}
