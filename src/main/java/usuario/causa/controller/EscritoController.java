package usuario.causa.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import usuario.causa.model.EscritoVO;
import usuario.causa.service.EscritoService;

@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST})
@RequestMapping("escrito")
public class EscritoController {

  private final EscritoService escritoService;

  @Autowired
  public EscritoController(EscritoService escritoService) {
    this.escritoService = escritoService;
  }

  @GetMapping(value = "/listar-por-id-cuaderno/{idCuaderno}")
  List<EscritoVO> listarPorIdCuaderno(@PathVariable("idCuaderno") Long idCuaderno){
    return this.escritoService.listarPorIdCuaderno(idCuaderno);
  }
}
