package usuario.causa.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import usuario.causa.model.TramiteVO;
import usuario.causa.service.TramiteService;

@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST})
@RequestMapping("tramite")
public class TramiteController {

  private final TramiteService tramiteService;

  @Autowired
  public TramiteController(TramiteService tramiteService) {
    this.tramiteService = tramiteService;
  }

  @GetMapping(value = "/listar-tramite-por-causa/{idCausa}")
  List<TramiteVO> listarPorIdCausa(@PathVariable("idCausa") Long idCausa){
    return this.tramiteService.listarPorIdCausa(idCausa);
  }
}
