package usuario.causa.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import usuario.causa.model.CuadernoParteVO;
import usuario.causa.service.CuadernoParteService;

@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST})
@RequestMapping("cuadernoParte")
public class CuadernoParteController {

  private final CuadernoParteService cuadernoParteService;

  @Autowired
  public CuadernoParteController(CuadernoParteService cuadernoParteService) {
    this.cuadernoParteService = cuadernoParteService;
  }

  @GetMapping(value = "/buscar-cuaderno-partes/{idParte}")
  List<CuadernoParteVO> buscarCuadernoPartes(@PathVariable("idParte") Long idParte){
    return this.cuadernoParteService.buscarCuadernoPartes(idParte);
  }

}
