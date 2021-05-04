package usuario.causa.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import usuario.causa.model.UsuarioVO;
import usuario.causa.service.UsuarioService;

@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST})
@RequestMapping("usuario-causa")
public class UsuarioController {

  private static final Log logger = LogFactory.getLog(UsuarioController.class);
  private final UsuarioService usuarioService;

  @Autowired
  public UsuarioController(UsuarioService usuarioService) {
    this.usuarioService = usuarioService;
  }

  @GetMapping(value = "/buscar-id/{id}")
  public UsuarioVO buscarId(@PathVariable("id") Long id){
    logger.info("CONTROLLER BUSCAR ID USUARIO");
    return this.usuarioService.buscarId(id);
  }

  @PostMapping(value = "/guardar-usuario/", consumes = "application/json; charset=utf-8")
  public UsuarioVO guardarUsuario(@RequestBody UsuarioVO usuarioVO){
    logger.info("CONTROLLER GUARDAR USUARIO");
    return this.usuarioService.guardarUsuario(usuarioVO);
  }

  @GetMapping(value = "/buscar-usuario/{codUsuario}/{password}")
  public UsuarioVO buscarUsuario(@PathVariable("codUsuario") Long codUsuario, @PathVariable("password") String password){
    logger.info("CONTROLLER BUSCAR USUARIO");
    return this.usuarioService.buscarUsuario(codUsuario, password);
  }

  @GetMapping(value = "/buscar-por-rut/{codUsuario}")
  public UsuarioVO buscarPorRut(@PathVariable("codUsuario") Long codUsuario){
    logger.info("CONTROLLER BUSCAR POR RUT");
    return this.usuarioService.porRut(codUsuario);
  }

  @PostMapping(value = "/bloquear-usuario/", consumes = "application/json; charset=utf-8")
  public UsuarioVO bloquearUsuario(@RequestBody UsuarioVO usuarioVO){
    logger.info("CONTROLLER BLOQUEAR USUARIO");
    return this.usuarioService.usuarioBloqueado(usuarioVO);
  }

  @PostMapping(value = "/modificar-usuario/", consumes = "application/json; charset=utf-8")
  public UsuarioVO modificarUsuario(@RequestBody UsuarioVO usuarioVO){
    logger.info("CONTROLLER MODIFICAR USUARIO");
    return this.usuarioService.modificarUsuario(usuarioVO);
  }
}
