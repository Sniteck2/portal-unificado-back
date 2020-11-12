package usuario.causa.repository.impl;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;
import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import usuario.causa.repository.UsuarioDAO;
import usuario.causa.repository.model.Usuario;

@Repository
public class UsuarioDAOImpl implements UsuarioDAO {

  private final Log logger = LogFactory.getLog("usuario-login");
  private final EntityManager em;

  @Autowired
  public UsuarioDAOImpl(EntityManager em) {
    this.em = em;
  }

  @Override
  @Transactional
  public Usuario guardarUsuario(Usuario usuario) {
    em.persist(usuario);
    return usuario;
  }

  @Override
  @Transactional
  public Usuario buscarUsuario(Long codUsuario, String password) {
    Usuario usuario = new Usuario();
    try{
      TypedQuery<Usuario> query = em.createQuery("FROM Usuario u WHERE u.codUsuario = :codUsuario AND u.password = :password", Usuario.class);
      query.setParameter("codUsuario", codUsuario);
      query.setParameter("password", password);
      usuario = query.getSingleResult();
    }catch(NoResultException result){
      usuario = new Usuario();
      usuario.setId(-1L);
      logger.warn("error: " + result.getLocalizedMessage());
    }
    return usuario;
  }

  @Override
  @Transactional
  public Usuario porRut(Long codUsuario) {
    Usuario usuario = new Usuario();
    try{
      TypedQuery<Usuario> query = em.createQuery("FROM Usuario u WHERE u.codUsuario = :codUsuario", Usuario.class);
      query.setParameter("codUsuario", codUsuario);
      usuario = query.getSingleResult();
    }catch(NoResultException result){
      usuario = new Usuario();
      usuario.setId(-1L);
      logger.warn("error: " + result.getLocalizedMessage());
    }
    return usuario;
  }
}
