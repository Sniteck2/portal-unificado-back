package usuario.causa.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import usuario.causa.model.CuadernoVO;
import usuario.causa.service.CuadernoService;

@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST})
@RequestMapping("cuaderno")
public class CuadernoController {

  private static final Log logger = LogFactory.getLog(CuadernoController.class);
  private final CuadernoService cuadernoService;

  @Autowired
  public CuadernoController(CuadernoService cuadernoService) {
    this.cuadernoService = cuadernoService;
  }

  @GetMapping(value = "/buscar-id/{id}")
  CuadernoVO buscarId(@PathVariable("id") Long id){
    logger.info("CONTROLLER BUSCAR ID CUADERNO");
    return this.cuadernoService.buscarId(id);
  }

}
