package usuario.causa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import usuario.causa.model.ResumenETLVO;
import usuario.causa.service.ResumenETLService;

@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST})
@RequestMapping("resumen-etl")
public class ResumenETLController {

  private final ResumenETLService resumenETLService;

  @Autowired
  public ResumenETLController(ResumenETLService resumenETLService) {
    this.resumenETLService = resumenETLService;
  }

  @GetMapping(value = "/listar-todo/")
  ResumenETLVO listarTodo(){
    return this.resumenETLService.listarTodo();
  }
}
