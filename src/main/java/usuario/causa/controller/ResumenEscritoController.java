package usuario.causa.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import usuario.causa.model.ResumenEscritoVO;
import usuario.causa.service.ResumenEscritoService;

@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST})
@RequestMapping("resumen-escrito")
public class ResumenEscritoController {

  private final ResumenEscritoService resumenEscritoService;

  @Autowired
  public ResumenEscritoController(ResumenEscritoService resumenEscritoService) {
    this.resumenEscritoService = resumenEscritoService;
  }

  @GetMapping(value = "/listar-todo/")
  List<ResumenEscritoVO> listarTodo() {
    return this.resumenEscritoService.listarTodo();
  }
}
