package usuario.causa.service;

import usuario.causa.model.UsuarioVO;

public interface UsuarioService {

  UsuarioVO guardarUsuario(UsuarioVO usuario);

  UsuarioVO buscarUsuario(Long codUsuario, String password);

  UsuarioVO persistirUsuario(UsuarioVO usuarioVO);

  UsuarioVO porRut(Long codUsuario);

  UsuarioVO usuarioBloqueado(UsuarioVO usuarioVO);

}
