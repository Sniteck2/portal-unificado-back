package usuario.causa.repository.impl;

import javax.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import usuario.causa.repository.CuadernoDAO;
import usuario.causa.repository.model.Cuaderno;

@Repository
public class CuadernoDAOImpl implements CuadernoDAO {

  private final EntityManager em;

  @Autowired
  public CuadernoDAOImpl(EntityManager em) {
    this.em = em;
  }

  @Override
  public Cuaderno buscarId(Long id) {
    return em.find(Cuaderno.class, id);
  }
}
