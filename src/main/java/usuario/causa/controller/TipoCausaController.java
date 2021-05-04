package usuario.causa.controller;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import usuario.causa.model.TipoCausaVO;
import usuario.causa.service.TipoCausaService;

@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST})
@RequestMapping("tipo-causa")
public class TipoCausaController {

  private static final Log logger = LogFactory.getLog(TipoCausaController.class);
  private final TipoCausaService tipoCausaService;

  @Autowired
  public TipoCausaController(TipoCausaService tipoCausaService) {
    this.tipoCausaService = tipoCausaService;
  }

  @GetMapping(value = "/listar-tipo-causas")
  List<TipoCausaVO> listarTipoCausas(){
    logger.info("CONTROLLER LISTAR TIPO CAUSAS");
    return this.tipoCausaService.listarTipoCausas();
  }

}
