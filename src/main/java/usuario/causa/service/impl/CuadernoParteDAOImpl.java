package usuario.causa.service.impl;

import java.util.Collections;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import usuario.causa.repository.CuadernoParteDAO;
import usuario.causa.repository.model.CuadernoParte;
import usuario.causa.repository.model.Parte;

@Repository
public class CuadernoParteDAOImpl implements CuadernoParteDAO {

  private final EntityManager em;

  @Autowired
  public CuadernoParteDAOImpl(EntityManager em) {
    this.em = em;
  }

  @Override
  public List<CuadernoParte> buscarCuadernoPartes(Long idParte) {
    TypedQuery<CuadernoParte> query = em.createQuery("FROM CuadernoParte cp WHERE cp.parte =: parte", CuadernoParte.class);
    Parte parte = new Parte();
    parte.setId(idParte);
    query.setParameter("parte", parte);
    return query.getResultList().isEmpty() ? Collections.emptyList() : query.getResultList();
  }
}
