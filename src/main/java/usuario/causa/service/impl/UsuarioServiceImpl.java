package usuario.causa.service.impl;

import java.util.Date;
import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import usuario.causa.model.UsuarioVO;
import usuario.causa.repository.UsuarioDAO;
import usuario.causa.repository.model.Usuario;
import usuario.causa.service.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService {

  private final Log logger = LogFactory.getLog("usuario-service");
  private final UsuarioDAO usuarioDAO;

  @Autowired
  public UsuarioServiceImpl(UsuarioDAO usuarioDAO) {
    this.usuarioDAO = usuarioDAO;
  }

  @Override
  public UsuarioVO buscarId(Long id) {
    Usuario usuario = this.usuarioDAO.buscarId(id);
    UsuarioVO usuarioVO = new UsuarioVO();
    usuarioVO.setId(usuario.getId());
    usuarioVO.setPassword(usuario.getPassword());
    usuarioVO.setCodUsuario(usuario.getCodUsuario());
    usuarioVO.setRut(usuario.getRut());
    usuarioVO.setDv(usuario.getDv());
    usuarioVO.setNombre(usuario.getNombre());
    usuarioVO.setAppPaterno(usuario.getAppPaterno());
    usuarioVO.setAppMaterno(usuario.getAppMaterno());
    usuarioVO.setCorreo(usuario.getCorreo());
    usuarioVO.setSexo(usuario.getSexo());
    usuarioVO.setFlgActivo(usuario.getFlgActivo());
    usuarioVO.setFechaNacimiento(usuario.getFechaNacimiento());
    return usuarioVO;
  }

  @Override
  @Transactional
  public UsuarioVO guardarUsuario(UsuarioVO usuarioVO) {
    logger.info("--guardar usuario: " + usuarioVO.toString());
    UsuarioVO nuevoUsuario = new UsuarioVO();
    nuevoUsuario = this.porRut(usuarioVO.getCodUsuario());
    if(nuevoUsuario.getId() == -1){
      nuevoUsuario = this.persistirUsuario(usuarioVO);
    }else{
      nuevoUsuario.setId(-2L);
    }
    logger.info("--guardar usuario salida : " + nuevoUsuario.toString());
    return nuevoUsuario;
  }

  @Override
  @Transactional
  public UsuarioVO buscarUsuario(Long codUsuario, String password) {
    UsuarioVO usuarioVO = new UsuarioVO();
    Usuario usuario = this.usuarioDAO.buscarUsuario(codUsuario, password);
    usuarioVO.setId(usuario.getId());
    usuarioVO.setCodUsuario(usuario.getCodUsuario());
    usuarioVO.setRut(usuario.getRut());
    usuarioVO.setDv(usuario.getDv());
    usuarioVO.setNombre(usuario.getNombre());
    usuarioVO.setAppPaterno(usuario.getAppPaterno());
    usuarioVO.setAppMaterno(usuario.getAppMaterno());
    usuarioVO.setCorreo(usuario.getCorreo());
    usuarioVO.setSexo(usuario.getSexo());
    usuarioVO.setFlgActivo(usuario.getFlgActivo());
    usuarioVO.setFechaNacimiento(usuario.getFechaNacimiento());
    return usuarioVO;
  }

  @Override
  public UsuarioVO persistirUsuario(UsuarioVO usuarioVO) {
    Usuario usuario = new Usuario();
    usuario.setCodUsuario(usuarioVO.getCodUsuario());
    usuario.setPassword(usuarioVO.getPassword());
    usuario.setRut(usuarioVO.getRut());
    usuario.setDv(usuarioVO.getDv());
    usuario.setNombre(usuarioVO.getNombre());
    usuario.setAppPaterno(usuarioVO.getAppPaterno());
    usuario.setAppMaterno(usuarioVO.getAppMaterno());
    usuario.setCorreo(usuarioVO.getCorreo());
    usuario.setNumeroIntentos(0L);
    usuario.setFlgActivo(1L);
    usuario.setFechaCreacion(new Date());
    usuario.setFechaUltimoAcceso(new Date());
    usuario.setSexo(usuarioVO.getSexo());
    usuario.setFechaNacimiento(usuarioVO.getFechaNacimiento());
    usuario = this.usuarioDAO.guardarUsuario(usuario);
    return usuarioVO;
  }

  @Override
  public UsuarioVO porRut(Long codUsuario) {
    UsuarioVO usuarioVO = new UsuarioVO();
    Usuario usuario = this.usuarioDAO.porRut(codUsuario);
    usuarioVO.setId(usuario.getId());
    usuarioVO.setFlgActivo(usuario.getFlgActivo());
    return usuarioVO;
  }

  @Override
  @Transactional
  public UsuarioVO usuarioBloqueado(UsuarioVO usuarioVO) {
    Usuario usuario = this.usuarioDAO.porRut(usuarioVO.getCodUsuario());
    if(usuario.getId() != -1){
      usuario.setFlgActivo(0L);
      usuario.setFechaBloqueo(new Date());
      usuario.setNumeroIntentos(usuario.getNumeroIntentos() + 1L);
      usuarioVO.setFlgActivo(usuario.getFlgActivo());
      usuarioVO.setFechaBloqueo(usuario.getFechaBloqueo());
    }else{
      usuarioVO.setCodUsuario(0L);
    }
    return usuarioVO;
  }

  @Override
  @Transactional
  public UsuarioVO modificarUsuario(UsuarioVO usuarioVO) {
    Usuario usuario = this.usuarioDAO.buscarId(usuarioVO.getId());
    if(usuarioVO.getFechaNacimiento() != null){
      usuario.setFechaNacimiento(usuarioVO.getFechaNacimiento());
    }
    if(usuarioVO.getCorreo() != null){
      usuario.setCorreo(usuarioVO.getCorreo());
    }
    if(usuarioVO.getPassword() != null){
      usuario.setPassword(usuarioVO.getPassword());
    }
    return usuarioVO;
  }
}
