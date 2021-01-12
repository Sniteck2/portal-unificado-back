package usuario.causa.controller;

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

  private final UsuarioService usuarioService;

  @Autowired
  public UsuarioController(UsuarioService usuarioService) {
    this.usuarioService = usuarioService;
  }

  @GetMapping(value = "/buscar-id/{id}")
  public UsuarioVO buscarId(@PathVariable("id") Long id){
    return this.usuarioService.buscarId(id);
  }

  @PostMapping(value = "/guardar-usuario/", consumes = "application/json; charset=utf-8")
  public UsuarioVO guardarUsuario(@RequestBody UsuarioVO usuarioVO){
    return this.usuarioService.guardarUsuario(usuarioVO);
  }

  @GetMapping(value = "/buscar-usuario/{codUsuario}/{password}")
  public UsuarioVO buscarUsuario(@PathVariable("codUsuario") Long codUsuario, @PathVariable("password") String password){
    return this.usuarioService.buscarUsuario(codUsuario, password);
  }

  @GetMapping(value = "/buscar-por-rut/{codUsuario}")
  public UsuarioVO buscarPorRut(@PathVariable("codUsuario") Long codUsuario){
    return this.usuarioService.porRut(codUsuario);
  }

  @PostMapping(value = "/bloquear-usuario/", consumes = "application/json; charset=utf-8")
  public UsuarioVO bloquearUsuario(@RequestBody UsuarioVO usuarioVO){
    return this.usuarioService.usuarioBloqueado(usuarioVO);
  }

  @PostMapping(value = "/modificar-usuario/", consumes = "application/json; charset=utf-8")
  public UsuarioVO modificarUsuario(@RequestBody UsuarioVO usuarioVO){
    return this.usuarioService.modificarUsuario(usuarioVO);
  }
}
