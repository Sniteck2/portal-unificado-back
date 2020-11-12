package usuario.causa.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import usuario.causa.model.TribunalVO;
import usuario.causa.service.TribunalService;

@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST})
@RequestMapping("tribunal")
public class TribunalController {

  private final TribunalService tribunalService;

  @Autowired
  public TribunalController(TribunalService tribunalService) {
    this.tribunalService = tribunalService;
  }

  @GetMapping(value = "/listar-tribunales/")
  List<TribunalVO> listarTribunales() {
    return this.tribunalService.listarTribunales();
  }

}
