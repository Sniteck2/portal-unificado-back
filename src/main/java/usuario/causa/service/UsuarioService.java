package usuario.causa.service;

import usuario.causa.model.UsuarioVO;

public interface UsuarioService {

  UsuarioVO buscarId(Long id);

  UsuarioVO guardarUsuario(UsuarioVO usuario);

  UsuarioVO buscarUsuario(Long codUsuario, String password);

  UsuarioVO persistirUsuario(UsuarioVO usuarioVO);

  UsuarioVO porRut(Long codUsuario);

  UsuarioVO usuarioBloqueado(UsuarioVO usuarioVO);

  UsuarioVO modificarUsuario(UsuarioVO usuarioVO);

}
