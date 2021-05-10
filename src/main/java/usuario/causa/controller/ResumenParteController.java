package usuario.causa.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import usuario.causa.model.ResumenParteVO;
import usuario.causa.service.ResumenParteService;

@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST})
@RequestMapping("resumen-parte")
public class ResumenParteController {

  private final ResumenParteService resumenParteService;

  @Autowired
  public ResumenParteController(ResumenParteService resumenParteService) {
    this.resumenParteService = resumenParteService;
  }

  @GetMapping(value = "/listar-todo/")
  List<ResumenParteVO> listarTodo(){
    return this.resumenParteService.listarTodo();
  }
}
