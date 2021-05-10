package usuario.causa.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import usuario.causa.model.ResumenTramiteVO;
import usuario.causa.service.ResumenTramiteService;

@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST})
@RequestMapping("resumen-tramite")
public class ResumenTramiteController {

  private final ResumenTramiteService resumenTramiteService;

  @Autowired
  public ResumenTramiteController(ResumenTramiteService resumenTramiteService) {
    this.resumenTramiteService = resumenTramiteService;
  }

  @GetMapping(value = "/listar-todo/")
  List<ResumenTramiteVO> listarTodo(){
    return this.resumenTramiteService.listarTodo();
  }
}
