package usuario.causa.repository;

import usuario.causa.repository.model.Usuario;

public interface UsuarioDAO {

  Usuario buscarId(Long id);

  Usuario guardarUsuario(Usuario usuario);

  Usuario buscarUsuario(Long codUsuario, String password);

  Usuario porRut(Long codUsuario);

}
