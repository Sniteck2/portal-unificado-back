package usuario.causa.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import usuario.causa.model.ResumenCausaVO;
import usuario.causa.service.ResumenCausaService;

@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST})
@RequestMapping("resumen-causa")
public class ResumenCausaController {

  private final ResumenCausaService resumenCausaService;

  @Autowired
  public ResumenCausaController(ResumenCausaService resumenCausaService) {
    this.resumenCausaService = resumenCausaService;
  }

  @GetMapping(value = "/listar-todo/")
  List<ResumenCausaVO> listarTodo(){
   return this.resumenCausaService.listarTodo();
  }
}
